//Question 10. what is the output of this question?

class Method_Test10 { 
    static int x = 10; 
public
    static void main(String[] args) 
    { 
        Method_Test10 t1 = new Method_Test10(); 
        Method_Test10 t2 = new Method_Test10(); 
  
        t1.x = 20; 
        System.out.print(t1.x + " "); 
        System.out.println(t2.x); 
    } 
}    //the value of x got changed permanently and for all objects pointing the class too; 