/*3.Write a program to check whether a number is negative, positive or zero?*/
import java.util.*;
class Positive_Nagative
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter  Number:");
       int a = sc.nextInt();
       if(a>=0)
       {
        if(a==0)
        {
          System.out.println("A is Zero");
        }
        else{
          System.out.println("A is Positive Number");
        }
       }
       
       else
       System.out.println("A is Negative");
 }
}