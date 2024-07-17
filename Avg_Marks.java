
/*If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), 
write a program to calculate his total marks and percentage marks.*/


import java.lang.*;
import java.util.*;

class Avg_Marks
{
    public static void main(String args[])
    {
        int M = 0, P = 0, C = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The 3 Subjet Values");
        M = sc.nextInt();
        P = sc.nextInt();
        C = sc.nextInt();
        
        System.out.println("Total Marks:"+(M+P+C));
        System.out.println("Average Marks:"+((M+P+C)/3));
    }
}