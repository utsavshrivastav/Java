       /* Static method of Interfaces  */

public interface Demo {
    static void show()
    {
        System.out.println("Welcome");
    } 
}

class Index implements Demo
{
    public static void main(String[] args) {
        Demo.show();
    }
}