import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;

import javax.print.attribute.standard.MediaSize.Other;
import javax.xml.validation.Validator;

public class Chapter4 implements TaskHandler {

    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4", "Exercise 5", "Exercise 6", "Exercise 7", "Exercise 8"
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
                case 5:
                    exercise5(in);
                    break;
                case 6:
                    exercise6(in);
                    break;
                case 7:
                    exercise7(in);
                    break;
                case 8:
                    exercise8(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 4 Menu.");
    }

    public void exercise1(Scanner in) {
        Fraction fract = new Fraction();
        System.out.println(fract);
    }

    public void exercise2(Scanner in) {
        Fraction fract = new Fraction(27, 26);
        System.out.println(fract);
        System.out.println(fract.getNumerator());
        System.out.println(fract.getDenominator());
        fract.setNumerator(30);
        fract.setDenominator(45);
        System.out.println(fract);
    }

    public void exercise3(Scanner in) {
        try {
            Fraction fract = new Fraction(3, 0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        Fraction fract = new Fraction();
        try {
            fract.setDenominator(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void exercise4(Scanner in) {
        System.out.println(Fraction.greatestCommonDivisor(75, 45));
        System.out.println(Fraction.greatestCommonDivisor(2, 4));
        System.out.println(Fraction.greatestCommonDivisor(5, 7));
    }

    public void exercise5(Scanner in) {
        Fraction fract1 = new Fraction(75, 45);
        System.out.println(fract1.simplify());

        Fraction fract2 = new Fraction(2, 4);
        System.out.println(fract2.simplify());

        Fraction fract3 = new Fraction(5, 7);
        System.out.println(fract3.simplify());

        Fraction fract4 = new Fraction(-2, 4);
        System.out.println(fract4.simplify());

        Fraction fract5 = new Fraction(2, -4);
        System.out.println(fract5.simplify());

        Fraction fract6 = new Fraction(-2, -4);
        System.out.println(fract6.simplify());

    }

    public void exercise6(Scanner in) {
        Fraction fract1 = new Fraction(4, 1);
        System.out.println(fract1.mixedNumber());

        Fraction fract2 = new Fraction(0, 4);
        System.out.println(fract2.mixedNumber());

        Fraction fract3 = new Fraction(4, 4);
        System.out.println(fract3.mixedNumber());
        
        Fraction fract4 = new Fraction(8, 4);
        System.out.println(fract4.mixedNumber());

        Fraction fract5 = new Fraction(4, 8);
        System.out.println(fract5.mixedNumber());

        Fraction fract6 = new Fraction(13, 5);
        System.out.println(fract6.mixedNumber());

        Fraction fract7 = new Fraction(-13, 5);
        System.out.println(fract7.mixedNumber());

        Fraction fract8 = new Fraction(13, -5);
        System.out.println(fract8.mixedNumber());

        Fraction fract9 = new Fraction(-13, -5);
        System.out.println(fract9.mixedNumber());

    }

    public void exercise7(Scanner in) {
        Fraction fract1 =  new Fraction(13,5);
        Fraction fract2 = new Fraction(4,8);
        
        System.out.println(fract1.add(fract2));

        Fraction fract3 =  new Fraction(-13,-5);
        Fraction fract4 = new Fraction(13,-5);
        System.out.println(fract3.add(fract4));



    }

    public void exercise8(Scanner in) {

        int fract1 = InputUtility.getInt("Please enter a Numerator", in);
        int fract2 = InputUtility.getInt("Please enter a Denominator", in);
        int fract3 = InputUtility.getInt("Please enter a Numerator", in);
        int fract4 = InputUtility.getInt("Please enter a Denominator", in);
        
        try {
            
            Fraction fract5 = new Fraction(fract1, fract2);
            Fraction fract6 = new Fraction(fract3, fract4);
            System.out.println(fract5.add(fract6));
        
            }catch (IllegalArgumentException ex ) {
                System.out.println(ex.getMessage());
                 
            }
            
        
    }

}

// Part 1
class Fraction {
    int numerator;
    int denominator;

    Fraction() {
        numerator = 1;
        denominator = 1;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        ValidateDenominator(denominator);
    }

    // Part 2
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        ValidateDenominator(denominator);
    }

    // Part 3
    private void ValidateDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException( " The denominator cannot be 0 " );
        }
    }

    // Part 4
    public static int greatestCommonDivisor(int num, int num2) {
        BigInteger bigInt1 = BigInteger.valueOf(num);
        BigInteger bigInt2 = BigInteger.valueOf(num2);
        BigInteger result = bigInt1.gcd(bigInt2);
        return result.intValue();
    }

    // Part 5
    public Fraction simplify() {
        int gcd = greatestCommonDivisor(numerator, denominator);
        int nume = numerator / gcd;
        int denom = denominator / gcd;
        if (nume < 0 && denom < 0) {
            nume = nume * -1;
            denom = denom * -1;
        }
        if (nume >= 0 && denom < 0) {
            nume = nume * -1;
            denom = denom * -1;
        }

        return new Fraction(nume, denom);

    }

    // Part 6
    public String mixedNumber() {
        Fraction sfraction = new Fraction(numerator, denominator).simplify();
        if (sfraction.denominator == 1) {
            Integer num = sfraction.numerator;
            return num.toString();
        } else if (sfraction.numerator == 0) {
            return "0";
        } else if (sfraction.numerator < 0) {
            int wholeNumber = sfraction.numerator / sfraction.denominator;
            int remaindor = (sfraction.numerator % sfraction.denominator) * -1;
            return "" + wholeNumber + " " + remaindor + "/" + sfraction.denominator;
        } else if (sfraction.numerator > sfraction.denominator) {
            int wholeNumber = sfraction.numerator / sfraction.denominator;
            int remaindor = sfraction.numerator % sfraction.denominator;
            return "" + wholeNumber + " " + remaindor + "/" + sfraction.denominator;
        } else {
            return sfraction.toString();
        }

    }

    // Part 7
    public String add(Fraction otherFraction){
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        Fraction fract1 = new Fraction();
        fract1.setNumerator(((a*d) + (c*b)));
        fract1.setDenominator((b*d));
        return this.mixedNumber() + " + " + otherFraction.mixedNumber() + " = " + fract1.mixedNumber();
        

    }
    
    public String toString() {
        return (numerator + "/" + denominator);
    }

}