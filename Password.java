import java.util.*;

class LowerCase extends Thread
{

    LowerCase()
    {
        start();
    }
    public void run()
    {
        for(int i = 0; i<PasswordVariable.arr[0].length;i++)
        {
            if(PasswordVariable.Pass.length() == 15)
            {
                if(PasswordVariable.count != 1)
                {
                    PasswordVariable.count++;
                   System.out.println("Your Password: "+PasswordVariable.Pass);
                }
                break;
            }
            String str = PasswordVariable.arr[0][i];
            PasswordVariable.Pass = PasswordVariable.Pass + str;

            //System.out.println(PasswordVariable.Pass.length());

        }
    } 

}

class UpperCase extends Thread
{
       UpperCase()
    {
        start();
    }
    public void run()
    {
        for(int i = 0; i<PasswordVariable.arr[1].length;i++)
        {
            if(PasswordVariable.Pass.length() == 15)
            {
                if(PasswordVariable.count != 1)
                {
                    PasswordVariable.count++;
                   System.out.println("Your Password: "+PasswordVariable.Pass);
                }
                break;
            }
            String str = PasswordVariable.arr[1][i];
            PasswordVariable.Pass = PasswordVariable.Pass + str;

           // System.out.println(PasswordVariable.Pass.length());

        }
    } 
}

class Numeric extends Thread
{
     Numeric()
    {
        start();
    }
    public void run()
    {
        for(int i = 0; i<PasswordVariable.arr[2].length;i++)
        {
            if(PasswordVariable.Pass.length() == 15)
            {
                if(PasswordVariable.count != 1)
                {
                    PasswordVariable.count++;
                   System.out.println("Your Password: "+PasswordVariable.Pass);
                }
                break;
            }
            String str = PasswordVariable.arr[2][i];
            PasswordVariable.Pass = PasswordVariable.Pass + str;

            //System.out.println(PasswordVariable.Pass.length());

        }
    }
}

class SpecialCharecters extends Thread
{

    SpecialCharecters()
    {
        start();
    }
    public void run()
    {
        for(int i = 0; i<PasswordVariable.arr[3].length;i++)
        {
            if(PasswordVariable.Pass.length() == 15)
            {
                if(PasswordVariable.count != 1)
                {
                    PasswordVariable.count++;
                   System.out.println("Your Password: "+PasswordVariable.Pass);
                }
                break;
            }
            String str = PasswordVariable.arr[3][i];
            PasswordVariable.Pass = PasswordVariable.Pass + str;

           // System.out.println(PasswordVariable.Pass.length());

        }
    }
}

class Password
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String opt;
        while(true)
        {
            PasswordVariable.Pass = "";
       new Numeric();

        new SpecialCharecters();
        
        new LowerCase();
        
        new UpperCase();


        System.out.println("Do you want to Generate another pin then type YES/yes else NO/no: ");
        
         opt = sc.next();
        
        if(opt.equals("NO") || opt.equals("no"))
        {
            System.exit(1);
        }

        else
        {
            continue;
        }

        }
        
    }
}