import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Chapter2 implements TaskHandler {

    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3", "exercise 4"
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
        System.out.println("\nExiting Chapter 2 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("exercise 1");
        int int1 = InputUtility.getInt("Enter a Number", in);
        
            
        
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("exercise 2");
        

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("exercise 3");
        

    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("exercise 4");
      
    }
}
