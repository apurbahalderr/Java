//

import java.util.Scanner;

class HrsException extends Exception {
   HrsException(String message) {
        super(message);
    }
}
class MinException extends Exception {
    MinException(String message) {
        super(message);
    }
}
class SecException extends Exception {
    SecException(String message) {
        super(message);
    }
}
public class Time {
   int hours;
   int minutes;
    int seconds;

    static void validateTime(int hrs, int min, int sec) throws HrsException, MinException, SecException {
        if (hrs < 0 || hrs > 23) {
            throw new HrsException("Invalid hours: " + hrs);
        }
        if (min < 0 || min > 59) {
            throw new MinException("Invalid minutes: " + min);
        }
        if (sec < 0 || sec > 59) {
            throw new SecException("Invalid seconds: " + sec);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hrs = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int min = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int sec = scanner.nextInt();

        try {
            validateTime(hrs, min, sec);
            System.out.println("Valid time: " + hrs + "h " + min + "m " + sec + "s");
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Time validation completed.");
            scanner.close();
        }
    }
}
