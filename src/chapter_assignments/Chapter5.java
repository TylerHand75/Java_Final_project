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
                    "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4"
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

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3 ");

        ArrayList<String> States = new ArrayList<String>();
        ArrayList<String> Capitals = new ArrayList<String>();
        States.add("Alabama");States.add("Alaska");States.add("Arizona");
        States.add("Arkansas");States.add("California");States.add("Colorado");
        States.add("Connecticut");States.add("Delaware");States.add("Florida");
        States.add("Georgia");States.add("Hawaii");States.add("Idaho");
        States.add("Illinois");States.add("Indiana");States.add("Iowa");
        States.add("Kansas");States.add("Kentucky");States.add("Louisiana");
        States.add("Maine");States.add("Maryland");States.add("Massachusetts");
        States.add("Michigan");States.add("Minnesota");States.add("Mississippi");
        States.add("Missouri");States.add("Montana");States.add("Nebraska");
        States.add("Nevada");States.add("New Hampshire");States.add("New Jersey");
        States.add("New Mexico");States.add("New York");States.add("North Carolina");
        States.add("North Dakota");States.add("Ohio");States.add("Oklahoma");
        States.add("Oregon");States.add("Pennsylvania");States.add("Rhode Island");
        States.add("South Carolina");States.add("South Dakota");States.add("Tennessee");
        States.add("Texas");States.add("Utah");States.add("Vermont");
        States.add("Virginia");States.add("Washington");States.add("West Virginia");
        States.add("Wisconsin");States.add("Wyoming");

        Capitals.add("Montgomery"); Capitals.add("Juneau"); Capitals.add("Phoenix");
        Capitals.add("Little Rock"); Capitals.add("Sacramento"); Capitals.add("Denver");
        Capitals.add("Hartford"); Capitals.add("Dover"); Capitals.add("Tallahassee");
        Capitals.add("Atlanta"); Capitals.add("Honolulu"); Capitals.add("Boise");
        Capitals.add("Springfield"); Capitals.add("Indianapolis"); Capitals.add("Des Moines");
        Capitals.add("Topeka"); Capitals.add("Frankfort"); Capitals.add("Baton Rouge");
        Capitals.add("Augusta"); Capitals.add("Annapolis"); Capitals.add("Boston");
        Capitals.add("Lansing"); Capitals.add("Saint Paul"); Capitals.add("Jackson");
        Capitals.add("Jefferson City"); Capitals.add("Helena"); Capitals.add("Lincoln");
        Capitals.add("Carson City"); Capitals.add("Concord"); Capitals.add("Trenton");
        Capitals.add("Santa Fe"); Capitals.add("Albany"); Capitals.add("Raleigh");
        Capitals.add("Bismarck"); Capitals.add("Colombus"); Capitals.add("Oklahoma City");
        Capitals.add("Salem"); Capitals.add("Harrisburg"); Capitals.add("Providence");
        Capitals.add("Columbia"); Capitals.add("Pierre"); Capitals.add("Nashville");
        Capitals.add("Austin"); Capitals.add("Salt Lake City"); Capitals.add("Montpelier");
        Capitals.add("Richmond"); Capitals.add("Olympia"); Capitals.add("Charleston");
        Capitals.add("Madison"); Capitals.add("Cheyenne");
        
        String userinput1 = InputUtility.getString("Please Enter a letter", in);
        
        boolean found = States.contains(userinput1.substring(0));
        if (found){
            System.out.println(States.equals(userinput1));
        }



        System.out.println(States);
        System.out.println(Capitals);

    }
    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 4 ");
    }
}
