//Question 1. What is the output of this question?

class Method_Test1 { 
    int x = 10; 
public static void main(String[] args) 
    { 
        Method_Test1 t1 = new Method_Test1(); 
        Method_Test1 t2 = new Method_Test1(); 
       t1.x = 20; 
        System.out.print(t1.x + " "); 
        System.out.println(t2.x); 
    } 
} 
//OutPut:20 10