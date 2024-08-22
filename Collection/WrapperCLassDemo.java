/*Wrapper Class*/
import java.lang.*;
class WrapperCLassDemo
{
    public static void main(String args[])
    {
        int i =10;//Primitive Datatype
        Integer a = i;// object
        /*Auto Boxing */
        System.out.println(a);
        int b= a;
        //Auto Unboxing
        System.out.println(b);
      
        System.out.println("Utility Methods");

        Integer c = Integer.valueOf(b);//Utility Methods
        int d = c.intValue();
        System.out.println(d);
        String manoj = "22";
        int   Age = Integer.parseInt(manoj);
        System.out.println(Age);
        String B = Integer.toString(Age);
        System.out.println(B);
        String C = ""+Age;
        System.out.println(C);
        String D = Age+"";
        System.out.println(D);
        String E = 10+2+"ab";
        System.out.println(E);
        String F = "ab"+10+2;
        System.out.println(F);
        String G = 10+2+"";
        System.out.println(E);
        /*String is an Object so , cannot be stored in an int */
        //int i = G;(Exception)
        //Integer K= G; Number Format Exception Same as Above

        boolean N =true;
        String M = Boolean.toString(N);//arguemnt is of any type sice it converts it in to string
        System.out.println(M);

        //int l = Integer.parseInt(b);
        //here the predefined argument is of type string(The method parseInt(String) in the type Integer is not applicable for the arguments (boolean))





    }
}