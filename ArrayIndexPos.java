class ArrayIndexPos
{
    public static void main(String args[])
    {
        int arr[] = {11,42,0,15,17,0,68,254,32,45,0};
        int temp = 0, temp1 = 0;
        int k = 0;
        int n = arr.length;
         for(int i = 0; i<arr.length; i++)
        {
           
             if(arr[i] % 2 == 0 && arr[i]!=0 )
            {
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k+=2;
            }

           
            
        }

         for(int l : arr)
        {
            System.out.print(l+" ");
        }
    }
}