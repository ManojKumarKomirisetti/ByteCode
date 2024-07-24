import java.util.*;

class HashSetCollection1
{
    public static void main(String ar[]) 
    {
       HashSet<ArrayList> set = new HashSet<ArrayList>();

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        set.add(al);
        set.add(al1);
        System.out.println("Size of HashSet:"+set.size()); 

       for( ArrayList<Integer> list : set)
       System.out.println(list);

    }
}