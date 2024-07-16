/*23.Sum All Three Angles and Check Equal or Not in Java?*/



import java.util.*;

class TriAngleSum
{
    TriAngleSum(int A1,int A2,int A3)
    {
        if((A1+A2+A3) == 180)    
        System.out.print("Valid Triangle Since the Sum of Angle is 180");
           else
           System.out.print("Not a Valid Triangle Since the Sum of Angle is not 180");

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Angle 1:");
        int A1 = sc.nextInt();
       
        System.out.println("Enter Angle 2:");
        int A2 = sc.nextInt();

        System.out.println("Enter Angle 3:");
        int A3 = sc.nextInt();

        sc.close();

        TriAngleSum obj = new TriAngleSum(A1,A2,A3);
           
            
    }
}