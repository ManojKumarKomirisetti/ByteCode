//Question 5. What is the output of this question?


class Method_Test5 { 
public static void main(String[] args) 
    { 
        static int arr1[] = { 11, 22, 33 }; 
        static int arr2[] = { 11, 22, 33, 44, 55 }; 
        static int ptr[]; 
        ptr = arr1; 
        arr1 = arr2; 
        arr2 = ptr; 
        System.out.print(arr1.length + " "); 
        System.out.println(arr2.length); 
    } 
} 
