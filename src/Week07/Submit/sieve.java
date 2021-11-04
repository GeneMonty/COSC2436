package Week07.Submit;

import java.util.Scanner;



public class sieve {
    public static void main(String[] args) {

        final int N_PER_LINE = 8; // numbers per line

        Scanner in = new Scanner(System.in); // init scanner

        // Get user input
        System.out.print("find all prime numbers <= n, enter n: ");
        int n = in.nextInt();

        boolean[] primes = new boolean[n + 1]; // init prime numbers sieve

        // init primes[i] array to true
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

        int count = 0; // keep count of prime numbers found

        // print primes array
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) { // if false skip this number [i] else add to primes
                count++;
                // format output
                if (count % N_PER_LINE == 0) {
                    System.out.print(" " + i);
                    // System.out.printf("%7d\n", i);
                } else {
                    System.out.print(" " + i);
                    // System.out.printf("%7d", i);
                }
            }
        }
        System.out.println("\n[" + count + "] prime numbers found <= " + n);

        in.close(); // close scanner

    }
}
