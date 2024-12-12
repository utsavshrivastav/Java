/* 
import java.io.*;
public class File {
    public static void main(String arg[])
    {
        String name;
        try{
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter name");
            name = ip.nextInt();

            File fp = new File("A.text");
            FileWriter fw = new FileWriter(fp);
            fw.write(name);
            fw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
    */
