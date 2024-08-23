import java.util.*;
class TestFridayObjectCollection
{
    static ArrayList al = new ArrayList();
    public void  show(int n)
    {
        if(n>0 && n<=100)
        {
            al.add(n);
            ++n;
            show(n);
            
        }
        else
        {
           
            System.out.println("Adding Completed");
           

        }

      //  System.out.println("Size of ArrayList:"+al.size());
       /*  Iterator i = al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }*/

         

       
    }
    public void show1()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Required Object:");

        int k = sc.nextInt();
        System.out.println(k);
        sc.nextLine();
        Integer m = k;
        sc.close();
        

        for(int i = 0;i<al.size();i++)
        {
            if(al.get(i) == m)
            {
                System.out.println("Element Found:"+al.get(i));
            }
        }
    }

    public static void main(String rgs[])
    {
        
        TestFridayObjectCollection obj = new TestFridayObjectCollection();
        
        int n= 1;
      obj.show(n);
      obj.show1();

    }
}