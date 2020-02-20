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


# Definition 
Lambda expressions are implemented using Functional interfaces
Keep your code concise.
Allows functional programming.

new Thread(() -> {
			String testString = "My Test";
			System.out.println(testString);
		}).start();



List<String> list = Arrays.asList("***", "**", "****", "*");
		Collections.sort(list, compLambda);


	sort(List<T> list, Comparator<? super T> c)