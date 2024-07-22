import java.util.*;

class PriorityQueueCollection {
    public static void main(String ar[]) {
        PriorityQueue<String> PQ = new PriorityQueue<String>();
       
        Scanner sc = new Scanner(System.in);

        /*
         * PQ.add("Manoj");
         * PQ.add("Koushik");
         */

        int n = 1;

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter Stack Strings : ");
            String S = sc.nextLine();
            PQ.add(S);
            System.out.println("Want to add new Objects Press 'Yes' else 'No' :");
            String Choose = sc.nextLine();
            if (Choose.equals("Yes")) 
            {
                n++;
            }

        }

        sc.close();

        System.out.println("Head:"+PQ.element());
        System.out.println("Head:"+PQ.peek());
        System.out.println("After Modification:");
        PQ.remove();
        PQ.poll();
        Iterator<String> itr = PQ.iterator();

        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
    }
}