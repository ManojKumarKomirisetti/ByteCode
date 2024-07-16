/*13.Write a program to count total number of notes in given amount?*/

import java.util.*;

class Money_Note
{

    Money_Note(int Five, int Two, int Hund, int Fty, int TWY, int TN, int TM)
    {

        
        while(TM>0)
        {
            //System.out.println("Enter ============");

        
               // System.out.println("Enter ============");
                if(TM>=500 && Five>0)
                {
                                  // System.out.println("Enter ============");

                    TM-=500;
                                  // System.out.println("Sum:"+TM);

                    Five--;
                                   //System.out.println("Notes:"+Five);

                }
                
            
            else if(TM>=200 && Two>0)
            {
               
                    TM-=200;
                    Two--;

            }
            else if(TM>=100 && Hund>0)
            {
                
                    TM-=100;
                    Hund--;
                
            }
            else if(TM>=50 && Fty>0)
            {
               
                    TM-=50;
                    Fty--;
                
            }

            else if(TM>=20 && TWY>0)
            {
                
                    TM-=20;
                    TWY--;
            
            }
            else if(TM>=10 && TN>0)
            {
                
                    TM-=10;
                    TN--;
                
            }

            else
            {
                System.out.println(TM+" is the Total Money still and You need More Notes To equalize. ");
                break;
            }
       
       
        }

            System.out.println("500 Notes:"+Five+"\n"+"200 Notes:"+Two+"\n"+"100 Notes:"+Hund+"\n"+"50 Notes:"+Fty+"\n"+"20 Notes:"+TWY+"\n"+"10 Notes:"+TN);
    
            System.out.println(TM+" is the Total Money still we have ");



        }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total 500 Notes:");
        int Five = sc.nextInt();

        System.out.println("Enter Total 200 Notes:");
        int Two = sc.nextInt();

        System.out.println("Enter Total 100 Notes:");
        int Hund = sc.nextInt();

        System.out.println("Enter Total 50 Notes:");
        int Fty = sc.nextInt();

        System.out.println("Enter Total 20 Notes:");
        int TWY = sc.nextInt();

        System.out.println("Enter Total 10 Notes:");
        int TN = sc.nextInt();

        System.out.println("Enter Total Amount:");
        int TM = sc.nextInt();

        sc.close();

        Money_Note nc = new Money_Note(Five,Two,Hund,Fty,TWY,TN,TM); 
        
        }
}