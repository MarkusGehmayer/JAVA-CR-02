public class IntervalWorkout {
    private String[] exercises;
    private int breakTime;
    private int totalRounds;

    public IntervalWorkout(String[] exercises, int breakTime, int totalRounds) {
        this.exercises = exercises;
        this.breakTime = breakTime;
        this.totalRounds = totalRounds;
    }

    public int getBreaktime() {
        return breakTime;
    }

    public void setBreaktime(int breakTime) {
        this.breakTime = breakTime;
    }

    public void createIntervalWorkout() {
        System.out.println("*******************************");
        System.out.println("* S T A R T  with your train! *");
        System.out.println("*******************************");

        for(int i = 1; i <= this.totalRounds; i++) {
            System.out.println("LAP: " + i);
                for(int j = 0; j < exercises.length; j++ ) {
                    System.out.println("- "+this.exercises[j]);
                }

            // break time < rounds
            if (i < this.totalRounds) {
                System.out.println(" _______________________________");
                System.out.println("|Time for a  B R E A K (" + getBreaktime() + " sec.)|");
                System.out.println("|_______________________________|");
            }
        }

        // Output when array length reached
        System.out.println("= = = = = = = = = = = = = = = =");
        System.out.println("Y E A H - training accomplished");
        System.out.println("= = = = = = = = = = = = = = = =");
    }
}
