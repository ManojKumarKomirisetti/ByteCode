/*Greatest of four numbers using nested ternary operator*/
import java.util.*;
class GreatOf4  
 {
     public static void main(String Args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 4 Numbers:");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       sc.close();
      String Str = 
                     (     (a>b) ? ((b>c)?((c>d)?"A":((a>d)?"A Is Great":"D Is Great")):((c>d)?"C Is Great":"D Is Great"))    : ((b>c)?((c>d)?"A Is Great":((a>d)?"A Is Great":"D Is Great")):((c>d)?"C Is Great":"D Is Great"))   );


                     
      System.out.println(Str);
        
 }
}