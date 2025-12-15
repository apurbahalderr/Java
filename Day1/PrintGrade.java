import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        sc.close();

        if (marks >= 90) {
            System.out.println("O");
        } else if (marks > 80){
            System.out.println("E");
        } else if(marks > 70){
            System.out.println("A");
        } else if(marks > 60){
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
