/*
4.Aim of the program :Write a class Account containing acc_no, balance as data members and two methods as input() for taking input from user and disp() method to display the details. Create a subclass Person which has name and aadhar_no as extra data members and override disp() function. Write the complete progrm to take and print details of three persons.

Input: Enter details of three persons. 
Output: Display details of three persons.
*/

import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void input(Scanner sc) {
        super.input(sc);

        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
    }

    @Override
    void disp() {
        super.disp(); 
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] persons = new Person[3];

        System.out.println("Enter details of three persons:");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
        }

        System.out.println("\nDisplay details of three persons:");

        for (int i = 0; i < 3; i++) {
            persons[i].disp();
        }

        sc.close();
    }
}

