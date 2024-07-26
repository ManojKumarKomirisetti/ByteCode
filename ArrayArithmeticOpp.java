//8.	 Write a java program for Arithmetic operations on arrays.

import java.util.*;
class ArrayArithmeticOpp
{
    ArrayArithmeticOpp()
    {
        System.out.println("This is ArraySum Class");
    }
    public void multi(int arr[])
    {
        int count = 1;

        for(int i =0;i<arr.length;i++)
        {
            count*= arr[i];
        }
        System.out.println("This is Multiplication of all elements: "+count);

    }
    public void substract(int arr[])
    {

        System.out.println("This is Substraction of all elements with -1 : ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i] -= 1;
            System.out.println(arr[i]);
        }
       

    }

    public void modulus(int arr[])
    {
        System.out.println("This is Modulus of all elements with 2 : ");
        for(int i =0;i<arr.length;i++)
        {
           int x = arr[i] % 2;
            System.out.println(x);
        }
    }

    public void division(int arr[])
    {
        System.out.println("This is Division of all elements with 2 : ");
        for(int i =0;i<arr.length;i++)
        {
            int x = arr[i] / 2;
            System.out.println(x);
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
                int sum = 0;
                for(int i=0;i<arr.length;i++)
                {
                    sum += arr[i];
                }
                System.out.println("The Sum of all Array Elements is: "+sum);

                ArrayArithmeticOpp aa = new ArrayArithmeticOpp();
                aa.multi(arr);
                aa.substract(arr);
                aa.modulus(arr);
                aa.division(arr);


            }
}