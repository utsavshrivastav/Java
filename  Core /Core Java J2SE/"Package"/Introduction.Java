
/*

 ***  Scanner class - belong to "util" PackAGE 
      Class By Default Modifier hoga , but Package Need to Change , wo Folder ke baahar se ya outside se Acess hoga , Public specifier use kar ke .
 
1. Bassically , Package means We are talking About Folder .
          or , 
    A Java Package is Group of Similar Types of Classes , Interfaces , and Sub-Packages . 
    
 2. Package in Java Can be Categories into - 
             a. Built - In Package .
             b. User - Defined Package 
             
             
3. There are many Built-in Package  - util , io , sql , Swing , awt , Javax , Lang Package .

4. Java Package is used to Catrgories Classes and the Interface  So, that it Can be Easily Maintained . 

5. Java Package Provide Access Protection , 
   Java Package Remove Naming Collison (2A classes in Same FOlder)

For Example - 
    Package p;
    public  class A  - [here by-default , Default need to be Public]
      {
    System.out.println("Welcome");
      } 
    }
                      |
                      |
                      |
                      V

    import P.A;   -> yeha par hamne "Package p" ko laya uppar se .
    class Demo 
    {
       public static void main (String arg[])
       {
        A ob = new A();  ->[class ka Object haian jo ki Package p me likhi hue hain .]
        ob.show();
       }
    }
 

 */