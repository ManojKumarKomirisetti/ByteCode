import java.util.*;
public class StoringValuesInMultipleObjects extends Object
 {
   static int i = 0;
    int empid = 0;
     String name = null;
     int Salary  = 0;
     static StoringValuesInMultipleObjects obj;
     static Object Array[];
    StoringValuesInMultipleObjects(int empid,String name, int Salary)
    {
        this.empid = empid;
        this.name = name;
        this.Salary = Salary;
        

    }
    public static void main(String [] args)
 {
    Scanner sc = new Scanner(System.in);
    
     int empid = 0;
     String name = null;
     int Salary  = 0;

    while(i<3)
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
    obj = new StoringValuesInMultipleObjects(empid, name, Salary);
    Array[i] = obj;
    i++;
    }
    sc.close();
 }   
 }
