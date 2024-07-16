/*21.Calculate Total Electricity Bill in Java?*/

import java.util.*;

class Electricity_Bill
{
    Electricity_Bill(String Name,int Units)
    {
            if(Units <= 200)
            {
                System.out.println("Mr./Ms. "+Name+"\n"+"You Got No Fees For Electricity Bill Under 200 Units, a Policy by Telangana Governament.   ");
            }
            else if(Units > 200 && Units <= 300)
            {
                System.out.println("Mr./Ms. "+Name+"\n"+"Electricity Bill:"+(float)(Units*7.7));
            }
            else if(Units > 300 && Units<=400)
            {
                System.out.println("Mr./Ms. "+Name+"\n"+"Electricity Bill:"+(float)(Units*9));
                
            }
            else if(Units > 400 && Units<=800)
            {
                System.out.println("Mr./Ms. "+Name+"\n"+"Electricity Bill:"+(float)(Units*9.5));
                
            }
            else if(Units > 800)
            {
                System.out.println("Mr./Ms. "+Name+"\n"+"Electricity Bill:"+(float)(Units*10));
                
            }

            
            System.out.println("Mr./Ms. "+Name+"\n"+"Please Pay Bill Faster Because the Govt. is out of Treasure");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String Name = sc.nextLine();

        System.out.println("Enter No of Units:");
        int Units = sc.nextInt();
       // sc.nextLine();

        sc.close();

        Electricity_Bill obj = new Electricity_Bill(Name,Units);
           
            
    }
}