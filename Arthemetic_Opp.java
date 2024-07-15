/*4) Write a Java program to print the sum, multiply, subtract, divide and
 remainder of two numbers*/
class Arthemetic_Opp
{
    public static void main(String Args[])
    {
        float i = 10;
        float n = 25;
        System.out.println("SUM:"+(i+n));//11
        if(n>i)
        {
            System.out.println("Substraction:"+(n-i));
            System.out.println("Division:"+(n/i));
            System.out.println("ModularDivision:"+(n%i));
    }
        else{
            System.out.println("Substraction:"+(i-n));
            System.out.println("Division:"+(n/i));
            System.out.println("ModularDivision:"+(n%i));
        }
        System.out.println("Multiplication:"+(i*n));
        
    }
}