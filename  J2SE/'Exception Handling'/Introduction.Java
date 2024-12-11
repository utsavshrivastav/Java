
/*
                    ***********   EXCEPTION HANDLING  ************
1. Exception handling is the process of responding to unexpected events that occur while a computer program is running. 
       The purpose of exception handling is to prevent the program from crashing and to maintain normal operation. 

2. Here are some details about exception handling in different programming languages:
a. Python -
         Exceptions can be triggered automatically on errors, or they can be triggered and intercepted by the code. 
b. C++ -
        Exception handling uses the keywords try, throw, and catch. The try statement defines a block of code to be tested for errors. 

c. Java -
      Exception handling uses the keywords try, catch, finally, and throw: 
      try: Specifies the exception block 
      catch: Specifies the solution 
      finally: Has a mandatorily executable code 
      throw: Throws an exception 

3. Benefits of exception handling include:
 a.Allowing the program to run continuously without disruption
 b.Catching specific exceptions that occurred in the program
 c.Helping developers write cleaner code and learn how to handle exceptions



            ******* Keyword To Handle Exception Handling ********* 
            
        1.  TRY - In try Block We Write that Code in which their may be possibility of Exception .
                - we Cannot write try Block Alone it always Followed by Catch Block or Finally . 
               
        2.  CATCH - Used to handle the exception 
                  - it must be precident by try Block , which means we cannot used Catch Block alone . 
                  
        3.  FINALLY - It is used to execute the necessory code of program . 
                    - It is executed weather exception is handled or not . 
                   
        4.  THROW   - The Throw Keyword is used to throw an exception (explicity)
        
        5.  THROWS  - It is used to Declare Exceptions . it Specify that their may Occur an exception in the method
                    - It does not throw an exception 
                    - It Always used with method signature.
                    
                    
       * Print stack trace or (print(stack)trace) / system.out.println() -- 2 method/ways to print Exception 

       * [ Anonymous Object  -  new class().function name; ]

       * All the Exception occurs at runtime . -imp
        
       * Thousands of exception hoti hain java ke andar . 
      
                      * Compile Time Exception v/s Run Time Exception 

                        1. command to compile program in terminal - javac filename.java (ex- javac test.java)
                        2. Command to run program in terminal - java filename (ex java test) - exception idher he occur hoga . ya phir aisa samajh lo li yeh command likhte ke sath he exception dhekhegi .

             1.  Compile time Exception - Compile time exception wo hoti jo compiler check kar sakata hain.
                    or
                 checked exception     -- compiler check the exception   
                  - jo compiler, compile time par he checked kar leta hain usse he hmm kehenge checked exception .
                  aur iss tarah ke exception ko report/handle krna padata /hota hain . try block ya catch block ke help se tabi jhhaa kr compiler , program ko compile karenga.
              
             2.  Run time Exception  - runtime exception wo hoti hain, jo compiler apne level pe check nahi kar sakta hain . means Compiler simply ignore the exception ya check nhin krata.
                     or 
                 Unchecked Exception   -- compiler not able to check  .
              
              
      
                 TWO TYPE OF EXCEPTIONS - 
                    1. CHECKED EXCEPTION (compile time exception)
                    2. UNCHECKED EXCEPTION(runtime exception)
              

 */         