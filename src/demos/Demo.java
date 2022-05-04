package src.demos;

import src.utilities.UIUtility;
import src.utilities.InputUtility;
import src.utilities.TaskHandler;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Demo {
    public static void main(String[] args) {

        int j = 1;
        while (j < 33) {
            System.out.println(j);
            j *= 2;
        }
        Scanner in = new Scanner(System.in);
        String choice = "";
        int num = 0, min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        do {
            num = InputUtility.getInt("Give me a number", in);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            choice = InputUtility.validateUserString("Continue?", new String[] { "Yes",
                    "No" }, in);
        } while (choice.equalsIgnoreCase("Yes"));
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        in.close();

        int n = 0;
        while (n <= 100) {
            n += 3 + 1;
            System.out.print(n + " ");
        }
        System.out.println("\n");

        int[] arr = { 12, 2, 9, 18, 10, 14, 6, 16 };
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 3 == 0) {
                count++;
                sum += arr[i];
                System.out.println("sum" + " " + sum + " " + "count"+ " " + count + " ");
            }
            
        }
        System.out.println((double)sum/count);
        
    }
}
