/*Length and breadth of a rectangle are 5 and 7 respectively. 
Write a program to calculate the area and perimeter of the rectangle. */


import java.util.Scanner;
class Rect_Area{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int l , b;
        System.out.println("Enter Length and Breadth:");
        l = sc.nextInt();
        b = sc.nextInt();
        int area = l*b;

        System.out.println("Area of triangle =" + area);
        
    }
}