import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void displayArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        r1.displayArea();

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        sc.close();
        Rectangle r2 = new Rectangle(l, b);
        r2.displayArea();
    }
}
