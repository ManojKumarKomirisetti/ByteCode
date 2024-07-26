//1.	Write a java program to find the sum of all elements.
import java.util.*;
class ArraySum
{
    ArraySum(int n)
    {
        System.out.println("This is ArraySum Class");
    }
    public static void main(String args[])
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Array Size:");
                int n = sc.nextInt();
                int arr[] = new int[n];

                for(int i = 0; i < arr.length; i = i + 1)
                {
                    System.out.println("Enter Array a["+i+"] : ");
                    arr[i] = sc.nextInt();
                }
                sc.close();
                int sum = 0;
                for(int i=0;i<arr.length;i++)
                {
                    sum += arr[i];
                }
                System.out.println("The Sum of all Array Elements is: "+sum);

            }
}