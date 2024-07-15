/*10.Write a program to check whether a character is uppercase or lowercase alphabet?
*/
import java.util.*;

class Lower_UpperCase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Charecter:");
        char c = sc.next().charAt(0);
        sc.close();
            if(c>='a' && c<='z' )
            System.out.println("It is an LowerCase");
            else if(c>='A' && c<='Z')
            System.out.println("It is an UpperCase.");
            else
            System.out.println("It is Not an Alphabet");

            
    }
}