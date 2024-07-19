import java.util.*;

class VendorMachine
{
    public static void main(String []args)
    {
        Scanner sc =  new Scanner(System.in);
        int choice = 0,sum=0,buy=0;
        System.out.println("Tomato(220/kg):1");
        System.out.println("Aloo(210/kg):2");
        System.out.println("Tamarind(120/kg):3");
        System.out.println("Orange(150/kg):4");
        System.out.println("Karela(550/kg):5");
        System.out.println("DrumStick(30/kg):6");
        System.out.println("Onion(170/kg):7");
        while(true)
        {
        System.out.println("Enter Choice to Purchase");
                 choice = sc.nextInt();
                 switch(choice)
                 {
                    case 1:
                    sum+=220;
                    break;
                    case 2:
                    sum+=210;
                    break;
                    case 3:
                    sum+=120;
                    break;
                    case 4:
                    sum+=150;
                    break;
                    case 5:
                    sum+=550;
                    break;
                    case 6:
                    sum+=30;
                    break;
                    case 7:
                    sum+=170;
                    break;
                    default:
                    System.out.println("Choose correct Choice.........");
                 }
                 System.out.println("Want to stop Buying Press 1 ");

                 buy = sc.nextInt();
                 if(buy == 1)
                 {break;}

      }


      System.out.println("Your Total Purchase:"+sum);

    }
}