class ArrayIndexPos
{
    public static void main(String args[])
    {
        int arr[] = {9,10,5,9,0,10,0,11,13,14};
        int temp = 0, temp1 = 0;
        int k = 0;
        int n = arr.length;
         for(int i = 0; i<arr.length; i++)
        {
           
            if(arr[i] == 0)
            {
                n= n-1;
                if(arr[n] == 0)
                 n= n-1;
                temp1 = arr[n]; 
                arr[n] = 0;
                arr[i] = temp1;
            }

           /*  if(arr[i] % 2 == 0 && arr[i]!=0 )
            {
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k+=2;
            }*/

           
            
        }

         for(int l : arr)
        {
            System.out.print(l+" ");
        }
    }
}