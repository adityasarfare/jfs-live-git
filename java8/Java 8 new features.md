# Language Features
1. default methods
2. static methods
3. Optional Class
   
# Functional Programming
1. Lambda expressions

# Parallel Processing
1. Stream API
   
# Date & Time Became Easier


## Explore the Problems
* What is a default method?
1. Java has numerous interfaces.
   1. add new functionality?
      1. new interfaces
         1. redundancy of code
      2. modify existing interfaces

>Step 1
Create a one method interface
interface TestInterface{
    public abstract void TestMethod();
}

Task 1 : Two functional interfaces
Runnable
Comparable


  53: public interface Runnable
  54: {
  55:   /**
  56:    * This method will be called by whoever wishes to run your class
  57:    * implementing Runnable. Note that there are no restrictions on what
  58:    * you are allowed to do in the run method, except that you cannot
  59:    * throw a checked exception.
  60:    */
  61:   void run();
  62: }

Runnable obj =  () ->  { };

# Definition 
Lambda expressions are implemented using Functional interfaces
Keep your code concise.
Allows functional programming.

new Thread(() -> {
			String testString = "My Test";
			System.out.println(testString);
		}).start();

