/* 
import java.util.Scanner;
public class Restorent {
    int r, q , bill;
    String dish ;

    public void Order()
    {
        r = 250;
        q = 1 ;
        bill = r*q;
        System.out.println(" You Order a one Simple thali and Bill amount " +bill);
    }

    public void order(int q)
    {
        r = 250 ;
        this.q = q;
        bill = r*q;
        System.out.println("You order a" +q+ "Simple thali and bill amount" +bill);
    }
    
    public void order(String dish , int q)
    {
        if(dish.equals("pizza"))
        {
            r = 550 ;
            bill = r*q ;
            System.out.println("You Order a dish = " +dish+ "and Bill Amount ="+bill);
        }
        else if(dish.equals("Burger"))
        {
            r = 50;
            bill = r*q;
            System.out.println("you order a dish =" +dish+ " And Bill Amount = "+bill);
        }
    }

    public static void main(String arg[])
    {
        Restorent ob = new Restorent();
        int ch , q ;
        char choice ;
        Scanner ip = new Scanner(System.in);
        do{
            System.out.println(" Press 1 to order 1 Simple Thali ");
            System.out.println(" Press 2 to Order Multiple Simple Thali");
            System.out.println(" Press 3 to Order Pizza or Burger ");
            ch = ip.nextInt();

            switch (ch) {
                case 1:
                ob.Order();
                break;

                case 2:
                System.out.println("Enter the Quantity Of Thali");
                q = ip.nextInt();
                ob.order(q);
                break;

                case 3:
                System.out.println("Press 1 for Pizza");
                System.out.println("Press 2 for Burger");
                ch = ip.nextInt();
                System.out.println("Enter the Quantity");
                q = ip.nextInt();

                if(ch == 1)
                {
                    ob.order("Pizza" , q);
                }
                else if(ch == 2)
                {
                    ob.order("Burger" ,q);
                }
                else{
                    System.out.println("Invalid choice");
                }
                break;
            
                default:
                break;
                
            }
            System.out.println(" Press Y To Continue ..  ");
            choice = ip.next().charAt(0);
        } 
        while(choice == 'y' || choice == 'Y');
    }
    }

    */
