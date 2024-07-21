import java.util.*;
class StackCollection
{
    public static void main(String ar[])
    {
       Stack<String> stk = new Stack<String>();
       /*  stk.push("Manoj");
        stk.push("Uday");
       stk.push("Bhaskar");
        stk.push("Ganesh");
        stk.push("Aravind");*/
int j = 1,n=1;
 Scanner sc = new Scanner(System.in);
 for(int i = 0;i<n;i++)
 {
    System.out.println("Enter Stack Strings : ");

    String S = sc.nextLine();
    stk.push(S);
    System.out.println("Want to add new Objects Press 'Yes' else 'No' :");
    String Choose = sc.nextLine();
    if(Choose.equals("Yes"))
    {
        n++;
    }

 } 
 System.out.println(stk.peek());
 stk.pop();
        Iterator<String> it = stk.iterator();
        while(it.hasNext())
        {
            System.out.println("ArrayList Strings "+j+" : "+it.next());
            j++;
        }
    }
}