import java.util.Scanner;

/******************************************************************
 * Lab 2
 *
 * Programmer: INSERT YOUR ONYEN HERE!
 *
 * Due Date: 10/21/2015 at 11:55pm
 *
 * COMP110-002/3, Fall 2015       Instructor: Kris Jordan
 *
 * Pledge: I have neither given nor received unauthorized aid
 *         on this program. 
 *
 * Description: 
 *         This program uses an array to store values which are 
 *         multiples of three and then runs computations on them.
 *
 * Input:  The user provides the size of the array to create. The user
 *         is then asked for that many multiples of 3. Finally the user
 *         selects the mathematical operation to do over those numbers.
 *
 * Output: The sum and/or average of the numbers input.
 *
 ******************************************************************/
public class Lab2 {

  public static void main(String[] args) {
    // The `keyboard` Scanner is provided for you
    Scanner keyboard = new Scanner(System.in);
    
    println("Welcome!");
    
    println("Please enter the *size* of the array you want to create.");
    
    // TODO: Step 5 - Construct int array ***named multiplesOfThree*** 
    //                with its size driven by user input.
    
    // TODO: Step 6 - Fill array with user inputs
    // You can reuse the prompts in your Step 6 loop below, just uncomment
    // and use where you need it.
    // println("Please enter an integer that is a multiple of 3.");
    // println("That is not a multiple of 3. Try again!");
    
    println("What operation would you like to perform on the array?");
    println("1: Compute the sum");
    println("2: Compute the average");
    println("3: Compute both");
    
    // Assign the correct values to these variables in Step 8.
    int sum = 0;
    double average = 0.0;
    
    // TODO: Step 8 - Depending on the user's selection do the needed
    //       calculations and output it as per the instructions.
    
    // Here are some more boilerplate outputs you can uncomment and reuse.
    // println("You input:");
    // printIntArray(multiplesOfThree);
    // println("The sum is " + sum);
    // println("The average is " + average);
    // println("Unrecognized Option");
  }
  
  
  
  
  /*=======================================
    
    Do not modify the helper code below!
    But you'll learn something reading it...
        
   We'll learn about how this works *very soon*. If you're
   dying to find out, though, spoilers follow.
  
   This is support code provided to make your life easier.
   
   As we've learned this semester,
   our programs tend to run linearly: line 1, line 2, line 3
   
   We've seen two exceptions to this:
   
   1) With branching statements, like if-else, our program
      will move to one place in code or another depending on
      whether some condition(s) are true or false.
      
   2) With looping statements, like while and for, our program
      will run through some series of steps and then repeat those
      steps until some condition becomes false.
      
   We're about to reveal one more way in which your program's
   execution can jump around: method calling.
   You can think of methods kind of like mini-programs within
   your program that you give a name (an identifier!) and can
   then reuse whenever you want. We've discussed methods briefly,
   things like 'println' or Scannner's 'nextLine' or Math's
   'random'.
   
   What happens when your code above calls, or "invokes" the 
   `println` message is your program "jumps" to the `println`
   method that is defined below. It is passed one input, a 
   String named `message`. This method, in turn, calls the full
   System.out.println(String) method and passes along that message.
   Once that line of code is done running, the program will jump
   _back_ to where it was before and continue along -- kind
   of like inception. 
  */
  static void println(String message) {
    System.out.println(message);
  }
  
  /*   
   The `printIntArray` method below works similarly, but it takes
   as its input an array of integers. These inputs are called
   "arguments". When called with an array whose elements are 3, 6, 9
   this method will print an output like:
   
   { 3, 6, 9 }
   
   Notice that the implementation of `printIntArray` contains a loop
   and a few print statements. By "abstracting" this behavior in
   a method, we can print out any integer array we want without having
   to manually write out the code below each time. It's a little
   program we can reuse within our program!
   
   We'll talk about writing our own methods soon. They're very powerful
   and a whole lot of fun!
  */
  static void printIntArray(int[] input) {
    System.out.print("{ ");
    for(int i = 0; i < input.length; i++) {
      if(i > 0) {
        System.out.print(", ");
      }
      System.out.print(input[i]);
    }
    System.out.print(" }\n");
  }

}