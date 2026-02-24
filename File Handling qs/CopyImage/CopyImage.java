
import java.io.*;

class CopyImage{

    public static void main(String args[]) throws IOException{

    int i;
    FileInputStream fin;
    FileOutputStream fout;
    try{
        fin = new FileInputStream(args[0]);
    }

    catch(FileNotFoundException e){
        System.out.println("File Not Found");
        return;
    }

    try{
        fout = new FileOutputStream(args[1]);
    }
    catch(IOException e){
        System.out.println("Error Opening Output File");
        fin.close();
        return;
    }
    try{
        do {
            i=fin.read();
            if(i!=-1)
            fout.write(i);
        } while (i!=-1);

        System.out.println("File Copied Successfully");
    }
    catch (IOException e){
        System.out.println("File Error");
    }

fin.close();

fout.close();

}}