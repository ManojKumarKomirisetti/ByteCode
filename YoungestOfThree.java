/*22.Find Youngest Age in Three in Java?*/


import java.util.*;

class YoungestOfThree
{
    YoungestOfThree(int P1,int P2,int P3)
    {
            System.out.print((P1<P2)?((P1<P3)?("P1 is Youngest "+P1):("P2 is youngest "+P2)):((P2<P3)?("P2 is Youngest "+P2):("P3 is Youngest "+P3)));
           
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Age of Person 1:");
        int P1 = sc.nextInt();
       
        System.out.println("Enter Age of Person 2:");
        int P2 = sc.nextInt();

        System.out.println("Enter Age of Person 3:");
        int P3 = sc.nextInt();

        sc.close();

        YoungestOfThree obj = new YoungestOfThree(P1,P2,P3);
           
            
    }
}