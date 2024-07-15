/*9.Write a program to input any character and check whether it is alphabet, 
digit or special character?*/

import java.util.*;

class Alpha_Numeric_Special
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Charecter:");
        char c = sc.next().charAt(0);
        sc.close();
            if(c>='a' && c<='z' || c>='A' && c<='Z')
            System.out.println("It is an Alphabet");
            else if(c>=48 && c<=57)
            System.out.println("It is a Numeric.");
            else
            System.out.println("It is a Special Charecter.");

            
    }
}