/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 09/12/21
Assignment Description: This program creates an Payroll object, asks the User to assings the
a name, ID number, hours and payrate. Stores the correct input into the object and finally displays 
the stored information to the user.
*/

package Week07.Submit;
import java.util.*;

public class primeDemo {
    
    public boolean isPrime(int n) {
        // Loop from 2 until n to check if the number is prime.
        for(int i = 2; i < n; i++) {
            // If the remainder is 0 then its not prime, return false
            if(n % i == 0){
                return false;
            }
        }
        // if prime returns true and stores value in array
        return true;
    }
    
    // Return the number of primes between 2 and n
    // public Object[] numberOfPrimes(int n) {
    //     return primes[];

    // }

    // create a list array to store prime integers
    List<Integer> primes = new ArrayList<Integer>();
    
    //MAIN//
    public static void main(String[] args) {
        
        // init scanner
        Scanner kb = new Scanner(System.in);
        
        // init variables
        int number=0;
        
        // Request user for input
        // System.out.println("Enter a number to check if it's Prime: ");
        // number = kb.nextInt();
        //Arrays.toString();

        int numbers[] = {1,2,3,4,5};
        // output result to user
        System.out.println("Your number ["+number+"] is prime");
        System.out.println("Other prime numbers before ["+number+"] are: " );
        System.out.println("Print list of primes[]");
        // Call Array
        System.out.println(numbers);

        

    }

    
    
}
