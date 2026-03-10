// Write a java program which will accept students details like Student RollNo, Name, Subject, Marks from the keyboard using scanner class, stored the same in a file. Again open the file, read the content and display all.
// Input: Enter student details -   Rollno, name, subject, marks
// Enter the name of existing file to which student details will be written.
// Output: Display the content of existing file
package Day8;
import java.io.*;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details - Rollno, name, subject, marks");
        int rollNo = sc.nextInt();
        String name = sc.next();
        String subject = sc.next();
        int marks = sc.nextInt();

        System.out.println("Enter the name of existing file to which student details will be written.");
        String fileName = sc.next();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(rollNo + "," + name + "," + subject + "," + marks);
            writer.newLine();
            System.out.println("Student details written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        System.out.println("Content of the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        sc.close(); 
    }
  }
