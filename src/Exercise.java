public class Exercise {
    private String exerciseName;
    private String description;
    private int duration;
    private String position;

    public Exercise(String exerciseName, String description, int duration, String position) {
        this.exerciseName = exerciseName;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    // gets
    public String getExerciseName() {
        return exerciseName;
    }
    public String getDescription() {
        return description;
    }
    public int getDuration() {
        return duration;
    }
    public String getPosition() {
        return position;
    }

    // sets
    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    // Ausgabe exes
    public String printExercise() {
        String output = this.exerciseName + "\n* * * * * * * * * * * * * * * * * * * * * * * * * * " +
                "\nDuration: " + this.duration + " sec." + "\n" +
                "Description: " + this.description + "\n";
        return output;
    }
}