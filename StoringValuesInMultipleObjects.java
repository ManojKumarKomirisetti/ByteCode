import java.util.*;
public class StoringValuesInMultipleObjects
 {
    static int empid = 0;
    static String name = null;
    static int Salary  = 0;
    public static void main(String [] args)
 {
    Scanner sc = new Scanner(System.in);
    int i = 3;
    while(i>=0)
    {
         empid = 0;
         name = null;
         Salary  = 0;
    System.out.println("Enter Employee Id:");
    empid = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Employee Name:");
    name = sc.nextLine();
    System.out.println("Enter Employee Salary:");
    Salary = sc.nextInt();
    i++;
    }
    sc.close();
 }   
 }
