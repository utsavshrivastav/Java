package p;
import java.util.Random;
public class Ran
{
  int n;
  
  public int genrate(int no)
    {
     Random rn=new Random();
      n=rn.nextInt(no);
      return n;
    }
}
