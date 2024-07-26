//3.	Count no of odd and even elements in an array.


import java.util.*;
class ArrayEvenOdd
{
    ArrayEvenOdd()
    {
        System.out.println("This is ArrayEvenodd class");
    }
    public static void main(String args[])
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Array Size:");
                int n = sc.nextInt();
                int Ceven = 0 , Codd = 0;
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
                    Ceven += 1;
                    else 
                    Codd += 1;

                }
System.out.println("No of Even Numbers: "+Ceven);
System.out.println("No of Odd Numbers: "+Codd);

            }
}