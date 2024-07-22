import java.util.*;

class LinkedListCollection
{

    public LinkedList<String> RemoveIf (LinkedList<String> al, Scanner sc)
    {
          
          al.removeIf(s->s.startsWith("B"));

        return al;
    }
    public LinkedList<String> RemoveLast (LinkedList<String> al, Scanner sc)
    {
          
          al.removeLast();

        return al;
    }

    public LinkedList<String> RemoveFirst (LinkedList<String> al, Scanner sc)
    {
          
          al.removeFirst();

        return al;
    }

    public LinkedList<String> RemoveIndexPo (LinkedList<String> al, Scanner sc)
    {
          System.out.println("Enter Index Position:");
          int Val = sc.nextInt();
          al.remove(Val);

        return al;
    }

  public LinkedList<String> RemoveString (LinkedList<String> al, Scanner sc)
  {
    
    System.out.println("Enter String you want to Remove");
    String Str = sc.nextLine();
    al.remove(Str);
    return al;
  }
   public static void main(String [] ar)
   {

    LinkedListCollection obj = new LinkedListCollection();

    int n = 1;
     Scanner sc = new Scanner(System.in);
   
    LinkedList<String> al = new LinkedList<String>();

    al.add("Manoj Is a GOOD BOY "); 
      al.add("Manoj");
        al.add("Uday");
        al.add("Bhaskar");
        al.add("Ganesh");
        al.add("Aravind");

    for(int i= 0;i<n;i++)
    {
        System.out.println("Enter Objects in to LinkedList.");

        String S = sc.nextLine();
        al.add(S);
        System.out.println("If you want to Continue Press 1 else 0");
        int x = sc.nextInt();
        sc.nextLine();
        if(x==1)
        n++; 
    }



    Iterator<String> itr = al.iterator();

    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }

    // obj.RemoveString(al,sc);
    //obj.RemoveIndexPo(al,sc);
    //obj.RemoveFirst(al,sc);
    // obj.RemoveLast(al,sc);
    obj.RemoveIf(al,sc);

    Iterator<String> itz = al.iterator();

    System.out.println("Modified LinkedList:");
    
    System.out.println();

    while(itz.hasNext())
    {
        System.out.println(itz.next());
    }
    sc.close();

}
}