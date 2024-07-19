class PyramidStar
{
    public static void main(String []args)
    {
            int rows = 5,k=0;
            for(int i = 0;i<rows;i++)
            {
                    for( k =rows;k>0;k--)
                    {
                        System.out.print(" ");

                    }
                for(int j = 0;j<i+1;j++)
                {
                        System.out.print("*"+" ");
                }
                System.out.println();
                k+=1;
            }
    }
}