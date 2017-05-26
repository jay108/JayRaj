package javaapplication1;
import java.util.*;

class StackDemo
{
    protected int data;
    protected StackDemo ref;
}
class ImplementStack
{
    static int top=-1;
     StackDemo sd[];
 
    Scanner in=new Scanner(System.in);
    public ImplementStack(int N)
    {
     
      // StackDemo init=new StackDemo();
        sd[N]=new StackDemo();
        
       // String yn;
        for(int i=0;i<N;i++)
        {
            if(top==-1)
            {
               top++;
                sd[i].ref=new StackDemo();
                System.out.println("Enter Data:");
                sd[i].data=in.nextInt();
                System.out.println("Inserted Element at "+top+"th position");
            }
            else
            {
                top++;
                sd[i].ref=new StackDemo();
                sd[i].data=in.nextInt();
                System.out.println("Inserted Element at "+top+"th position");
            }
        }
    }
    public void pushElement(int position,int size)
    {
            sd[position].data=in.nextInt();
            System.out.println("Data Changed at"+position+"position" );
    }
    public void popElement(int position)
    {
        System.out.println("Position at"+position +"th position" +"Value is"+sd[position].data);
    }
    public void searchElement(int element,int size)
    {
        for(int i=0;i<size;i++)
        {
            if(sd[i].data==element)
            {
                System.out.println(" Data at" + i +"th"+sd[i].data);
                break;
            }
        }
    }
}
public class Stack 
{
    public static void main(String arg[])
    {
        int size;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter How Many Size of stack you want to create:");
        size=in.nextInt();
        ImplementStack stack=new ImplementStack(5);
        stack.searchElement(50, size);
    }
}
