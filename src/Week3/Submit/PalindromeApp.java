/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 09/19/21
Assignment Description: This program checks if a string is a palindrome or note using recursion.
*/

package Week3.Submit;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

public class PalindromeApp extends JFrame implements ActionListener {
    
    private JLabel labelInstruction;
    private JLabel labelAskForWord;
    private JTextField fieldMyWord;
    private JButton buttonSubmit;
 
    public PalindromeApp() {
        super("Palindrome Finder");
 
        initComponents();
 
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
 
    private void initComponents() {
        labelInstruction = new JLabel("Please enter a word to determine if it's a Palindrome");
        labelAskForWord = new JLabel("GIVE ME YOUR WORD: ");
        fieldMyWord = new JTextField(10);
        buttonSubmit = new JButton("Palindrome?");
 
        setLayout(new FlowLayout());
 
        add(labelInstruction);
        add(labelAskForWord);
        add(fieldMyWord);
        add(buttonSubmit);
 
        buttonSubmit.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent event) {

        String message = "Default Message";
 
        // float weight = Float.parseFloat(fieldMyWord.getText());
        String s = fieldMyWord.getText();

        if(s.isEmpty()){
            message = "Woops! you forgot to type something! >_<";
        
        }else if (isPalindrome(s)){
             message = "Your Word: [ " + s + " ] is a Palindrome :D";
            
        }else {
            message = "Boomer! Your Word: [ " + s + " ] is not Palindrome :(";
            
        }
        // Display Message after evaluation
        JOptionPane.showMessageDialog(this, message);
    }

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
 
    public static void main(String[] args) {
        new PalindromeApp().setVisible(true);
    }
}