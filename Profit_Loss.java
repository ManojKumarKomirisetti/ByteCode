/*16.Write a program to calculate profit or loss?*/

import java.util.*;

class Profit_Loss
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price:");
        int CP = sc.nextInt();
        System.out.println("Enter Selling Price:");
        int SP = sc.nextInt();
        sc.close();
                if(CP > SP)
            System.out.println("Loss:"+(CP-SP)+"\n"+"Loss Percentage:"+(((float)(CP-SP)/CP)*100));
            else
            System.out.println("Profit:"+(SP-CP)+"\n"+"Profit Percentage:"+(((float)(SP-CP)/CP)*100));  
    }
}