/*4.Write a program to check whether a number is divisible by 5 and 11 or not?*/

/*3.Write a program to check whether a number is negative, positive or zero?*/
import java.util.*;
class Neon_Number
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter  Number:");
       int a = sc.nextInt();
       sc.close();
       int n = a*a;
       int sum = 0;
       while(n>0)
       {
        int x = n%10;
        sum += x;
        n = n/10;
       }
       if(sum == a)
       {
        System.out.println(a+"  Is Neon Number");

       }
        else{
          System.out.println(a+" Is not an Neon Number");
        }
      }
}