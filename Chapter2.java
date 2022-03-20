import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Chapter2 implements TaskHandler {

    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 2 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3", "exercise 4"
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
                    exercise4(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 2 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("exercise 1");
        int num = InputUtility.getInt("Enter a number: ", in);

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("exercise 2");
        Scanner userinput = new Scanner(System.in);

        System.out.println("Please enter a Decimal: ");
        double decimal = userinput.nextDouble();
        String doubleAsString = String.valueOf(decimal);
        int indexOfDecimal = doubleAsString.indexOf(".");
        System.out.println("Double Number: " + decimal);
        System.out.println("Integer Part: " + doubleAsString.substring(0, indexOfDecimal));
        System.out.printf("Decimal Part:%.2" + doubleAsString.substring(indexOfDecimal));

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("exercise 3");

        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);

    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("exercise 4");
        int seconds = InputUtility.getInt("Enter a Number:", in);
        int days = (seconds / 86400);
        System.out.println("Days: " + days);
        int secondsLeft = (seconds % 86400);
        // math for hours left
        int hours = (secondsLeft / 60) / 60;
        System.out.println("Hours: " + hours);
        // math for minutes
        int minutes = ((secondsLeft / 60) % 60);
        System.out.println("Minutes: " + minutes);
        // math for seconds
        int seconds2 = (secondsLeft % 60);
        System.out.println("Seconds: " + seconds2);

    }
}
