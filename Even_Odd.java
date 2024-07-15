/*5.Write a program to check whether a number is even or odd? */
import java.util.*;

class Even_Odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int a = sc.nextInt();
        sc.close();
        if(a%2 == 0 )
        System.out.println(a+" Is Even.");
        else
        System.out.println(a+" Is Odd");
    }
}