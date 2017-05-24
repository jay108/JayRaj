package javaapplication1;
import java.util.*;
//Enterd Text is "racecar"
public class PelindromeExample 
{
    static boolean isPelindrome(String word)
    {
        int k=0;
         for(int i=0;i<word.length()/2;i++)
         {
             if(word.charAt(i)==word.charAt(word.length()-1-i))
             {
                k++; 
             }
         }
         if(k==word.length()/2)
         {
             return true;
         }
         else
         {
            return false;
         }
    }
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Text:");
        String pd=in.nextLine();
        if(isPelindrome(pd))
        {
            System.out.println("It is Pelindrome");
        }
        else
        {
            System.out.println("It is not Pelindrome");
        }
    }
}
