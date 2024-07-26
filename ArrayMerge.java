class ArrayMerge
{
    public static void main(String []args)
    {
        int Em[] = new int[5];
        int Om[] = new int[5];
        int sum = 0,k=0,l=0;
        for(int i = 0; i<10; i++)
        {
                if((5*(i+1)) % 2 == 0)
                {
                    Em[k] = (5*(i+1));
                    k++;
                }
                else
                {
                    Om[l] = (5*(i+1));
                    l++;
                }
        } 

        int TA[] = new int[Em.length+Om.length];
l=0;
        for(int i=0;i<(Em.length+Om.length);i++)
        {
            if(i<Em.length)
                TA[i] = Om[i];

                 else
                {
                    TA[i] = Em[l];
                    l++;
                }
                sum+=TA[i];
        } 


        for(int i = 0;i<Em.length+Om.length;i++)
        {
                System.out.println("Total Multiple:"+TA[i]);


        }
        System.out.println("Sum:"+sum);

        int n = sum,x=1;
            while(n>0)
            {
                 x = n%10;
                // n = n/10;
                if(x == 0)
                {
                    break;
                }
                n= n/10;

            }
            if(x==0)
            System.out.println("It is a ducknumber;");
            else                    
            System.out.println("It is not a ducknumber;");


    }
}