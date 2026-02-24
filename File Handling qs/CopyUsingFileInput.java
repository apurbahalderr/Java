import java.io.*;
public class CopyUsingFileInput {
    public static void main(String[] args) {

            try {
                FileOutputStream fout = new FileOutputStream("copy.txt");
                String s= "Welcome to Java Programming";
                byte b[]=s.getBytes();
                fout.write(b);
                fout.close();
                
                System.out.println("File Copied Successfully");
                FileInputStream fin = new FileInputStream("copy.txt");
                int i;
                while ((i = fin.read()) != -1) {
                    System.out.print((char)i);
                }
                fin.close();
            } catch (IOException e) {
                System.out.println("File Error");
            }
        }
}