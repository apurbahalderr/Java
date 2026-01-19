import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate Constructor Called");
        System.out.println("Length = " + length);
        System.out.println("Width  = " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box Constructor Called");
        System.out.println("Height = " + height);
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox(double length, double width, double height, double thick) {
        super(length, width, height);
        this.thick = thick;
        System.out.println("WoodBox Constructor Called");
        System.out.println("Thickness = " + thick);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double thick = sc.nextDouble();

        new WoodBox(length, width, height, thick);

        sc.close();
    }
}
