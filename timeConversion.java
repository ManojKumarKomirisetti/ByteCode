/*Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input

07:05:45PM
Sample Output

19:05:45*/
import java.util.*;
class  timeConversion
{
public static String time(String s) {
    // Write your code here
    String temp = s.substring(0,2);
        String noon = s.substring(8,10);
        String middle = s.substring(2,8);
        int tym = Integer.parseInt(temp);
        
        if(temp.equals("12") && noon.equals("AM"))
        {
            String ans = "00"+middle;
            return ans;
        }
        
        else if(temp.equals("12") && noon.equals("PM"))
        {
            String ans = s.substring(0,8);
            return ans;
        }
            else if(tym >=1 && tym < 12 && noon.equals("PM"))
        {
            tym += 12;
            
            String ans = Integer.toString(tym)+middle;
            return ans;
        }
        else if(tym >=1 && tym < 12 && noon.equals("AM"))
        {
            String ans = s.substring(0,8);
            return ans;
        }
        
    return s;

}
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        timeConversion obj = new timeConversion();
        System.out.println(time(str));
    }
}
           



