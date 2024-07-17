/*4.Write a Java class called Student with private fields for name, age, and GPA.
Create two constructors - one that takes in a name, age, and GPA as parameters and
initializes the fields, and another that takes in just a name and age as parameters
and sets the GPA to 0.0. Also, create a method called displayGPA that prints out the
student's GPA.*/

class StudentCon
{
    private String name;
    private int age;
    private float GPA;
    static StudentCon sc ;

    StudentCon(String name,int age, float GPA)
    {
            this.name = name;
            this.age = age;
            this.GPA = GPA;
            
    }

    StudentCon(String name, float GPA)
    {
            this.GPA = GPA;
    }
    static
    {
        sc = new StudentCon("Manoj",22,9.01f);
         sc = new StudentCon("Manoj",9.01f);
        
System.out.println("GPA:"+sc.GPA);
        
    }

    public static void main(String[] args) 
    {
       // sc = new StudentConstructor("Manoj",0.0);
     //  System.out.println("GPA:"+sc.GPA);
    }
}