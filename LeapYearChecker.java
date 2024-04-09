import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
    
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4 but not by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
