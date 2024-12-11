

public class Demo {
    public static void main(String arg[])
    {
        String s = "12345a";
        int n;
        try
        {
            n = Integer.parseInt(s);
            System.out.println(n);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}


/*
  To Change String  Into  Integer -- use , parse int method
  
  String = "1234"
  String = "1234a" ---Exception Occur here 
 */
