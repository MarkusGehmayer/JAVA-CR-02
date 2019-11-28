// CodeReview 02

public class Main {
    public static void main(String[] args) {
        Exercise train1 = new Exercise(
                "Push-Ups",
                "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet.\n" +
                        "Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.",
                30,
                "Floor");

        Exercise train2 = new Exercise(
                "Planks",
                "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart.\n" +
                        "Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.",
                90,
                "Floor");

        Exercise train3 = new Exercise(
                "Squats",
                " Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. \n" +
                        "Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.",
                45,
                "Standing");

        Exercise train4 = new Exercise(
                "Backward Kick",
                "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.\n" +
                        "Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.",
                60,
                "Floor");

        Exercise train5 = new Exercise(
                "Leg Curl",
                "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.",
                90,
                "Standing");

        Exercise train6 = new Exercise(
                "Sidewards Back Stretch",
                "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.",
                60,
                "Standing");

        // exes with the printExercise method
        System.out.println("Ausgabe mit printExercise method: \n");
        System.out.println(train1.printExercise());
        System.out.println(train2.printExercise());
        System.out.println(train3.printExercise());
        System.out.println(train4.printExercise());
        System.out.println(train5.printExercise());
        System.out.println(train6.printExercise());
        System.out.println("");
        
        // all exes into an array and print them
        Exercise allExes[] = {train1, train2, train3, train4, train5, train6};
        
        for(int i = 0; i < allExes.length; i++) {
            System.out.println("Ausgabe for loop - alle Exercises: ");
            System.out.println("____________________________________________________________________________");
            System.out.println(allExes[i].printExercise() + "\n");
            System.out.println("_____________________________________________________________________________");
            System.out.println("");
        }

        // print exes only: floor
        for(int i = 0; i < allExes.length; i++) {
            if (allExes[i].getPosition() == "Floor") {
                System.out.println("Ausgabe for loop - alle Exercises mit Position floor: ");
                System.out.println("_____________________________________________________________________________");
                System.out.println(allExes[i].printExercise() + "\n");
                System.out.println("_____________________________________________________________________________");
                System.out.println("");
            }
        }

        // print exes only: floor > 60 sec.
        for(int i = 0; i < allExes.length; i++) {
            if(allExes[i].getPosition() == "Floor" && allExes[i].getDuration() > 60) {
                System.out.println("Ausgabe for loop - alle Exercises mit Position floor > 60 sec. : ");
                System.out.println("_____________________________________________________________________________");
                System.out.println(allExes[i].printExercise());
                System.out.println("");
            }
        }

        // new array with workout + interval obj.
        String[] exercises = {"Push-ups", "Squats", "Planks"};
        IntervalWorkout iworkout = new IntervalWorkout(exercises, 30, 4);
        iworkout.createIntervalWorkout();
    }
}