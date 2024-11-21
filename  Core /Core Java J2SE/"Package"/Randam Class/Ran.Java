 
 Package p;
 import java.util.Randam;

 public class Ran
   {
     int n ;
     public int generate(int no)
     {
        Random rn = new Randam();
        n = rn.nextInt(no);  
        return n;    
     }
   }