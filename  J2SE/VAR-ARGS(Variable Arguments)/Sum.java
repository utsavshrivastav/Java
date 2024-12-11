

public class Sum {
    int sum = 0;
    void add(int...x)
    {
        for(int sum:x) /* remeber the Syntax of for-loop  */
        {
            sum = sum+1;
        }
        System.out.println("sum = "+sum);
        sum = 0;
    }

    public static void main(String ar[])
    {
        Sum ob = new Sum();
        ob.add(2,3);
        ob.add(4,5,7);
    }
    
}
