import java.util.Scanner;

class Area {

    // Area of Circle
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }

    // Area of Triangle
    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }

    // Area of Square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        System.out.println("Enter base and height of Triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.print("Enter side of Square: ");
        int side = sc.nextInt();
        sc.close();

       obj.area(radius);          // Circle
       obj.area(base, height);    // Triangle
        obj.area(side);           // Square
    }
}