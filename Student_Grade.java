/*17.Calculate Student Percentage and Grade in Java?*/

import java.util.*;

class Student_Grade
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Marks:");
        int TM = sc.nextInt();

        System.out.println("Enter Obtained Marks:");
        int OM = sc.nextInt();

        sc.close();
        float Z = (((float)(OM)/TM)*100);
            System.out.println("Percentage:"+Z);
            System.out.println((Z>=90.0)?"A Grade":((Z>=80.0)?"B Grade":((Z>=70.0)?"C Grade":"D Grade")));
        }
}