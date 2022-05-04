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
            // if (number % 2 == 0) {
            //     even[]=(number);
            // } else if (number % 2 == 1) {
            //     odd[]=(number);
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

        String[] States = new String[50];
        String[] Capitals = new String[50];
        States[0]=("Alabama");States[1]=("Alaska");States[2]=("Arizona");
        States[3]=("Arkansas");States[4]=("California");States[5]=("Colorado");
        States[6]=("Connecticut");States[7]=("Delaware");States[8]=("Florida");
        States[9]=("Georgia");States[10]=("Hawaii");States[11]=("Idaho");
        States[12]=("Illinois");States[13]=("Indiana");States[14]=("Iowa");
        States[15]=("Kansas");States[16]=("Kentucky");States[17]=("Louisiana");
        States[18]=("Maine");States[19]=("Maryland");States[20]=("Massachusetts");
        States[21]=("Michigan");States[22]=("Minnesota");States[23]=("Mississippi");
        States[24]=("Missouri");States[25]=("Montana");States[26]=("Nebraska");
        States[27]=("Nevada");States[28]=("New Hampshire");States[29]=("New Jersey");
        States[30]=("New Mexico");States[31]=("New York");States[32]=("North Carolina");
        States[33]=("North Dakota");States[34]=("Ohio");States[35]=("Oklahoma");
        States[36]=("Oregon");States[37]=("Pennsylvania");States[38]=("Rhode Island");
        States[39]=("South Carolina");States[40]=("South Dakota");States[41]=("Tennessee");
        States[42]=("Texas");States[43]=("Utah");States[44]=("Vermont");
        States[45]=("Virginia");States[46]=("Washington");States[47]=("West Virginia");
        States[48]=("Wisconsin");States[49]=("Wyoming");

        Capitals[0]=("Montgomery"); Capitals[1]=("Juneau"); Capitals[2]=("Phoenix");
        Capitals[3]=("Little Rock"); Capitals[4]=("Sacramento"); Capitals[5]=("Denver");
        Capitals[6]=("Hartford"); Capitals[7]=("Dover"); Capitals[8]=("Tallahassee");
        Capitals[9]=("Atlanta"); Capitals[10]=("Honolulu"); Capitals[11]=("Boise");
        Capitals[12]=("Springfield"); Capitals[13]=("Indianapolis"); Capitals[14]=("Des Moines");
        Capitals[15]=("Topeka"); Capitals[16]=("Frankfort"); Capitals[17]=("Baton Rouge");
        Capitals[18]=("Augusta"); Capitals[19]=("Annapolis"); Capitals[20]=("Boston");
        Capitals[21]=("Lansing"); Capitals[22]=("Saint Paul"); Capitals[23]=("Jackson");
        Capitals[24]=("Jefferson City"); Capitals[25]=("Helena"); Capitals[26]=("Lincoln");
        Capitals[27]=("Carson City"); Capitals[28]=("Concord"); Capitals[29]=("Trenton");
        Capitals[30]=("Santa Fe"); Capitals[31]=("Albany"); Capitals[32]=("Raleigh");
        Capitals[33]=("Bismarck"); Capitals[34]=("Colombus"); Capitals[35]=("Oklahoma City");
        Capitals[36]=("Salem"); Capitals[37]=("Harrisburg"); Capitals[38]=("Providence");
        Capitals[39]=("Columbia"); Capitals[40]=("Pierre"); Capitals[41]=("Nashville");
        Capitals[42]=("Austin"); Capitals[43]=("Salt Lake City"); Capitals[44]=("Montpelier");
        Capitals[45]=("Richmond"); Capitals[46]=("Olympia"); Capitals[47]=("Charleston");
        Capitals[48]=("Madison"); Capitals[49]=("Cheyenne");
        
        String userinput1 = InputUtility.getString("Please Enter a letter", in);
        
        Arrays.sort(States);
        for (String State : States) {

            System.out.println(State);
        }
        for (int i = 0; i < States.length; i++) {
            System.out.println(States[i]);
            
        }
        System.out.println(Arrays.toString(States));
       


        

    }
    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 4 ");
    }
}
