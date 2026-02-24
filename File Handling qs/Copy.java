import java.io.*;
public class Copy
{
    public static void main(String[] args) throws IOException {
        File inpuFile = new File("input.txt");
        File outputFile = new File("output.txt");
        FileReader in = new FileReader(inpuFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        System.out.println("File Copied Successfully");
        in.close();
        out.close();
     }
}