/*2.Write a program to find maximum between three numbers?*/
import java.util.*;
class GreaterOf3
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 3 Numbers:");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       if(a>b)
       {
        if(a>c)
        {
          System.out.println("A is Greatest of All");
        }
        else{
          System.out.println("C is Greatest of All");
        }
       }
       else if(b>c)
       {
        System.out.println("B is Greater Of All");
       }
       else
       System.out.println("C is Greater of All");
 }
}