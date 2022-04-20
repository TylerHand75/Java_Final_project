package src.demos;

import src.utilities.UIUtility;
import src.utilities.InputUtility;
import src.utilities.TaskHandler;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
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

        int n = 4;
        while (n <= 15) {
        n += 2;
        System.out.print(n + " ");
        }
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        a[3]++;
        a[2] = a[3] + 1;
        a[6]--;
        a[5] = a[2] / 2;
        System.out.println(a);
        
    }

}
