import java.util.*;
public class sortAlg{
    int[] show(int arr[])
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            
            for(int j = i+1 ; j<arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i]   = arr[j];
                    arr[j]   = temp;

                }
            }
        }

       /*  for(int i = 0; i<arr.length ; i++)
        {
            System.out.print("  " + arr[i]);
        }*/
        return arr;
    }
    
}

class ManojSort{
    public static void main(String [] ar)
    {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for(int i = 0 ; i<5 ; i++ )
        {
            arr[i] = sc.nextInt();
        }
        sortAlg obj = new sortAlg();
        int arr1[] = obj.show(arr);
    }
}