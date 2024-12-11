/* We Can Create Constructor of Abstract class  */
import java.util.Scanner;
abstract class Convert
    {
        abstract void Converting(); /* this is Method Name */
        Scanner ip ;

        public Convert() /* This is Constructor */
        {
            ip = new Scanner(System.in);
        }
    }
    

    class Index extends Convert
    {
        int no , i ;
        int a[] = new int[5];

        void set()  /* this is also method name  */
        {
            System.out.println("Enter the no ");
            no = ip.nextInt();

        }
        @Override              /* jeha jha kr Error removed hue , jo Index waale line pe jo error show ho raha tha  */
        void Converting()
        {
            for(i = 0; no > 0; i++)
            {
                a[i] = no%2;
                no = no/2;
            }
            for(i = 1; i > 0; i--)
            {
                System.out.println("a[i]");

            }
        }

        public static void main(String arg[])
         {
            Index ob = new Index();
            ob.set();
            ob.Converting();
         }
    }

    /*
      As Abstract Class  is Partically Implemented that's Why WE Cannot Create Object Of Abstract Class .

      ie .. 

      abstract class abs 
      {
      void set()
      {
           --------------------
             ----------------
                 --------
      }
      abstract void set()
        {
      public static void main()
      {
      abs ob  = new abs()
      ob.set();
      ob.show();
       }
    }                        -- not Possible .
}
     */

