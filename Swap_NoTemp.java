/*13) Write a Java function to swap two variables without using a third variable?*/
import java.util.*;
class Swap_NoTemp
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number:");
       int Y = sc.nextInt();
       int Z = sc.nextInt();
       sc.close();
   Y = Y+Z;
   Z = Y-Z;
   Y = Y-Z;
    System.out.println(Y +" "+Z);
        
 }
}