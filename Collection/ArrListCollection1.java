import java.util.*;
class ArrListCollection1
{
    public static void main(String ar[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
       /*  list.add("Manoj");
        list.add("Uday");
        list.add("Bhaskar");
        list.add("Ganesh");
        list.add("Aravind");*/
int j = 1,n=1;
 Scanner sc = new Scanner(System.in);
 for(int i = 0;i<n;i++)
 {
    System.out.println("Enter ArrayList integers : ");

    int  S = sc.nextInt();
    list.add(S);
    sc.nextLine();
    System.out.println("Want to add new Objects Press 'Yes' else 'No' :");
    
    String Choose = sc.nextLine();
    if(Choose.equals("Yes"))
    {
        n++;
    }

 } 
 sc.close();

        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println("ArrayList Integers "+j+" : "+it.next());
            j++;
        }
    }
}