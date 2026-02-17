//Write a Java class which has a method called ProcessInput(). This method checks the number entered by the user. If the entered number is negative then throw an user defined exception called NegativeNumberException, otherwise it displays the double value of the entered number.
import java.util.Scanner;

class NegativeNumberException extends Exception {
  NegativeNumberException(String message) {
    super(message);
  }

}

public class NegativeNumberEx {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    try {
      ProcessInput(number);
    } catch (NegativeNumberException e) {
      System.out.println("Error: " + e.getMessage());
    }
    sc.close();
  }

  static void ProcessInput(int number) throws NegativeNumberException {
    if (number < 0) {
      throw new NegativeNumberException("Negative number not allowed.");
    }
    System.out.println("Double value: " + (number * 2));
  }
}
