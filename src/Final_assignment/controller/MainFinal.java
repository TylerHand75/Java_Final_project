package src.Final_assignment.controller;

import java.util.Scanner;
import src.Final_assignment.model.GameLibrary;
import src.utilities.UIUtility;

public class MainFinal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;  
        GameLibrary gamelibrary = new GameLibrary();
        while (true) {
            String menuTitle = "Main Menu";
            String prompt = "Select an option";
            String[] menuOptions = {
                "Add a new Game"  // DONE
                , "View all Games"  // DONE
                , "Sort Games by title" // ON YOUR OWN
                , "Update a Game" // DEMO ON MONDAY
                , "Remove a Game" // ON YOUR OWN
                , "Move a Game to a new location" // DEMO ON MONDAY
                , "Swap locations of two Games" // ON YOUR OWN
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    gamelibrary.addGame(scanner);
                    break;
                case 2:
                    gamelibrary.showAllGames();
                    break;
                case 3:
                    
                    break;
                case 4:
                    gamelibrary.updateGame(scanner);
                    break;
                case 5:
                    
                    break;
                case 6:
                    gamelibrary.moveGame(scanner);
                    break;
                case 7:
                    
                    break;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}