/*11.Write a program to input week number and print week day?
*/
import java.util.*;

class WeekNum_Day
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter WeekNumber:");
        char c = sc.next().charAt(0);
        sc.close();
        System.out.println(c);

            switch(c)
            {
                case '0':
                System.out.println("Sunday");
                break;
                case '1':
                System.out.println("Monday");
                break;
                case '2':
                System.out.println("Tuesday");
                break;
                case '3':
                System.out.println("Wednesday");
                break;
                case '4':
                System.out.println("Thursday");
                break;
                case '5':
                System.out.println("Friday");
                break;
                case '6':
                System.out.println("Saturday");
                break;


            }
           // System.out.println((int)c);


            switch((int)c)
            {
                case 48:
                System.out.println("Sunday");
                break;
                case 49:
                System.out.println("Monday");
                break;
                case 50:
                System.out.println("Tuesday");
                break;
                case 51:
                System.out.println("Wednesday");
                break;
                case 52:
                System.out.println("Thursday");
                break;
                case 53:
                System.out.println("Friday");
                break;
                case 54:
                System.out.println("Saturday");
                break;


            }

            
    }
}