/* Steve Kornahrens
 * Project Euler 25: What is the first term in the Fibonacci sequence to contain 1000 digits?
 * https://projecteuler.net/problem=25 
 *
 * Since javascript's integer value is limited in size I ported my code in the FibSequence.html into java.
 * This allowed me to convert my variables into BigIntegers and allow for my while loop to step through every
 * term leading up to a term with 1000 digits. I had to convert my while condition to a 
 * (BigInteger).compareTo(BigInteger) condition. I learned about that in order to solve this problem.
 * 
 * Thought Process to find answer: I wanted to be able to step through every term so I have provided that with the 
 * commented out System.out.println. Activating will show you results of each loop at the cost of your computers life.
 * My computer learned that the hard way.
 * 
 * fibone represents term 1 with a value of 1. fibtwo represents term 2 with a value of 1. So the first term provided
 * in the while loop will be term 3, hence int term_count equaling 3. Each loop starts by adding fibone and fibtwo 
 * together and assigning that result to cur_value. Then fibone is assigned the current value of fibtwo and fibtwo is 
 * assigned the current value of cur_value. Finally term_count is increased by one to represent an iteration of term
 * calculations.
 * 
 * This loop continues as the new value of cur_value is checked against goal until cur_value finally reaches a size of 
 * 1000 digits. This evaluates the if statement to true, breaking the loop, and printing the term_count and for fun the
 * actual value of term 4782. 
 *

 */

import java.math.BigInteger;

public class FibSequence {
  public static void main(String[] args) {
    BigInteger fibone = new BigInteger("1");
    BigInteger fibtwo = new BigInteger("1");
    BigInteger cur_value = new BigInteger("0");
    int term_count = 3;
    BigInteger goal = (new BigInteger("10")).pow(999);
   
    while ((cur_value).compareTo(goal) <= 0 ) {
        cur_value = (fibone).add(fibtwo);
        //System.out.println("Current Fibonacci number is: " + fibone + "+" + fibtwo + "=" + cur_value + " at term " + term_count);
        fibone = fibtwo;
        fibtwo = cur_value;
   
        if ((cur_value).compareTo(goal) >= 0) {
      break;
        }
        
    term_count++;
    }
    System.out.println("The Fibonacci reaches a value of over one thousand digits at term " + term_count);
    System.out.println("The FIbonacci has a current value of " + cur_value);
  }
}

