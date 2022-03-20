import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Chapter3 implements TaskHandler {

    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 3 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3" 
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
        System.out.println("\nExiting Chapter 3 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Get Largest Number");
        
        
        

    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Average Number");
        

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Get the area of a circle");
        

    }

}