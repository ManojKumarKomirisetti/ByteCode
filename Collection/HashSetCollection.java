import java.util.*;

class HashSetCollection
{
    public static void main(String ar[]) 
    {
       HashSet<String> hs = new HashSet<String>();
       hs.add("Ravi");
       hs.add("Manoj");
       hs.add("Karthik");

       for(String str : hs)
       System.out.println(str);

    }
}