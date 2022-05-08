package src.Final_assignment.model;

import java.util.Scanner;

import src.utilities.InputUtility;
import src.utilities.UIUtility;

public class GameLibrary {
    private Game[] games;
    private static int gameCount = 0;

    public GameLibrary() {
        games = new Game[20];
        games[gameCount++] = new Game("Call of Duty 4 Modern Warfare", new Person("John", "Price"),7 );
        
    }

    public boolean isFull() {
        // check if the Game count matches the length of the array
        return true;
    }

    public void addGame(Scanner in) {
        // Check if library is not full
        Game game;
        String gameType = InputUtility.validateUserString("What type of Game would you like to add?",
                new String[] { "Regular", "First Person Shooter" }, in);
        if (gameType.equalsIgnoreCase("Regular")) {
            game = new Game();
        } else {
            game = new Fps();
        }
        while (true) {
            String title = InputUtility.getString("What is the title?", in);
            try {
                game.setTitle(title);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        // Who is the author?
        // How many pages?

        if (gameType.equalsIgnoreCase("Fps" )) {
            Person fps = new Person();
            while (true) {
                String firstName = InputUtility.getString("What is the Fps's main charactors first name?", in);
                String lastName = InputUtility.getString("What is the Fps's main charactors last name?", in);
                try {
                    fps.setFirstName(firstName);
                    fps.setLastName(lastName);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            // Prompt for Fps's last name
            // Set the Game's Fps
            ((Fps) game).setFps(fps);
        }
        

        games[gameCount++] = game;
        UIUtility.showMenuTitle("Game successfully added");
        // if the library is full, tell that to the user
    }

    public void showAllGames() {
        for (int i = 0; i < gameCount; i++) {
            System.out.println(games[i].toString());
        }
    }

    public void updateGame(Scanner in) {
        String menuTitle = "Update a Game";
        String prompt = "Select a Game";
        String[] menuOptions = new String[gameCount];
        for (int i = 0; i < gameCount; i++) {
            menuOptions[i] = games[i].toString();
        }
        int choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
        if (choice < 1 || choice > menuOptions.length) {
            System.out.println("Exiting update method");
            return;
        }
        Game game = games[choice - 1];
        while (true) {
            String title = InputUtility.getString("New title? [Press enter to keep '" + game.getTitle() + "']", in);
            if (title.equals("")) {
                title = game.getTitle();
            }
            try {
                game.setTitle(title);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        // Ask to update the author's first name
        // Ask to update the author's last name
        // Ask to update the number of pages
        if (game instanceof Fps) {
            // Ask to update the Fps's firstname
            // Ask to update the Fps's lastname
        }
        games[choice - 1] = game;
        UIUtility.showMenuTitle("Game successfully updated");
    }

    public void moveGame(Scanner in) {
        String menuTitle = "Move a Game";
        String prompt = "Select a Game";
        String[] menuOptions = new String[gameCount];
        for (int i = 0; i < gameCount; i++) {
            menuOptions[i] = games[i].toString();
        }
        int choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
        if (choice < 1 || choice > menuOptions.length) {
            System.out.println("Exiting update method");
            return;
        }
        Game game = games[choice - 1];
        int moveToIndex = InputUtility.getIntInRange("Where would you like to move this Game", 1, gameCount, in);
        moveToIndex--;
        // start a loop one spot higher than the choice, stop at the moveToIndex
        // Move the Game at the current index of the loop one spot to the left
        // When loop is finished, place the Game at the moveToIndex position.
    }

    public void  sortGamesByTitle(Scanner in ){


    }


}
