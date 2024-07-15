/*Snake And Ladder*/

import java.util.*;
class DialPad
 {

     public static void main(String Args[])
     {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter  String Charecters :");
       
       String [][] s = new String[8][5];
       s[0][0] = "2";
       s[1][0] = "3";
       s[2][0] = "4";
       s[3][0] = "5";
       s[4][0] = "6";
       s[5][0] = "7";
       s[6][0] = "8";
       s[7][0] = "9";


       s[0][1] = "A";
       s[0][2] = "B";
       s[0][3] = "C";

       s[1][1] = "D";
       s[1][2] = "E";
       s[1][3] = "F";

       s[2][1] = "G";
       s[2][2] = "H";
       s[2][3] = "i";

       s[3][1] = "J";
       s[3][2] = "K";
       s[3][3] = "L";

       s[4][1] = "M";
       s[4][2] = "N";
       s[4][3] = "O";

       s[5][1] = "P";
       s[5][2] = "Q";
       s[5][3] = "R";
       s[5][4] = "S";
       
       
       s[6][1] = "T";
       s[6][2] = "U";
       s[6][3] = "V";

       
       s[7][1] = "W";
       s[7][2] = "X";
       s[7][3] = "Y";
       s[7][4] = "Z";

       
       for(int i =0;i<8;i++)
       {
        for(int j = 0;j<5;j++)
        {
          System.out.print(s[i][j]+"  ");
        }
        System.out.println("");
       }
       

      }
}