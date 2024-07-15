/*14.Write a program to input angles of a triangle and check whether triangle is valid or not?*/
import java.util.*;

class Triangle_Angle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Angle 1:");
        int a = sc.nextInt();
        System.out.println("Enter Angle 2:");
        int b = sc.nextInt();
        System.out.println("Enter Angle 3:");
        int c = sc.nextInt();
        sc.close();
                if((a+b+c) == 180)
            System.out.println("It is an Valid Triangle.");
            else
            System.out.println("It is an InValid Triangle.");

            
    }
}