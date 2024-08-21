import java.util.*;

class StringBufferEx {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("java");
        System.out.println("Capacity of Buffer is:"+sb.capacity());
        /*sb.append("manoj Kumar is a good boy");
        System.out.println(sb.capacity());*/
        System.out.println("Reverse:"+sb.reverse());
       sb.ensureCapacity(25);
       System.out.println("New Capacity:"+sb.capacity());




    }


}
