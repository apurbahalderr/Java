import java.util.Scanner;

interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        double total = basic + da + hra;
        System.out.println("Earnings - " + (int) total);
    }

    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + (int) pf);
    }
}

class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus - " + (int) bonus);
    }
}

public class SalaryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);
        s.earnings();
        s.deductions();
        s.bonus();
        sc.close();
    }
}
