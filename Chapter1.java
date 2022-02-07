import java.util.Scanner;

public class Chapter1 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3", "Sample Exercise"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    exercise1(in);
                    break;
                case 2:
                    exercise2(in);
                    break;
                case 3:
                    exercise3(in);
                    break;
                case 4:
                    sampleExercise(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        // Your code 
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        // Your code here
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        // Your code here
    }

    public void sampleExercise(Scanner in) {
        UIUtility.showMenuTitle("Sample Exercise");
        String name = InputUtility.getString("What is your name?", in);
        System.out.printf("%n Hello %s!", name);

        int favNum = InputUtility.getInt("What is your favorite number?", in);
        System.out.printf("%n Your favorite number is %d.", favNum);

        int age = InputUtility.getIntInRange("How old are you (in years)? ", 0, 100, in);
        System.out.printf("%n You are %d years old.", age);

        double temperature = InputUtility.getDouble("What is body temperature (in fahrenheit)? ", in);
        System.out.printf("%n You have a body temperature of %.1f\u00B0 fahrenheit.", temperature);

        String likesPizza = InputUtility.validateUserString(" Do you like pizza? \n",
                new String[] { "Yes", "No" }, in);
        if (likesPizza.toLowerCase().equals(" yes ")) {
            System.out.printf("%n I like pizza too!%n");
        }
    }
}