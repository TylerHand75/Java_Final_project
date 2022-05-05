package src.chapter_assignments;

import src.utilities.UIUtility;
import src.utilities.InputUtility;
import src.utilities.TaskHandler;

import java.util.ArrayList;
import java.util.Arrays;
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
                case 4:
                    exercise4(in);
                    break;

            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 5 Menu.");
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
            // if (number % 2 == 0) {
            // even[]=(number);
            // } else if (number % 2 == 1) {
            // odd[]=(number);
            // }
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

        String[] States = { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
                "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
                "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi",
                "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York",
                "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
                "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
                "West Virginia", "Wisconsin", "Wyoming" };
    
        String userinput1 = InputUtility.getString("Please Enter a letter", in);
        userinput1 = userinput1.toUpperCase();
        int count = 0;
        for (String state : States) {
            if (state.charAt(0)== userinput1.charAt(0)){
                count++;
                
            }
        }
        System.out.println(count + " States that start with " + userinput1 );

    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 4 ");
       
        String[] States = { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
                "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
                "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi",
                "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York",
                "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
                "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
                "West Virginia", "Wisconsin", "Wyoming" };
        String[] Capitals = { "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford",
                "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines",
                "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul",
                "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe",
                "Albany", "Raleigh", "Bismarck", "Colombus", "Oklahoma City", "Salem", "Harrisburg", "Providence",
                "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia",
                "Charleston", "Madison", "Cheyenne" };


        for (int i = 0;i < 50;i++ ){
            if(States[i].compareToIgnoreCase(Capitals[i]) < 0){
                System.out.println(States[i] + " comes alphabetically before " + Capitals[i]);
            }
            else{
                System.out.println(Capitals[i] + " comes alphabetically before " + States[i]);
            }
        }


    }
   
}
