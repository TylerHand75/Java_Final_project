import java.util.Arrays;

class Book {

}

public class chapter5Demo {

    public static void main(String[] args) {

        Book[] bookshelf = new Book[10];
        bookshelf[0] = new Book();

        String[] months = new String[12];
        months[0] = "Jan";
        months[1] = "Feb";
        months[2] = "Mar";
        months[3] = "Apr";
        months[4] = "May";
        int location = Arrays.binarySearch(months, "February");
        System.out.println(location);

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
        int sample[] = new int[10];
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

    }
}
