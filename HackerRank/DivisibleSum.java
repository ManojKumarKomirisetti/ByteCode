/*
Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .

Example



Three pairs meet the criteria:  and .

Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

int n: the length of array
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs

Input Format

The first line contains  space-separated integers,  and .
The second line contains  space-separated integers, each a value of .

Constraints

Sample Input

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]

Output: 5

*/
import java.util.*;
class DivisibleSum
{
public static void divisibleSumPairs(int k, List<Integer> ar)
 {

    int count =0;
        
        for(int i = 0;i<ar.size();i++)
        {
            for(int j = i+1;j<ar.size();j++)
            {
                int sum = 0;
                sum = ar.get(i) + ar.get(j);
                if(sum%k == 0)
                {
                    count+=1;
                }
            }
        }
        
        System.out.println("No of Pairs:"+count);
    }

    public static void main(String Args[])
    {

       /*  n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]*/
            List<Integer> ar = new ArrayList<Integer>();
            ar.add(1);
            ar.add(3);
            ar.add(2);
            ar.add(6);
            ar.add(1);
            ar.add(2);
            int k = 3;
            divisibleSumPairs(k,ar);

}
}