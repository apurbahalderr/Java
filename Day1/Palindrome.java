import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.nextLine();

        sc.close();

        int p1, p2;
        boolean flag = true;

        for(int i = 0; i < num.length(); i++){
            p1 = i;
            p2 = num.length() - i - 1;

            if(num.charAt(p1) != num.charAt(p2)){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
