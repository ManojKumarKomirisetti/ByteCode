import java.util.*;

class ArrayDequeCollection 
{
    public static void main(String ar[]) 
    {
        Deque<String> que = new ArrayDeque<String>();
        que.add("Manoj");
        que.add("Uday");
        que.add("Ganesh");
        for(String Str : que)
        {
            System.out.println(Str);
        }
    }
}