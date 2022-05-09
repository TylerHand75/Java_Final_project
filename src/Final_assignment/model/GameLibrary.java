package src.Final_assignment.model;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import src.utilities.InputUtility;
import src.utilities.UIUtility;

public class GameLibrary {
    private Game[] games;
    private static int gameCount = 0;
   

    public GameLibrary() {
        games = new Game[20];
        games[gameCount++] = new Game("Call of Duty 4 Modern Warfare", new Person("fps", "Activision" ), 7 );
        games[gameCount++] = new Game( "BattleFeild 2042",  new Person("Fps","EA "),6);
        
    }

    public boolean isFull() {
        // check if the Game count matches the length of the array
        return true;
    }

    public void addGame(Scanner in) {
        // Check if library is not full
        Game game;
        Person person = new Person();
        String gameType = InputUtility.validateUserString("What type of Game would you like to add?",
                new String[] { "Regular", "First Person Shooter" }, in);
                
        if (gameType.equalsIgnoreCase("Regular")) {
            game = new Game();
        } else {
            game = new Videogame();
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
                
                String genreType = InputUtility.getString("What is the Genre type?", in);
                
                try {
                    
                    person.setGenreType(genreType);
                    
    
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            
                while (true) {
                    
                    String publisherName = InputUtility.getString("What is the publishers name?", in);
                    try {
                        
                        
                        person.setPublisherName(publisherName);
        
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    
            
            
        }
        
        
        if (gameType.equalsIgnoreCase("Rating" )) {
            String rating1 = new String();
            while (true) {
                String rating2 = InputUtility.getString("What is the Rating for this Game?", in);
                
                try {
                    rating1.setRating(rating2);
                    
                    break;;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            // Set the Game's Rating
            ((Videogame) game).setRating(rating1);
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
