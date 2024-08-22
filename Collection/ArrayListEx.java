import java.util.*;
/*
 * Allows Null,duplicates,insertion order
 */
class ArrayListEx
{
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Manoj");
        al.add(20);
        al.add("Uday");
        System.out.println(al.size());
        al.remove(1 );
            Iterator i = al.iterator();
            while(i.hasNext())
            {
                System.out.println(i.next());
            }
            System.out.println("Using List Iterator");
            ListIterator li = al.listIterator();
            while(li.hasNext())
            {
                System.out.println("Forward Direction"+li.next());
            }
            System.out.println("backward Direction");
            while(li.hasPrevious())
            {
                System.out.println("Backward Direction"+li.previous());
            }
    }
}