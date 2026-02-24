


import java.io.*;
public class ReadingStrings {
    public static void main(String[] args) throws IOException {
       String str;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a character: q to quit");
       do {
              str = br.readLine();
              System.out.println(str);
         } while (!str.equals("q"));    
    }
}