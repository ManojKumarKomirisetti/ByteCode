//Question 4. What is the output of this question?


class Method_Test4 { 
    static int i = 1; 
public static void main(String[] args) 
    { 
        static int i = 1; 
        for (Method_Test4.i = 1; Method_Test4.i < 10; Method_Test4.i++) { 
            i = i + 2; 
            System.out.print(i + " "); 
        } 
    } //Static variables should be declared globally
} 
