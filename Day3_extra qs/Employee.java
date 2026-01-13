/*2.Aim of the program :  Write a program in java to input and display the details of n number of Employees having e-ID, name, department, add_emp and basic as data members. Address is a class, whose object is add_emp used as member of the class Employee. Also display the total salary of each employee.
Input:   Enter e-ID, name, department, add_emp and basic of each employee.
Output: Display the details of ‘n’ number of employees along with salary information.
*/
import java.util.Scanner;

class Address {
  String city;
  int pin;
  Address(String city, int pin){
    this.city = city;
    this.pin = pin;
  }
}

class EmployeeDet {
  int e_ID;
  double basic;
  String name;
  String department;
  Address add_emp;
  
  EmployeeDet(int id, double basic, String name, String department, String city, int pin){
    this.e_ID = id;
    this.basic = basic;
    this.name = name;
    this.department = department;
    this.add_emp = new Address(city, pin);
  }
  
@Override
 public String toString(){
    return "Employee ID: " + e_ID + "Basic: " + basic + "Name: " + name  + "Department: " + department + "Address: " + add_emp.city + " " + add_emp.pin;
  } 
}

public class Employee{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of employees: ");
    int n = sc.nextInt();
    sc.nextLine();
    EmployeeDet[] employees = new EmployeeDet[n];
    for(int i = 0; i < n; i++){
      System.out.println("Enter the details of employee" + (i+1) + ":" );
      int e_ID = sc.nextInt();
      double basic = sc.nextDouble();
      sc.nextLine();
      String name = sc.nextLine();
      String department = sc.nextLine();
      String city = sc.nextLine();
      int pin = sc.nextInt();
      employees[i] = new EmployeeDet(e_ID, basic, name, department, city, pin);
    }
    
    //Printing the details
    for(EmployeeDet employee: employees){
      System.out.println(employee);
    }
  }
}
