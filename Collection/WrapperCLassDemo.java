/*Wrapper Class*/
import java.lang.*;
class WrapperCLassDemo
{
    public static void main(String args[])
    {
        int i =10;//Primitive Datatype
        Integer a = i;// object
        System.out.println(a);
        int b= a;
        System.out.println(b);
        Integer c = Integer.valueOf(b);//Utility mathods


    }
}