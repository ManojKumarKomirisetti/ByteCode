    /*24.Write a program to print which one is Greater than (Area/Perimeter)?*/



import java.util.*;

class AreaPerimeter
{
    AreaPerimeter(float L,float B,float H)
    {
        float Area = (L*B*H);
        float Perimeter = (((L+B)+(B+H)+(L+H)))*4 ;
        if(Area>Perimeter)
        System.out.println(Area+" Area is Greater.");
        else
        System.out.println(Perimeter+" Perimeter is Greater.");


    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length:");
        float Length = sc.nextFloat();
       
        System.out.println("Enter Breadth:");
        float Breadth = (float)sc.nextDouble();

        System.out.println("Enter Heigth:");
        float Height = sc.nextFloat();

        sc.close();

        AreaPerimeter obj = new AreaPerimeter(Length,Breadth,Height);
           
            
    }
}
