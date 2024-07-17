/*1.Write a Java class called Person with private fields for name and age. Create a
constructor that takes in a name and age as parameters and initializes the fields.
Also, create a method called introduce that prints out a message introducing the
person with their name and age.
*/

public class Person_Constructor
{
    private String name;
    private int age;
    Person_Constructor(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void introduce()
    {
        System.out.println("Here I am Introducing Mr./Ms. "+name+" Age "+age);
    }


    public static void main(String [] Args)
    {
        Person_Constructor obj = new Person_Constructor("Manoj Kumar",22);
        obj.introduce();
    }


}