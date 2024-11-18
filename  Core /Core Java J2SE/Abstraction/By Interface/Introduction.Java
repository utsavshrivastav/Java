/*

                          ******** ImPoRtAnT PoInT ********

 It is Used to Provide / Achieve Abstraction . 

 As java does not Support Multiple Inheritance So , To Achieve Multiple Inheritance . we can use Interface 
                          ie.. MUltiple Interface Can be Implemented. 

To Create Ineerface , we use Interface Keyword .

To Implement Interface we use "implement" Keyword .

A Class Can Interface Implement Multiple Interface 

An Interface can Inherit another Interface . 

Before Java 8 Version Only Abstract Method is There All the Abstract Method or Interface Must be Decleared as Public .

After Java 8 Version , Default and Static Concrete Method is Allowed . 

After 9 Version , Private Mehod Can also be Created in Interface . 

Variable of Interface Can be Defined as - 
public static final int a = 1;


Overriding of abstract Method Of Interface is Compulsory 
 ie ...
  Class who implemented the Interface must be Override the Abstract Method of Interface .
    interface I
    {
    public static final int a = 5; 
     
    public static void show();

    }     compiler Compilation me auto edit hoga . ye publc static final & public . -> rememebr 




1. Whenever We Override the Abstract of Interface we Should always use public acess modifier . 

2. we cannot create Intanciate/object of Interface . ie.. Object nahi Banaegi Interfaces ki .

3. We Cannot Create Constructor of Interface  Because All data Memeber in Interface are public static final by Default .  -- Important Point

4. If an Interface have Only Single Abstract method then Such Interface is called "Single Abstract Method" (SAM) or "Functional Interface"

5. An Interface Don't have any method is Called Markup Interface , Seriallliable , Clonable . 


 */