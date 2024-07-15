/*10) Write a Java program to compare 
two characters and print the results? */
import java.util.*;
class Char_Compare
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Two Charecters:");
       char r = sc.next().charAt(0);
       char q = sc.next().charAt(0);
       System.out.println((r==q));
        sc.close();
 }
}
