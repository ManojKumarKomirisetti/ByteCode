import java.util.*;
class Problemtest
{
    public static void main(String rgs[])
    {
        String Str = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String :");
        Str = sc.nextLine();
        sc.close();

        ArrayList<Integer> al = new ArrayList<Integer>();
        //ArrayList<Integer> ai = new ArrayList<Integer>();

       
        Integer  flag = -1;
        

        for(int i =0;i<Str.length();i++)
        {
                al.add(flag);

        }
        Iterator i = al.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next());

        }
        Integer count = 1;
        count +=1;
        System.out.println();
        System.out.println(count);
    }
}