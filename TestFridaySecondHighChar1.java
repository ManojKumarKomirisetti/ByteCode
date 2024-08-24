import java.util.*;
class TestFridaySecondHighChar1
{
    public static void main(String rgs[])
    {
        String Str = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String :");
        Str = sc.nextLine();
        sc.close();

        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> ai = new ArrayList<Integer>(Str.length());

       
        Integer  flag = -1;
        Integer count = 1;
       // Integer max= 0;

        for(int i =0;i<Str.length();i++)
        {
            
            for(int j = i+1 ; j<Str.length();j++)
            {
                    if(Str.charAt(i) == Str.charAt(j) && ai.get(j)!=flag)
                    {
                        count += 1;
                        ai.add(j,flag);

                    }
            }
            al.add(count);
            
            count=1;
        }

        Iterator<Integer> i = al.iterator();
        
        while(i.hasNext())
        {
            System.out.print(i.next());

        }
     
    }
}