import java.io.*;
public class ReadingCharacter {
    public static void main(String[] args) throws IOException {
       char c;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a character: q to quit");
       do {
           c = (char) br.read();
           System.out.println("You entered: " + c);
       } while (c != 'q');
    }
}