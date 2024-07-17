/*1.Write a program to find maximum between two numbers?*/
import java.util.*;
class Conditional_Sta_ab_Max
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 2 Numbers:");
       int a = sc.nextInt();
       int b = sc.nextInt();
       if(a>b)              
       System.out.println(a+"     A is Greater");
       else
       System.out.println(b+"  B is Greater");
        System.out.println("Using Ternary Operator");
        System.out.println((a>b)?a:b);
 }
}