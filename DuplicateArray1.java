import java.util.*;
class DuplicateArray1
{
    public static void main(String Ar[])
    {
        Scanner sc = new Scanner(System.in);
          int a[] = new int[10];
        int b[] = new int[10];
System.out.println("Enter Array Elemnts:");
        for(int i = 0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
            b[i] = 0 ;
        }


        for(int i = 0; i<a.length;i++)
        {
            if(b[i] != -1)
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i] == a[j])
                {
                    b[j] = -1;
                }
            }
        }
        System.out.println(" Array Elemnts After Removing Duplicates:");


        for(int i = 0;i<a.length;i++)
        {
            if(b[i]!=-1)
            {
                System.out.println(a[i]);
            }
        }

    }
}