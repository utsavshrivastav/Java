package p.r;
public class Ar
{
  public void sort(int a[])
   {
     int i,j,temp;
     for(i=0;i<a.length;i++)
      {
       for(j=i+1;j<a.length;j++)
        {
          if(a[i]>a[j])
           {
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;
           }
        }
      }
      for(i=0;i<a.length;i++)
       {
        System.out.print(a[i]+",");
       }
   }
}
  
