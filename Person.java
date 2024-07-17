/*2.Write a Java class called Employee that extends Person and adds a private field for
salary. Create a constructor that takes in a name, age, and salary as parameters and
initializes the fields using the super keyword to call the Person constructor. Also,
create a method called displaySalary that prints out the employee's salary.*/

public class Person
{
    private String name;
    private int age;
    private int salary;
   
    public void introduce()
    {
        System.out.println("Here I am Introducing Mr./Ms. "+name+" Age "+age+"salary "+salary);
    }

}

class Employee_Constructor extends Person{
    Employee_Constructor(String name,int age, int salary)
        {
            super.name = name;
            super.age = age;
            super.salary = salary;
        }
    public static void main(String args[])
    {
        Employee_Constructor obj = new Employee_Constructor("ManojKumar",22,500000);
    }
}