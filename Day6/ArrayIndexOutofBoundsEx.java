//Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement
//Input: Enter the  numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
//Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4

public class ArrayIndexOutofBoundsEx {
    public static void main(String[] args) {
        int[] num= new int[4];
        try {
            for (int i = 0; i <= num.length; i++) {
                num[i] = i + 1;
                System.out.println(num[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

}}