
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
            choice = InputUtility.validateUserString("Continue?", new String[] { "Yes", "No" }, in);
        } while (choice.equalsIgnoreCase("Yes"));
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        in.close();

    }
    class Donation {
        double amount;
        String note;
        Person person;
    
        public void doubleDonation() {
            amount *= 2;
        }
    
        @Override
        public String toString() {
            return String.format("%s donated $%.2f : \"%s\"", person.name, amount, note);
        }
    
    }
    
    class Person {
        String name;
    
        public static void sayHello() {
            System.out.println("Person says Hello");
        }
    
        public void sayHello2() {
            System.out.println(name + " says Hello");
        }
    }
    
    
    public class Demo {
        public void today() {
            System.out.println(LocalDate.now());
        }
    
        public static void today2() {
            System.out.println(LocalDate.now());
        }
    
        void doStuff(double val) {
            System.out.println("IT WORKS!");
        }
    
        static String doStuff(String x, String y) {
            return x + y;
        }
    
        public static void main(String[] args) {
            System.out.println(doStuff("5", "7"));
    
    
            Demo objectName = new Demo();
            objectName.doStuff(3.5);
    
    
            Demo demo = new Demo();
            demo.today();
            Demo.today2();
            today2();
    
            Person person = new Person();
            person.name = "Marc Hauschildt";
            Donation donation = new Donation();
            donation.amount = 50;
            donation.note = "In honor of my late cat named Velcro";
            donation.person = person;
            donation.doubleDonation();
            System.out.println(donation);
            Person.sayHello();
            person.sayHello2();
        }
}
