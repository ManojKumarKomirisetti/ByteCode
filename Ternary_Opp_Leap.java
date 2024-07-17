/*11) Write a Java program to check if a given year is a leap year using the
 ternary operator?  */
import java.util.*;
class Ternary_Opp_Leap
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Year:");
       int Y = sc.nextInt();
       sc.close();
       String Str = (Y % 4 ==0)?
       ((Y % 100 == 0)?((Y % 400 == 0)?"True":"False"):"True"):"False";
       System.out.println(Str);
        
 }
}
