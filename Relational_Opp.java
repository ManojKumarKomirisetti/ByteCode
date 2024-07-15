/*9)  Write a Java program to compare two integers using 
relational operators and Write the results? */
import java.util.*;
class Relational_Opp
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter numbers:");
       int a  = sc.nextInt();
       int b = sc.nextInt();
        System.out.println("a>b:"+(a>b));
        System.out.println("a<b:"+(a<b));
        System.out.println("a>=b:"+(a>=b));
        System.out.println("a<=b:"+(a<=b));
        System.out.println("a=b:"+(a==b));
        System.out.println("a!=b:"+(a!=b));
        }
 }