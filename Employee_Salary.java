/*18.Employees Year of Service Salary Bonus in Java?*/

import java.util.*;

class Employee_Salary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Employee Service Years:");
        int Service = sc.nextInt();

        System.out.println("Enter Employee Salary:");
        int Salary = sc.nextInt();
        sc.close();
        System.out.println("Name:"+name+"\n"+"Service:"+Service+" Years"+"\n"+"Total Salary:");
        System.out.println((Service >= 10 && Service < 20)?(Salary+10000):((Service>=20 && Service<30)?(Salary+15000):((Service >= 30)?(Salary+25000):(Salary+5000))));
        

        
        
        }
}