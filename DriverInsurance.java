/*20.Check Company Insures Drivers in Java?
   A company insures its drivers in the following cases:
   If the driver is married
   If the driver is unmarried, male & above 30 years of age
   If the driver is unmarried, female & above 25 years of age
*/

import java.util.*;

class DriverInsurance
{
    DriverInsurance(String Name,int Age, String Status,String Gender)
    {
            if(Status.equals("Married") || Status.equals("married"))
            {
                System.out.println("Mr/Ms: "+Name+" Will get Insurance up to 10,00,000");
            }
            else if(Status.equals("UnMarried") || Status.equals("unmarried") && Gender.equals("Male") )
            {
                if(Age>30)
                {
                    System.out.println("Mr. "+Name+" Will get Insurance up to 8,00,000");

                }
            }

            else if(Status.equals("UnMarried") || Status.equals("unmarried") && Gender.equals("Female") )
            {
                if(Age>25)
                {
                    System.out.println("Ms. "+Name+" Will get Insurance up to 7,00,000");

                } 
            }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String Name = sc.nextLine();

        System.out.println("Enter Age:");
        int Age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Martial Status:");
        String Status = sc.nextLine();

        System.out.println("Enter Gender:");
        String Gender = sc.nextLine();

        sc.close();

        DriverInsurance obj = new DriverInsurance(Name,Age,Status,Gender);
           
            
    }
}