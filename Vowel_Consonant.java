/*8.Write a program to input any alphabet and check whether it is vowel or consonant?
*/

import java.util.*;

class Vowel_Consonant
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Charecter:");
        char c = sc.next().charAt(0);
        sc.close();
            if(c=='a'  || c=='e'||c=='i'||c=='o'||c=='u'|| c=='A'  || c=='E'||c=='I'||c=='O'||c=='U')
            System.out.println("It is an Vowel");
            else
            System.out.println("It is Consonant");

            
    }
}