//4.	Write  a program to reverse  the array.


import java.util.*;
class ReverseOfArray
{
    ReverseOfArray(int arr[])
    {
        System.out.println(" Array In Reverse:");
        for(int i = arr.length -1;i>=0;i--)
        {
            System.out.println(arr[i]);
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
                
                ReverseOfArray rf = new ReverseOfArray(arr);
                
            }
}