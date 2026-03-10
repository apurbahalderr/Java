// Write a program in Java to copy the content of a given file to another user entered file using character stream (using File Reader and FileWriter Classes)  and byte Stream (using FileInputStream and FileOutputStream Class).
// Input: Enter the source file name -  sourcefile.txt  (Assume Input file exists in the system)
// Enter the destination file name -   destinationfile.txt
// Output: File Copied
package Day8;

import java.io.*;
import java.util.Scanner;
public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source file name: ");
        String sfn = sc.nextLine();
        System.out.print("Enter the destination file name: ");
        String dfn = sc.nextLine();

        try (FileReader fr = new FileReader(sfn);
             FileWriter fw = new FileWriter(dfn)) {
            int character;
            while ((character = fr.read()) != -1) {
                fw.write(character);
            }
            System.out.println("File copied using character stream.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file using character stream: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(sfn);
             FileOutputStream fos = new FileOutputStream(dfn)) {
            int bytesRead;
            while ((bytesRead = fis.read()) != -1) {
                fos.write(bytesRead);
            }
            System.out.println("File copied using byte stream.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file using byte stream: " + e.getMessage());
        }
     sc.close();
    }
}
