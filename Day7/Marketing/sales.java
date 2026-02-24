//In Marketing package define a class ‘sales’ which is extending from ‘employee’ class and has a method  tallowance() which calculates Travelling Allowance as 5% of total earning. Write the programs to find out total earning of a sales person for the given basic salary amount and print along with the emp id.
// 	Input:  	Enter the employee id and emploee name 123   Amit
// Enter the basic salary 1000
// Output:	The emp id of the employee is 123
// The total earning is 1950.0


package Day7.Marketing;

import Day7.General.employee;

public class sales {
  public void tallowance(int empid, String empname, double basic) {
    employee emp = new employee(empid, empname);
    double totalEarnings = emp.earnings(basic);
    double travelAllowance = 0.05 * totalEarnings;
    double finalEarnings = totalEarnings + travelAllowance;
    System.out.println("The emp id of the employee is " + empid);
    System.out.println("The total earning is " + finalEarnings);
  }
  public static void main(String[] args) {
    System.out.println("Enter the employee id and employee name:");
    System.out.println("Enter the basic salary:");
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int empid = scanner.nextInt();
    String empname = scanner.next();
    double basic = scanner.nextDouble();
    sales salesPerson = new sales();
    salesPerson.tallowance(empid, empname, basic);
    scanner.close();
  }

}
