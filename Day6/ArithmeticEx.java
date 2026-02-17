//-  Write a Java program to handle an ArithmeticException using try, catch, and finally block.
//Input: Operand values for division operation mentioned in the program
//Output: ArithmeticException caught by try-catch-finally block



public class ArithmeticEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}