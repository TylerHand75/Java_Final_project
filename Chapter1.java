import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Chapter1 implements TaskHandler {
    private Scanner sc;

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
        UIUtility.showMenuTitle("Get Largest Number");
        double userNum = InputUtility.getDouble("Enter a Number", in);
        double userNum2 = InputUtility.getDouble("Enter another Number", in);
        if (userNum >= userNum2) 
        System.out.println("Largest Number" +  userNum );
        else if (userNum<=userNum2){
            System.out.println("Largest Number " +  userNum2 );
        }
        

    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Average Number");
        double userNum = InputUtility.getDouble("Enter a Number", in);
        double userNum2 = InputUtility.getDouble("Enter another Number", in);
        double average = (userNum + userNum2) / 2;
        System.out.println("The Average number is " + average);

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Get the area of a circle");
        double radius = InputUtility.getDouble("Enter the radius ", in);
        double area = Math.PI * (radius * radius);
        double circumference= Math.PI * 2 * radius;

        System.out.println( "The circumference of the circle is: " + circumference) ;
        System.out.println("The area of circle is: " + area);

    }

    public void sampleExercise(Scanner in) {
        UIUtility.showMenuTitle("Sample Exercise");
        String name = InputUtility.getString("What is your name?", in);
        System.out.printf("%n Hello %s!", name);

        int favNum = InputUtility.getInt("What is your favorite number?",  in);
        System.out.printf("%n Your favorite number is %d.", favNum);

        int age = InputUtility.getIntInRange("How old are you (in years)? ", 0, 100, in);
        System.out.printf("%n You are %d years old.", age);

        double temperature = InputUtility.getDouble("What is body temperature (in fahrenheit)? ", in);
        System.out.printf("%n You have a body temperature of %.1f\u00B0 fahrenheit.", temperature);

        double rainfall = InputUtility.getDouble("%n How much did it rain yesterday?", in);
        System.out.printf("%n It rained %0.1f inches Yesterday.", rainfall);

        String likesPizza = InputUtility.validateUserString(" Do you like pizza? \n",
                new String[] { "Yes", "No" }, in);
        if (likesPizza.toLowerCase().equals(" yes ")) {
            System.out.printf("%n I like pizza too!%n");
        }
    }
}