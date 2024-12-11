import java.util.Scanner
 public class arithmatic
{
    int a , b, c;
    Scanner ip;
    public arithematic()
    {
        ip = new Scanner(System.in);
    } 
    void div()
    {
        try{
            System.out.println("Enter a and b");
            a = ip.nextInt();
            b = ip.nextInt();
            c = a/b;

        }
        catch(Arithmatic Exception e)
        {
            e.printStackTrace();
        }
        catch(InputMismatchException e)
        {
            e.printStackTrace();
        }
        System.out.println("div= "+c);
    }
    public static void main(String arg[])
    {
        new arithmatic().div();
    }
}