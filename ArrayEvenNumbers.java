//2.	Write a program to print even elements in a given array

import java.util.*;
class ArrayEvenNumbers
{
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
                
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i] % 2 == 0)
                    System.out.println(arr[i]);

                }

            }
}