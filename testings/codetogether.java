package testings;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;


public class codetogether {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Birthday (YYYY-MM-DD): ");
        String yourBirthday = scanner.nextLine();
        scanner.close();
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate userDate = LocalDate.parse(yourBirthday, formattedDate);
        LocalDate today = LocalDate.now();

        int month = userDate.getMonthValue();
        int Day = userDate.getDayOfMonth();

        if ((Day>=22 && month == 12) || (Day<=19 && month== 1))
        {
            System.out.println("You are a Capricon");
        }
        else if ((Day>=20 && month == 1) || (Day<=18 && month== 2))
        {
            System.out.println("You are an Aquarius");
        }
        else if ((Day>=19 && month == 2) || (Day<=20 && month== 3))
        {
            System.out.println("You are a Pisces");
        }
        else if ((Day>=21 && month == 3) || (Day<=19 && month== 4))
        {
            System.out.println("You are an aries");
        }
        else if ((Day>=20 && month == 4) || (Day<=20 && month== 5))
        {
            System.out.println("your zodiac is Taurus");
        }
        else if ((Day>=21 && month == 5) || (Day<=20 && month== 6))
        {
            System.out.println("You are a Gemini");
        }
        else if ((Day>=21 && month == 6) || (Day<=22 && month== 7))
        {
            System.out.println("You are a Cancer");
        }
        else if ((Day>=23 && month == 7) || (Day<=22 && month== 8))
        {
            System.out.println("You are a Leo");
        }
        else if ((Day>=23 && month == 8) || (Day<=22 && month== 8))
        {
            System.out.println("You are a Virgo");
        }
        else if ((Day>=23 && month == 9) || (Day<=22 && month== 10))
        {
            System.out.println("You are a Libra");
        }
        else if ((Day>=23 && month == 10) || (Day<=21 && month== 11))
        {
            System.out.println("You are a Scorpio");
        }else if ((Day>=22 && month == 11) || (Day<=21 && month== 12))
        {
            System.out.println("You are a Sagittarius");
        }

        
    }
}
