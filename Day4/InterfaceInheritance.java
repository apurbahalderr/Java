import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {

    int empid, deptid;
    String empname, deptname;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        empid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        empname = sc.nextLine();
        sc.close();
    }

    public void getDeptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department id: ");
        deptid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department name: ");
        deptname = sc.nextLine();
        sc.close();
    }


    void display() {
        System.out.println("\nEmployee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Department ID: " + deptid);
        System.out.println("Department Name: " + deptname);
    }
}

// Driver class
public class InterfaceInheritance {
    public static void main(String[] args) {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();

    }
}
