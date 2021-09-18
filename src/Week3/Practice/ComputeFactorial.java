package Week3.Practice;

import java.util.Scanner;

public class ComputeFactorial {

  /*Main Method*/
  public static void main(String[] args) {
    // create Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a non-negative integer: ");
    int n = input.nextInt();

    // Display Factorial

    System.out.println("Factorial of " + n + " is " + factorial(n));
    input.close();
  }

  /**Return the factoria for the specified number using recursion */
  public static long factorial(int n) {
    if (n == 0) { // Base case
      return 1;
    } else {
      return n * factorial(n - 1); // Recursive call
    }
  }
}
/**Inifinite Recursive call
 *
 * public static long factorial(int n){
 * return n * factorial(n-1);
 * } // Base Case missing, creating an infinite recursion
 *
 */
