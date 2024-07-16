/*25.Write a java program that accepts three numbers from the user 
and check if numbers are in "increasing" or "decreasing" order*/


import java.util.*;

class Increase_Decrease_Order
{
    Increase_Decrease_Order(float L,float B,float H)
    {
        System.out.print((L>B)?((B>H)?"Decreasing Order":"Not in any order"):((B<H)?"Increasing Order":"Not in any order"));


    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num1:");
        float Length = sc.nextFloat();
       
        System.out.println("Enter Num2:");
        float Breadth = (float)sc.nextDouble();

        System.out.println("Enter Num3:");
        float Height = sc.nextFloat();

        sc.close();

        Increase_Decrease_Order obj = new Increase_Decrease_Order(Length,Breadth,Height);
           
            
    }
}
