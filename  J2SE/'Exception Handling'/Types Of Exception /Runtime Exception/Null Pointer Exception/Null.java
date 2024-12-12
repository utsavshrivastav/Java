

public class Null {
    String s = null;
    int l;
    void cal()
    {
        try{
            l = s.length();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    void show()
      {
        System.out.println("length og String = "+l);
      }

      public static void main(String arg[])
      {
        Null ob = new Null();
        ob.cal();
        ob.show();
      }
    }

    /*
      S = Null 
      Print(s);  -- Exception aayegi kuyki value null he S me. 
     */
