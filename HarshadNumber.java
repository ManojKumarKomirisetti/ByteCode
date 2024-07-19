import java.util.*;
class HarshadNumber
{
    public static void main(String []args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number:");
            int n = sc.nextInt();
            int z = n;
            int sum=0,x=0;
            while(n>0)
            {
                 x  =  n%10;
                 //System.out.println(x);
                sum+=x;
               
                n=n/10;
            }
            if(z%sum == 0)
            {
                System.out.println("Harshad Number.");

            }
            else
            System.out.println("Not an Harshad Number:");

    }
}