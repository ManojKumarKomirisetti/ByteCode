/*13.Write a program to count total number of notes in given amount?*/

import java.util.*;

class NoteCount
{

    NoteCount(int Five,int Two,int Hun,int Fty,int TM)
    {

        while(TM>=0)
        {
            
            TM-=500*Five;
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total 500 Notes:");
        int Five = sc.nextInt();

        System.out.println("Enter Total 200 Notes:");
        int Two = sc.nextInt();

        System.out.println("Enter Total 100 Notes:");
        int Hund = sc.nextInt();

        System.out.println("Enter Total 50 Notes:");
        int Fty = sc.nextInt();

        System.out.println("Enter Total Amount:");
        int TM = sc.nextInt();

        sc.close();

        NoteCount nc = new NoteCount(Five,Two,Hun,Fty,TM); 
        
        }
}