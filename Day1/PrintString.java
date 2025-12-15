import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = sc.nextLine();
        System.out.print("Enter second name: ");
        String second = sc.nextLine();

        System.out.println(second + " " + first);
    }
}
