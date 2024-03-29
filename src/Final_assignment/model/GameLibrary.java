package src.Final_assignment.model;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import src.utilities.InputUtility;
import src.utilities.UIUtility;

public class GameLibrary {
    private Game[] games;
    private static int gameCount = 0;

    public GameLibrary() {
        games = new Game[10];
        games[gameCount++] = new Videogame2("Call of Duty 4 Modern Warfare", "fps", "Activision", 7, "M");
        games[gameCount++] = new Videogame2("BattleFeild 2042", "Fps", "EA ", 6, "M");
        games[gameCount++] = new Videogame2("Valheim","MMO","Coffee Stain Publishing",1,"T");
        games[gameCount++] = new Game("Chess","stratigy","unknown",1);
        games[gameCount++] = new Game("Texas Hold em", "Card game", "unknown",10);
        games[gameCount++] = new Game("VolleyBall", "Sport","Red Chair Press",5 );

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
            game = new Videogame2();
        }
        while (true) {
            String title = InputUtility.getString("What is the title?", in);

            try {

                game.setTitle(title);

                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            while (true) {
                Publisher publisher = new Publisher();
                String genreType = InputUtility.getString("What is the Genre type?", in);

                try {

                    publisher.setGenreType(genreType);

                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

                while (true) {

                    String publisherName = InputUtility.getString("What is the publishers name?", in);
                    try {

                        publisher.setPublisherName(publisherName);

                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

        }

        if (gameType.equalsIgnoreCase("Rating")) {
            String rating = " ";
            while (true) {
                rating = InputUtility.getString("What is the Rating for this Game?", in);

                try {
                    ((Videogame2) game).setRating(rating);
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            // Set the Game's Rating
            ((Videogame2) game).setRating(rating);
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

}
