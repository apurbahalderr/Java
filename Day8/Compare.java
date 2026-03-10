// //Write a java program to compare two binary files, printing the first byte position where they differ.
// Input: Specify two binary files in the program (Assume two files  are exist in the 			system)
// Output: Two files are equal
// Input: Specify two binary files in the program
// Output: Two files are not equal: byte position at which two files differ is 30


package Day8;
import java.io.*;


public class Compare {
    public static void main(String[] args) {
        String file1 = "file1.bin"; // Specify the first binary file
        String file2 = "file2.bin"; // Specify the second binary file

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            int position = 0;
            boolean areEqual = true;

            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    areEqual = false;
                    break;
                }
                position++;
            }

            if (areEqual && fis1.read() == -1 && fis2.read() == -1) {
                System.out.println("Two files are equal.");
            } else {
                System.out.println("Two files are not equal: byte position at which two files differ is " + position);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while comparing the files: " + e.getMessage());
        }
    }

}
