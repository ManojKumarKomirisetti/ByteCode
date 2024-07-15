/*19.Calculate Student Percentage and Print Division in Java?*/

import java.util.*;

class Student_Percentage
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Marks:");
        int TM = sc.nextInt();

        System.out.println("Enter Obtained Marks:");
        int OM = sc.nextInt();

        sc.close();
        System.out.println("Division:"+OM+"/"+TM+"="+(((float)OM/TM)));
        System.out.println("*100:"+(((float)OM/TM)*100));

        float Z = (((float)(OM)/TM)*100);
            System.out.println("Percentage:"+Z);
        }
}