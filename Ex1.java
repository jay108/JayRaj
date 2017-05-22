package javaapplication1;
import java.util.*;
public class Ex1 {

	   public static void main(String arg[])
           {
               ExceptionDemo ed=new ExceptionDemo();
               try
               {
                    ed.print();
               }
               catch(Exception e)
               {
                   e.printStackTrace();
               }
           }

	}
class ExceptionDemo
{
    public void print()throws Exception
    {
        throw new Exception("This is Handeled by another Method..");
    }
    
}