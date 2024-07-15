/*7) What is the output of the following code snippet & Explain? 
int x = 10;   
int y = 20;   
int z = x++ + ++y;   
System.out.println(z);  
*/
class Incrementer1
 {
     public static void main(String Args[])
     {
       int x = 10;   
       int y = 20;   
       int z = x++ + ++y;   
       System.out.println(z);//31  

        }
 }