/*15.Write a program to check whether the triangle is equilateral, isosceles or scalene triangle?
*/
import java.util.*;

class Triangle_Type
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1:");
        int a = sc.nextInt();
        System.out.println("Enter Side 2:");
        int b = sc.nextInt();
        System.out.println("Enter Side 3:");
        int c = sc.nextInt();
        sc.close();
                if(a==b&&a==c)
            System.out.println("It is an Equilateral Triangle.");
            else if(a==b||a==c||b==c)
            System.out.println("It is an isosceles Triangle.");

            else
            System.out.println("It is an Scalen Triangle.");

            
    }
}