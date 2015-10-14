import java.util.Scanner;

/******************************************************************
 * Lab 2
 *
 * Programmer: INSERT YOUR NAME HERE!
 * 
 * ONYEN: INSERT YOUR ONYEN HERE!
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
    
    // Step 3.
    printLine("Welcome!");
    
    // Step 4.
    printLine("Please enter the *size* of the array you want to create.");
    
    // TODO: Step 5 - Construct multiplesOfThree array with its 
    //                size decided by user input.
    int[] multiplesOfThree;
    
    // TODO: Step 6 - Fill array with user inputs
    // You can reuse the prompts in your Step 6 loop below, just uncomment
    // and use where you need it.
    // printLine("Please enter an integer that is a multiple of 3.");
    // printLine("That is not a multiple of 3. Try again!");
    
    // Step 7
    printLine("What operation would you like to perform on the array?");
    printLine("1: Compute the sum");
    printLine("2: Compute the average");
    printLine("3: Compute both");
    
    // TODO: Step 8 - Depending on the user's selection do the needed
    //       calculations and output it as per the instructions.
    int sum = 0;
    double average = 0.0;
    
    // Here are some more boilerplate outputs you can use.
    printLine("The sum is " + sum);
    printLine("The average is " + average);
    printLine("Unrecognized Option");
    
    // TODO: Done. Don't forget to submit to Sakai and check
    //       your submissions!!!
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
   
   We'll talk about writing our own methods soon. They're very powerful
   and awesome and da real mvp.
  */
  static void printLine(String message) {
    System.out.println(message);
  }
}