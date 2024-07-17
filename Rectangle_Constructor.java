/*3.Write a Java class called Rectangle with private fields for length and width. Create
a constructor that takes in a length and width as parameters and initializes the fields.
Also, create a method called calculateArea that returns the area of the rectangle
(length * width).*/

class Rectangle_Constructor
{
    private int  length;
    private int  width;
    static Rectangle_Constructor rc;

    Rectangle_Constructor(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public static void calculateArea()
    {
        System.out.println("Area:"+(rc.length * rc.width));
    }

    public static void main(String[] qyk)
    {
         rc = new Rectangle_Constructor(10,20);
       calculateArea();
    }
}