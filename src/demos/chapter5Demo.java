package src.demos;
import src.utilities.UIUtility;
import src.utilities.InputUtility;
import src.utilities.TaskHandler;
import java.util.Arrays;

class Book {

}

public class chapter5Demo {

    public static void main(String[] args) {

        Book[] bookshelf = new Book[10];
        bookshelf[0] = new Book();

        String[] months = new String[5];
        months[0] = "Jan";
        months[1] = "Feb";
        months[2] = "Mar";
        months[3] = "Apr";
        months[4] = "May";

        String[] months2 = months;
        months2[0] = "January";
        months2[1] = "Febuary";
        months2[2] = "March";
        months2[3] = "April";
        months2[4] = "May";

        System.out.println(Arrays.toString(months2));

        Arrays.sort(months);
        for (String month : months) {

            System.out.println(month);
        }
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println(Arrays.toString(months));

        int[] dates = new int[5];
        dates[0] = 1;
        dates[1] = 2;
        dates[2] = 3;
        dates[3] = 4;
        dates[4] = 5;
        for (int date : dates) {

            System.out.println(date);
        }

        int[] nums = { 6, 7, 12, 4, -3, 43 };
        int max = nums[0];
        int min = nums[0];
        Arrays.sort(nums);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            System.out.println(" Max: " + max + " Min: " + min);

        }
        int sample[] = new int[20];
        int i;

        for (i = 0; i < sample.length; i = i + 1) {
            sample[i] = i;
        }

        System.out.println(Arrays.toString(sample));
        // Step 1: Assign either value to a temp variable
        int temp = sample[0];
        // Step 2: Assign the second value to the first
        sample[0] = sample[sample.length - 1];
        // Step 3: Assign the temp value to the second
        sample[sample.length - 1] = temp;
        System.out.println(Arrays.toString(sample));

        String mySchool = "Kirkwood Community College";
        // int length()
        System.out.println(mySchool.length());
        // char charAt(int index)
        System.out.println(mySchool.charAt(9));
        for (int j = mySchool.length() - 1; j >= 0; j--) {
            System.out.print(mySchool.charAt(j));
        }
        System.out.println();

        // char[] toCharArray()
        char[] letters = mySchool.toCharArray();
        System.out.println(Arrays.toString(letters));

        // boolean equals(Object anObject)
        if (mySchool.equals("University of Iowa")) {
            System.out.println("Go Hawks!");
        } else {
            System.out.println("Go Eagles!");
        }

        // int compareTo(String anotherString)
        // 9
        System.out.println(mySchool.compareTo("Blackhawk Community College"));

        // -9
        System.out.println("Blackhawk Community College".compareTo(mySchool));

        // 0
        System.out.println(mySchool.compareTo("Kirkwood Community College"));

        int locationFound = mySchool.lastIndexOf("C");
        System.out.println(locationFound);
        if (locationFound >= 0) {
            System.out.println("I found it at index " + locationFound);
        } else {
            System.out.println("Not found");
        }
        locationFound = mySchool.lastIndexOf("Z");
        System.out.println(locationFound);
        if (locationFound >= 0) {
            System.out.println("I found it at index " + locationFound);
        } else {
            System.out.println("Not found");
        }

        boolean found = mySchool.contains("C");
        if (found) {
            System.out.println("I found it");
        } else {
            System.out.println("Not found");
        }
        found = mySchool.contains("Z");
        if (found) {
            System.out.println("I found it");
        } else {
            System.out.println("Not found");
        }

        String sentence = "The quick brown fox jumped over the lazy dogs";
        System.out.println(sentence.replace("brown", "red"));
        System.out.println(sentence.replace("lazy", "relaxing"));
        sentence = "The quick brown fox jumped over the brown dogs";
        System.out.println(sentence.replaceAll("brown", "blue"));

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(mySchool.substring(0, 4));
        System.out.println(mySchool.substring(4));

        System.out.println(mySchool.toUpperCase());
        System.out.println(mySchool.toLowerCase());

        

    }
}
