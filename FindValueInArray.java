class FindValueInArray{
    public static void main(String args[])
    {
            int arr[] = {3,10,9,8,1,4,2,7,6};
            
            for(int i = 1;i<=arr.length;i++)
            {
                int t =0;
                for(int j = 0; j<arr.length;j++)
                {
                    if(arr[j] == i)
                    {
                        t =1;
                        break;
                    }
                    
                }
                if(t!=1)
                System.out.print(i);
            }
    }
}