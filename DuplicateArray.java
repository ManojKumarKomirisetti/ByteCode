/*1.	Program to find 
Case 1: 
             To Find Duplicate elements and print highest number of repeated element
Case 2:
           Remove Duplicates and Print the Array.
Input Array: int a[]={1,4,2,6,8,2,3,1,3,5,1,2,1,4,5,1};
*/

class DuplicateArray
{
    public static void main(String []args)
    {
        int A[] = {1,4,2,6,8,2,3,1,3,5,1,2,1,4,5,1};
        
    int count = 1, max = 0,k=0;
        for(int i =0;i<A.length;i++)
        {
            count = 1;
                for(int j = i+1; j<A.length;j++)
                {
                    if(A[i] == A[j])
                    {
                        count++;
                        if(count>max)
                        {
                            max = count;
                            k = i;
                        }
                    }
                }
        }
        System.out.println("Max number of times:"+A[k]+" repeated "+max +" times");        

    }
}