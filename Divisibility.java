/*4.Write a program to check whether a number is divisible by 5 and 11 or not?*/


import java.util.*;
class Divisibility
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter  Number:");
       int a = sc.nextInt();
       if(a%5 == 0)
       {
        if(a%11 == 0)
        {
          System.out.println("A is Divided by both 5 and  11");
        }
        else{
          System.out.println("A is Divided by only 5");
        }
       }
       
       else
       System.out.println("A is Divided by None of 5 and 11");
 }
}