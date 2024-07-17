/*2.Write a Java class called Employee that extends Person and adds a private field for
salary. Create a constructor that takes in a name, age, and salary as parameters and
initializes the fields using the super keyword to call the Person constructor. Also,
create a method called displaySalary that prints out the employee's salary.*/

 class Person
{
     String name;
     int age;
     Person(String name, int age)
     {
         this.name = name;
         this.age = age;
     }
   

}

class Employee_Constructor extends Person
{

    private int salary;

    Employee_Constructor(String name,int age, int salary)
        {
            super(name,age);
            this.salary = salary;
        }

        //public static void displaySalary()
    static
        {
        Employee_Constructor obj = new Employee_Constructor("ManojKumar",22,500000);
        System.out.println("Here I am Introducing Mr./Ms. "+obj.name+" Age "+obj.age+" Salary:"+obj.salary);

        }

        public static void main(String args[])
        {
            //obj.displaySalary();
           // displaySalary();
           System.out.println("Manoj kumar");
        }
    

}