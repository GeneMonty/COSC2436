/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 09/19/21
Assignment Description: This program checks if a string is a palindrome or note using recursion.
*/

package Week3.Submit;
import java.util.*;

public class PalindromeFinderDemo {
       
    public static void main(String[] args) {

        // Init a palindrome array, to execute in palindromeSampler
        String[] palindromes = {
            "lol",
            "ana",
            "Ana",
            "anana",
            "raDaR",
            "someteMos",
            "recOnocer",
            "Lepers Repel",
            "Anula la luna",
            "Eva, can I see bees in a cave"
        };
        // Create Scanner
        Scanner kb = new Scanner(System.in);
        // Display Instructions and init variable
        System.out.println("Please enter a word to determine if it's a palindrome or type [EXIT] to end program.");
        String myWord = "";

        // run the evaluation while until EXIT is input by the user
        while (!"EXIT".equals(myWord)) {

                                        
            if ("EXIT".equals(myWord)) {                // Exit the program else
                System.out.println("Goodbye!!");
                break;
            } else {                                    // Keep askig for a new word
                System.out.println("Enter a Word: ");
                myWord = kb.nextLine();
                displayResult(myWord);
            }

        }

        // Call Palindrome Sampler after Exiting and say goodbye.
        System.out.println("A final list of palindromes for your eyes :D");
        palindromeSampler(palindromes);

        System.out.println("Goodbye!!\n");

        // Close the scanner
        kb.close();

    }

    //**********************************************************
    // Function Definitions
    //**********************************************************
    
    // Method isPalindrome indirectly calling to the isPalindrome
    // Gets String, removes whitespace and , and checks string lenght
    public static boolean isPalindrome(String s) {
        return isPalindrome(s.replaceAll("[\\s\\,]", "").toLowerCase(), 0, s.replaceAll("[\\s\\,]", "").length() - 1);
    }
    
    // overloaded checks for base case recursion
    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low) {
            return true;// base case
        } else if (s.charAt(low) != s.charAt(high)) {
            return false; //base case
        } else {
            return isPalindrome(s, low + 1, high - 1); // Recursion case
        }
    }
    
    // Display Results
    private static void displayResult(String myWord) {
        if (!isPalindrome(myWord)) {

            System.out.println("Boomer! Your Word: [ " + myWord + " ] is not Palindrome :(");

        } else {

            System.out.println("Your Word: [ " + myWord + " ] is a Palindrome!!:D");
        }
    }
    // Palindrome Sampler Runs a loop of palindromes from palindromes array
    private static void palindromeSampler(String[] palindromes) {
        for (int i = 0; i < palindromes.length; i++) {
            if (!isPalindrome(palindromes[i])) {
                System.out.println("Is \" " + palindromes[i] + " \" a palindrome? [Nope! Not a Palindrome!]");

            } else {
                System.out.println("Is \" " + palindromes[i] + " \" a palindrome? [Yup! It's Palindrome!]");

            }
        }
    }

    

}