package src.chapter_assignments;

import src.utilities.UIUtility;
import src.utilities.InputUtility;
import src.utilities.TaskHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chapter5 implements TaskHandler {

    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2"
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

            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public static String stringReverse(String pString) {
        String reversed = "";
        String stripped = pString.toLowerCase().replace(" ", "");
        int length = stripped.length() - 1;

        for (int i = length; i >= 0; i--) {
            reversed += stripped.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String pString) {
        boolean isPalindrome = false;
        String stripped = stringReverse(pString);
        for (int i = 0; i < pString.toLowerCase().length() - 1; i++) {
            for (int x = stripped.length() - 1; x >= 0; x--) {
                if (stripped.charAt(i) != pString.toLowerCase().charAt(x)) {
                    isPalindrome = false;
                } else {
                    isPalindrome = true;
                }
            }
        }
        return isPalindrome;
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        boolean nums = true;
        String input = "";

        while (nums) {
            input = InputUtility.getString("Enter some numbers: type \"s\" to stop", in);
            if (input.equalsIgnoreCase("s")) {
                break;
            }
            Integer number;
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException up) {
                System.out.println("Please enter a valid number of 'S'");
                continue;
            }
            if (number % 2 == 0) {
                even.add(number);
            } else if (number % 2 == 1) {
                odd.add(number);
            }
        }
        if (odd.isEmpty()) {
            System.out.println("Odd numbers: None");
        } else {
            Collections.sort(odd);
            System.out.println("Odd numbers: " + odd.toString());
        }
        if (even.isEmpty()) {
            System.out.println("Even numbers: None");
        } else {
            Collections.sort(even);
            System.out.println("Even numbers: " + even.toString());
        }
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");

        String pString;

        String userString1 = InputUtility.getString("Enter a String", in);
        System.out.println(userString1);
        System.out.println("***Statistics***");
        System.out.println("Length: " + userString1.length());
        if (userString1.length() > 2) {
            System.out.println("First 3 characters: " + userString1.substring(0, 3));
        } else {
            System.out.println("First 3 characters: " + userString1);
        }

        System.out.println("Last Character: " + userString1.charAt(userString1.length() - 1));
        System.out.println("Contains the letter i: " + userString1.contains("i"));
        System.out.println("Lowercase: " + userString1.toLowerCase());
        pString = userString1;
        System.out.println("Is a palindrome: " + isPalindrome(pString));

        String userString2 = InputUtility.getString("Enter another String", in);
        System.out.println(userString2);
        System.out.println("***Statistics***");
        System.out.println("Length: " + userString2.length());
        if (userString2.length() > 2) {
            System.out.println("First 3 characters: " + userString2.substring(0, 3));
        } else {
            System.out.println("First 3 characters: " + userString2);
        }
        System.out.println("Last Character: " + userString2.charAt(userString2.length() - 1));
        System.out.println("Contains the letter i: " + userString2.contains("i"));
        System.out.println("Lowercase: " + userString2.toLowerCase());
        pString = userString2;
        System.out.println("Is a palindrome: " + isPalindrome(pString));

        int compare = userString1.toLowerCase().compareTo(userString2.toLowerCase());

        if (compare < 0) {
            System.out.println("\"" + userString1 + "\" comes alphabetically before \"" + userString2 + "\"");
        } else if (compare > 0) {
            System.out.println("\"" + userString2 + "\" comes alphabetically before \"" + userString1 + "\"");
        } else {
            System.out.println("\"" + userString1 + "\" and " + "\"" + userString2 + "\" are equal");
        }
    }
}
