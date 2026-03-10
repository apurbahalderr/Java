  //    -Write a java program that displays the number of characters, no. of lines and no. of words present in a text file whose name is given by the user.
	// Input: Name of the file - filename
	// Output: No. of characters - A,
	// 	    No .of  lines  - B
	// 	    No . of words - C

package Day8;
import java.io.*;
import java.util.Scanner;

public class display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file:");
        String fileName = sc.next();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int characterCount = 0;
            int lineCount = 0;
            int wordCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                characterCount += line.length();
                wordCount += line.split("\\s+").length; // Split by whitespace
            }

            System.out.println("No. of characters: " + characterCount);
            System.out.println("No. of lines: " + lineCount);
            System.out.println("No. of words: " + wordCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        sc.close();
    }
}
