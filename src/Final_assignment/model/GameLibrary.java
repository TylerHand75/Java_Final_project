package src.Final_assignment.model;

import java.util.Scanner;

import src.utilities.InputUtility;
import src.utilities.UIUtility;

public class GameLibrary {
    private Game[] games;
    private static int gameCount = 0;

    public GameLibrary() {
        games = new Game[20];
        games[gameCount++] = new Game("Call of Duty 4 Modern Warfare", new Person("Infinity", "Ward"),7 );
        
    }

    public boolean isFull() {
        // check if the Game count matches the length of the array
        return true;
    }

    public void addGame(Scanner in) {
        // Check if library is not full
        Game Game;
        String GameType = InputUtility.validateUserString("What type of Game would you like to add?",
                new String[] { "E for Everyone", "T for Teen", "M for Mature" }, in);
        if (GameType.equalsIgnoreCase("E for Everyone")) {
            Game = new Game();
        } else {
            Game = new Fps();
        }
        while (true) {
            String title = InputUtility.getString("What is the title?", in);
            try {
                Game.setTitle(title);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        // Who is the author?
        // How many pages?

        if (GameType.equalsIgnoreCase("T for Teen")) {
            Person fps = new Person();
            while (true) {
                String firstName = InputUtility.getString("What is the Fps's name?", in);
                try {
                    fps.setFirstName(firstName);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            // Prompt for Fps's last name
            // Set the Game's Fps
            ((Fps) Game).setFps(fps);
        }
        
        if (GameType.equalsIgnoreCase("M for Mature")) {
            Person fps = new Person();
            while (true) {
                String firstName = InputUtility.getString("What is the Fps's name?", in);
                try {
                    fps.setFirstName(firstName);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            // Prompt for Fps's last name
            // Set the Game's Fps
            ((Fps) Game).setFps(fps);
        }

        games[gameCount++] = Game;
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
        Game Game = games[choice - 1];
        while (true) {
            String title = InputUtility.getString("New title? [Press enter to keep '" + Game.getTitle() + "']", in);
            if (title.equals("")) {
                title = Game.getTitle();
            }
            try {
                Game.setTitle(title);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        // Ask to update the author's first name
        // Ask to update the author's last name
        // Ask to update the number of pages
        if (Game instanceof Fps) {
            // Ask to update the Fps's firstname
            // Ask to update the Fps's lastname
        }
        games[choice - 1] = Game;
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
        Game Game = games[choice - 1];
        int moveToIndex = InputUtility.getIntInRange("Where would you like to move this Game", 1, gameCount, in);
        moveToIndex--;
        // start a loop one spot higher than the choice, stop at the moveToIndex
        // Move the Game at the current index of the loop one spot to the left
        // When loop is finished, place the Game at the moveToIndex position.
    }
}
