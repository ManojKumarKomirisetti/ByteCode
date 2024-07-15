/*6) Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the 
conditions 'a < 50' and 'a < b' are true*/
import java.util.Scanner;
 class Num_Compare
 {
     public static void main(String Args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a and b values: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         if(a<50)
         {
            System.out.print("It Is True That a<50");
         }
         else{
            System.out.println("False:a>50");
         }

         if(a<b)
         {
            System.out.print("It Is True That a<b");
         }
         else{
            System.out.println("False:a>b");
         }

        }
 }