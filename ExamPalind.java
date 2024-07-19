/*3.	Program to find highest Palindrome number from the given array
    Input Array: {2357, 568568, 1238321, 2325532};
*/
class ExamPalind
{
    public static void main(String []args)
    {
        int A[] = {2357, 568568, 1238321, 2325532};
        
        int x = 0;
        int pal = 0;
        int n = 0,max=0;
        for(int i =0;i<A.length;i++)
        {
            n =A[i];
            pal= 0;
            while(n>0)
        {
            x = n%10;
            pal = pal*10+x;
            n = n/10;
        }
             if(pal == A[i])
             {
                if(pal>max)
                max = pal;
             }

        }
        
       System.out.println("Max:"+max);

    }
}