package javaapplication1;
import java.util.Enumeration;
import java.util.Vector;
public class EnumDemo 
{
    public static void main(String arg[])
    {
         Vector v=new Vector();
        for(int i=0;i<10;i++)
        {
            v.addElement(i);
        }
            System.out.println(v);
            Enumeration e=v.elements();
            while(e.hasMoreElements())
            {
                int j=(Integer)e.nextElement();
                System.out.println("Enum is" + j);
            
            }
    }
   
}
