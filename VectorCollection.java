import java.util.*;
class VectorCollection
{
    public static void main(String ar[])
    {
       Vector<String> vect = new Vector<String>();
       /*  vect.add("Manoj");
        vect.add("Uday");
        vect.add("Bhaskar");
        vect.add("Ganesh");
        vect.add("Aravind");*/
int j = 1,n=1;
 Scanner sc = new Scanner(System.in);
 for(int i = 0;i<n;i++)
 {
    System.out.println("Enter ArrayList Strings : ");

    String S = sc.nextLine();
    vect.add(S);
    System.out.println("Want to add new Objects Press 'Yes' else 'No' :");
    String Choose = sc.nextLine();
    if(Choose.equals("Yes"))
    {
        n++;
    }

 } 
        Iterator<String> it = vect.iterator();
        while(it.hasNext())
        {
            System.out.println("ArrayList Strings "+j+" : "+it.next());
            j++;
        }
    }
}