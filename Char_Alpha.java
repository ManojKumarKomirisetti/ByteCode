/*7.Write a program to check whether a character is alphabet or not?*/
import java.util.*;

class Char_Alpha
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Charecter:");
        char c = sc.next().charAt(0);
        sc.close();
            if(c>=65 && c<=90 || c>=97 && c<=122)
            System.out.println(c+" It is a Charecter.");
            else
            System.out.println(c +" It is not a Charecter.");
            
            if(c>='a' && c<='z' || c>='A' && c<='Z')
            System.out.println(c+" It is a Charecter.");
            else
            System.out.println(c +" It is not a Charecter.");
            
char a = 97; 

            System.out.println((int)c);
            System.out.println((float)c);
            System.out.println((short)c);
            System.out.println((char)a);
            System.out.println(z);

            
    }
}