import java.util.*;
//Manoj
class ArrListCollection
{
    public static void main(String ar[])
    {
        ArrayList<String> list = new ArrayList<String>();
       /*  list.add("Manoj");
        list.add("Uday");
        list.add("Bhaskar");
        list.add("Ganesh");
        list.add("Aravind");*/
int j = 1,n=1;
 Scanner sc = new Scanner(System.in);
 for(int i = 0;i<n;i++)
 {
    System.out.println("Enter ArrayList Strings : ");

    String S = sc.nextLine();
    list.add(S);
    System.out.println("Want to add new Objects Press 'Yes' else 'No' :");
    String Choose = sc.nextLine();
    if(Choose.equals("Yes"))
    {
        n++;
    }

 } 
        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println("ArrayList Strings "+j+" : "+it.next());
            j++;
        }
    }
}
