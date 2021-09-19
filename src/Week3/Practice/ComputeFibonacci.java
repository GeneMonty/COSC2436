package Week3.Practice;

import java.util.Scanner;

public class ComputeFibonacci {

  public static void main(String[] args) {
    //Create Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an index for a Fibonacci number: ");
    int index = input.nextInt();

    // Find and display the Fibonacci number
    System.out.println(
      "The fibonacci number index " + index + " is " + fib(index)
    );
    input.close();
  }

  // Fib Finding methods
  public static long fib(long index) {
    if (index == 0) { // base Case
      return 0;
    } else if (index == 1) { // base case
      return 1;
    } else {
      return fib(index - 1) + fib(index - 2);
    }
  }
}
