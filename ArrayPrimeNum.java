// 5.	Write a program to print prime numbers in an array.

import java.util.*;
class ArrayPrimeNum
{
    int count = 0;
    ArrayPrimeNum(int arr[])
    {
        System.out.println(" Prime Prints:");
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 2;j< (arr[i]/2) ;j++)
            {
                if(arr[i]%2 == 0)
                {
                    count+=1;
                }
            }
            if(count == 0)
            {
                System.out.println(arr[i] + " is an Prime number");
            }
            else{
                System.out.println(arr[i] + " is an not a Prime number");
            }
        }
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
                
                ArrayPrimeNum ap = new ArrayPrimeNum(arr);
                /*ReverseOfArray rf = new ReverseOfArray(arr);
                ArraySum as = new ArraySum(10);*/
                ArrayEvenOdd obj = new ArrayEvenOdd();

            }
}