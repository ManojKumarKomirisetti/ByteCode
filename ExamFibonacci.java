class ExamFibonacci
{
    public static void main(String []args)
    {
        
        int a = 0, b = 1;
            int f = 0;
            System.out.println(a);
            System.out.println(b);

        while(true)
        {
                f=a+b;
                a = b;
                b =f;
                if(f<=54)
                System.out.println(f);
                else
                break;
                
        }

    }
}