package javaapplication1;
import java.io.*;

public class FileHandle 
{
    public static void main(String arg[])
    {
        int length;
        byte[] buffer=new byte[1024];
        FileOutputStream fout;
        try
        {
            File f=new File("C:\\Users\\Jay-PC\\Downloads\\jay.txt");
            File f2=new File("C:\\Users\\Jay-PC\\Downloads\\jay1.txt");
            FileInputStream fin=new FileInputStream(f);
            fout=new FileOutputStream(f2);
            while((length=fin.read(buffer))>0)
            {
                fout.write(buffer);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
