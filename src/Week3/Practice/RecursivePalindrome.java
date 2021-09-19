package Week3.Practice;
import java.util.*;
import java.util.Scanner;

public class RecursivePalindrome {
    public static boolean isPalindrome(String s) {
        return isPalindrome(s,0,s.length()-1);
    }

    private static boolean isPalindrome(String s, int low, int high){
        if (high <= low){ // basecase
        return true;
        }else if (s.charAt(low) != s.charAt(high)){
            return false; //base case
        }else {
            return isPalindrome(s.toLowerCase(),low+1,high-1);
        }
    }
    public static void main(String[] args) {
        
        String[] palindromes = { "ana", "Ana","banana", "lol", "raDaR","lepers REPEL"};
        String word;

        Scanner kb = new Scanner(System.in);
        word = kb.nextLine();

        
        System.out.println("Please enter a word or phrase to determine if its a palindrome");

        System.out.println("Thank you, your word \"" + word + "\" is a palindrome.");


    
        kb.close();
        System.out.println("Here is also a list of palindromes or not ;D");
        System.out.println("Is ["+palindromes[0]+"] a palindrome? " + isPalindrome(palindromes[0]));


    }
}


