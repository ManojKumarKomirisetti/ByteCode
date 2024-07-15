/*12) Write a Java program to determine the sign of a given number
 (positive, negative, or zero) using the ternary operator? */
import java.util.*;
class Ternary_Opp1
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number:");
       int Y = sc.nextInt();
       sc.close();
       String Str = (Y == 0)?"The Num is Zero":((Y>0)?"It is a Positive Number":"Itis a Negative Number");
       System.out.println(Str);
        
 }
}