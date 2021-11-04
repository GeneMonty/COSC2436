/*

Name: Eugenio Montealegre
Course: COSC 2436
Date: 10/31/21
Assignment Description: PrimeDemo, implements the "Sieve of Eratosthenes" as an array to check for prime numbers
If found, lets the user know if their number is prime or not.
How many primes are from 2 to n and prints those primes to the user.
package Week07.Submit;


*/

package primesDemo;

//package Week07.Submit;


import java.util.Scanner;

public class primesDemo {

	private static class MyNumber {

		// Private variable
		private int number = 0;

		// Constructor
		private MyNumber(int number) {
			this.number = number;
		}

		// Setter if number is valid else throw exception
		public void setNumber(int number) {

			if (number < 2) { // if less halt the program and throw exception
				throw new IllegalArgumentException("Number must be greater or equal to 2");
			} else {

				this.number = number; // returns the number
			}
		}

		// Getter gets the number after is has been set
		public int getNumber() {
			return number;
		}

		// Check the index inside sieve[] to see if the number is prime
		public boolean isPrime(boolean[] primes, int n) {

			return primes[n];

		}

		// Make array "Sieve of Eratosthenes"
		public boolean[] makeSieve(int n) { // n = user userInput

			boolean[] primes = new boolean[n + 1]; // sieve array of size n + 1

			// init all numbers in the array primes[i] array to true
			for (int i = 0; i < primes.length; i++) {
				primes[i] = true;
			}

			// check for factors
			for (int k = 2; k <= n / k; k++) {
				if (primes[k]) {
					for (int i = k; i <= n / k; i++) {
						primes[k * i] = false; // k *i not a prime
					}
				}
			}
			return primes; // returns array of primes with true and false values

		}

		public int count(boolean primes[]) {

			int count = 0; // keep count of prime numbers found

			// print primes array
			for (int i = 2; i < primes.length; i++) {
				if (primes[i]) { // if false skip this number [i] else add to primes
					count++;
				}
			}
			return count; // return count

		}

		// Printer method to display all the primes
		public void printPrimes(boolean[] primes) {
			for (int i = 2; i < primes.length; i++) {
				if (primes[i])
					System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {
		// Init scanner
		Scanner kb = new Scanner(System.in);

		// Declare local variables
		int input = 0;
		int prime = 0;
		boolean imPrime = false;
		boolean[] sieve = {};
		int total = 0;

		// Request user for input
		System.out.println("Check your Prime Number: ");
		input = kb.nextInt();

		// init new object called "primo"
		MyNumber primo = new MyNumber(input);
		primo.setNumber(input); // set number
		
		// call the class to set values to local variables
		
		prime = primo.getNumber(); //get number
		sieve = primo.makeSieve(prime);
		imPrime = primo.isPrime(sieve, prime); // call isPrime and checks value
		total = primo.count(primo.makeSieve(primo.getNumber()));

		// Print Results of count and if number is prime or not.
		if (imPrime) { // IF PRIME print Yes Prime
			System.out.println("Your number [" + prime + "] is Prime and there are [" + total + "] between 2 and ["
					+ prime + "].");
		} else { // IF NOT Print Not Prime
			System.out.println("Your number [" + prime + "] is NOT Prime, but there are [" + total + "] between 2 and ["
					+ prime + "].");
		}
		// Print List of Primes
		primo.printPrimes(sieve);
		
		// Close Scanner
		kb.close();

	}

}