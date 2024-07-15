/*6.Write a program to check whether a year is leap year or not?*/
import java.util.*;

class Leap_Year
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int a = sc.nextInt();
        sc.close();
            if(a%100 == 0)
         {
              if(a%400 == 0)
              {
                System.out.println(a+" is a Leap Year.");
              }
              System.out.println(a+" Not a Leap Year.");
         }
           else if(a%4 == 0)
           {
            System.out.println(a+" is a Leap Year.");
           }
           else
           {
            System.out.println(a+" is Not a Leap Year.");
           }
        
    }
}