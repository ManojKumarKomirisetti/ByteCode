//Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.
import java.lang.*;
class Tri_Peri
{
    public static void main(String args[])
    {
        int a = 2, b = 3, c = 5;
        float S = (a+b+c) / 2 ;
        float area1 = (S*(S-a)*(S-b)*(S-c));
       double area2 =  Math.pow(area1,0.5);

        System.out.println("Area:"+ area2);
    }
}