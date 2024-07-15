/*Snake And Ladder*/

import java.util.*;
class SnakeNLadder
 {


  public int diceVal()
  {

    Random ra = new Random();

        int Dice = 1 + ra.nextInt(6);
        return(Dice);
  }




     public static void main(String Args[])
     {

      SnakeNLadder obj = new SnakeNLadder();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter  Number of Players:");
       int n = sc.nextInt();
       sc.close();
       int per[] = new int[n];
       int [][]arr = new int[3][100];
       for(int i =0 ;i<100; i++)
       {
        arr[0][i] = i+1;
       }
       // -1 indicates Snake, 0 for nothing and 1 for Ladder
       
        arr[1][0] = 1;
        arr[2][0] = 38;

        arr[1][3] = 1;
        arr[2][3] = 14;
        
        arr[1][7] = 1;
        arr[2][7] = 30;
        
        arr[1][20] = 1;
        arr[2][20] = 42;
        
        arr[1][27] = 1;
        arr[2][27] = 76;
        
        arr[1][49] = 1;
        arr[2][49] = 67;
        
        arr[1][70] = 1;
        arr[2][70] = 92;
        
        arr[1][79] =1;
        arr[2][79] = 99;

       /*=============================== */

       arr[1][31] = -1;
       arr[2][31] = 10;
       
       arr[1][35] = -1;
        arr[2][35] = 6;
       
        arr[1][47] = -1;
        arr[2][47] = 26;
       
        arr[1][61] = -1;
        arr[2][61] = 18;
        
        arr[1][87] = -1;
        arr[2][87] = 24;
       
        arr[1][94] = -1;
        arr[2][94] = 56;
        
        arr[1][96] = -1;
        arr[2][96] = 78;
       





       /*  for(int i =0;i<3;i++)
       {
            for(int j =0; j<100;j++)
                  System.out.print(arr[i][j]);
          System.out.println("");        
       }*/

       int Dice = 0;

int k = 0,m=0,z=0;

      while(true)
      {

        for(int j= 0;j<n;j++)
        {
          Dice = obj.diceVal();

          if((per[j]+Dice) <= 100)
          {
            per[j] += Dice;
          }
          

          m = per[j];
         // System.out.println(m);

         if(per[j] == 100)
         {
           System.out.println( (j+1) + " position person is winner");
           z =100;
           break;
         }

          if(arr[1][m] == 1  )
          {
            per[j] = arr[2][m];
          }

          else if(arr[1][m] == -1)
          {
            per[j] = arr[2][m];
          }

          
          

        }
       
        if(z==100)
        {
          break;
        }
       
      }
       
      }
}