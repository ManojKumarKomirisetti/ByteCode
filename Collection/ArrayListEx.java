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
            al.add(40);
            al.add(50);
            al.add(70);
            al.add(90);
            System.out.println("Printing from an index");
//Prints from Second Position
            ListIterator l = al.listIterator(2);
            while(l.hasNext())
            {
                System.out.println(l.next());
            }
    }
}