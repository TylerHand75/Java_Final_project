import java.util.Random;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Chapter3 implements TaskHandler {

    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 3 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3"
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
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 3 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Get Largest Number");
        int number1 = InputUtility.getInt(" Enter a Number: ", in);
        int number2 = InputUtility.getInt(" Enter a Number: ", in);

        for (int x = number1 + 1; x < number2; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            if (x % number1 == 0) {
                break;
            }
        }
        if (number1 % 2 == 1) {
            number1--;
        }
        for (int j = number1; j >= number2; j -= 2) {
            System.out.println(j + " ");
            if (j % number2 == 0)
                break;
        }
    }

    

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Average Number");
        String numbers = " ";
        double sum = 0;
        int count = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        while (sum >= 0) {
            numbers = InputUtility.getString(" Enter some numbers (enter S to stop):", in);
            if ("S".equalsIgnoreCase(numbers)) {
                break;
            }
            double num;
               try {
                 num = Double.parseDouble(numbers);
               } catch (NumberFormatException ex) {
                   System.out.println("invalid statement.");
                   System.out.println("Try Again");
                   continue;
               }
            sum = sum + num;
           
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            count++;
            
        }
        double average = sum / count;
        System.out.println("sum: " + sum);
        System.out.println("count: " + count);
        System.out.printf("average: %.2f %n", average);
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Get the area of a circle");
        Random rnd = new Random();
        int num1 = rnd.nextInt(12 + 1);
        int num2 = rnd.nextInt(12 + 1);
        int total = num1 * num2;
        for (int x = 2; x >= 0; x--) {
            int userAnswer = InputUtility.getInt(" What is " + num1 + (" X ") + num2, in);
            if (userAnswer == total) {
                System.out.println("Correct");
                break;
            } else if (x == 2) {
                System.out.println(" You have 2 attempts left! ");
            } else if (x == 1) {
                System.out.println(" You have 1 attempts left! ");
            } else if (x == 0) {
                System.out.println(" The answer was " + total + " Try again. ");
                break;
            }
        }

    }

}