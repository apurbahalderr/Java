import java.util.Scanner;

abstract class Student {
    int rollno;
    long regno;

    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollno = sc.nextInt();
        System.out.print("Enter Registration No: ");
        regno = sc.nextLong();
        sc.close();
    }

    abstract void course();
}

class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

public class Abstract {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getinput();
        k.display();
    }
}
