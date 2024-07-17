/*5) Write a Java program that takes five numbers as input
 to calculate and print the average of the numbers
*/
import java.util.Scanner;
 class AverageOf5
 {
     public static void main(String Args[])
     {
         Scanner sc = new Scanner(System.in);
         int arr[] = new int[4];
         for(int i = 0; i<5 ;i++)
         {
            System.out.println("Enter arr["+i+"]");
            arr[i] = sc.nextInt();
         }
         int sum = 0;
         float avg = 0;
         for(int i = 0;i<arr.length;i++ )
         {
            sum+=arr[i];
         }
         avg = ((sum / (float)arr.length));
         System.out.println(avg);
     }
 }