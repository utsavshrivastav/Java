
@FunctionalInterface
public interface Demo {
       public abstract void show();
}
class index implements Demo{
    @Override
    public void show()
    {
        System.out.println("Welcome to india ");
    }
    public static void main(String arg[])
    {
        index ob = new index();
        ob.show();
    }
}
