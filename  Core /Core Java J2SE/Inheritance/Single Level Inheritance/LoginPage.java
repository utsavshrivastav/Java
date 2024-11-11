/* 
import java.util.Scanner;

public class LoginPage {
    String user;
    String pass1;
    int flag;

    public LoginPage()
    {
        user = "admin";
        pass1 = "admin123";
        flag = 0 ; 
    }

    int Checklogin(String u , String p){
        if(u.equals(user)) && (p.equals(pass1))
        {
              flag = 1;
        }
        return 0 ;
    }
}
    */

      /* 
    import java.util.Scanner;
    class Bank extends LoginPage{
        int amt , bal , f , ch ;
        int c = 1;
        String u ;
        String p ; 

        Scanner ip ; 

        public Bank(){
            bal = 5000 ; 
            ip = new Scanner(System.in);
        }

        void deposit(){
            System.out.println("Enter Amount");
            amt = ip.nextInt();

            if(amt>0)
            {
                System.out.println("Amount Deposited = "+amt);
                bal = bal+amt;
                System.out.println("total = "+bal);
                else {
                  System.out.println("Invalid amt");
                }
            }

            void withdrawal(){
                System.out.println("Enter amt");
                amt = ip .nextInt();
                if(amt > 0 && amt <=  bal)
                {
                    System.out.println("amt withdrawal"+amt);
                    bal = bal - amt;
                    System.out.println("total bal"+bal);
                }
                else{
                    System.out.println("Invalid amount");
                }
            }

            void show(){
                System.out.println("Total bal = "+bal);
            }

            void menu(){
                LoginPage ob = new LoginPage();
                System.out.println("Enter the username and password ");
                u = ip.nextLine();
                p = ip.nextLine();
                f = Checklogin(u , p);

                if(f==1){
                    System.out.println("Press 1 for Deposit amt ");
                    System.out.println("Press 2 for withdrawal amount");
                    System.out.println("Press 3 for show balance");
                    ch = ip.nextInt();

                    switch (ch) {
                        case 1:
                            deposit();
                            break;
                        case 2:
                             withdrawal();
                             break;
                        case 3:
                            show();
                            break; 
                    
                        default:
                        System.out.println("Invalid choice");
                    }
                }
            }
        }
    }
*/

