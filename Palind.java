import java.util.*;
class Palind{
public static void main(String arg[])
{
int n,i;
 String Str=null;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String:");


Str=sc.nextLine();
n=Str.length();

for( i=0;i<=n-1;i++)
{
    if(Str.charAt(i)!=Str.charAt(n-1-i))
      {
System.out.println("given is not a palindrome");
break      ;
}


}
if(i==n)
              System.out.println("given is a palindrome");



}
}