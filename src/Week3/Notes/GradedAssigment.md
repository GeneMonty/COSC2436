# Graded Asigments

## Quiz

This quiz covers content from the Recursion chapter **(Chapter 18)**.

* You have one hour (60) to complete this quiz.
* You have three attempts at this quiz.

## Lab "Palindrome"

!!!info A palindrome is a group of characters that read the same forward or backwards.

The goal of this assignment is to write a recursive method that detects whether the String parameter is receives is a palindrome or not.

* The method should be a boolean-returning method called isPalindrome.
* This method should be demonstrated in a main method.
* The program package should be called palindromes.

### Example input/output
**Sample Output** `Sample Input` 
**Please enter a word or phrase to determine if it is a Palindrome:** `kayak`
**Thank you, your word kayak is a Palindrome.**

<div style="page-break-after: always;"></div>

## Palindrome Skeleton code

```java
public static void main(String[] args)
{
//Create an array of strings to test.
String[] testStrings = { "Palindromes go here" };

//  Test the strings.
//  Use a for loop to
//  print the test string one at a time
//  Use an if statement to call isPalindrome(array)
//  if its true then print " is a palindrome
//  if its false then print "is not a palindrome
}
/**
The isPalindrome method determines whether a string
is a palindrome.
@param str The string to test.
@return This method returns true if str contains a
palindrome. It returns false otherwise.
*/
isPalindrome(String) the recursive method that take a string and returns boolean
{
//  set boolean variable to false
//  if the string length <= 1
//  then boolean is set to true
//  else if the charAt(0) is equal to the last character
//  set boolean variable equal to isPalindrome(the new substring (1, str.length()-1)
//  return boolean variable
}
```