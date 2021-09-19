/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 09/19/21
Assignment Description: This program uses GUI swing to checks if a string is a palindrome or note using recursion.
*/

package Week3.Submit; // comment out before submit

//import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
// Palindrom App Class construction
public class PalindromeApp extends JFrame implements ActionListener {
    
    // init label and fields
    private JLabel labelWelcome;
    private JLabel labelDefinition;
    private JLabel labelInstruction;
    private JTextField fieldMyWord;
    private JButton buttonSubmit;
 
    public PalindromeApp() {
        // App name in screen title
        super("Palindrome Finder");
 
        initComponents();
        // Set Windows Size
        setSize(450, 250);
        // make sure the app closes on exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
    // UI compente init
    private void initComponents() {
        // declare component variables
        labelWelcome = new JLabel("<html><style>p {text-align: justify;font-size:14px}</style> <p> <br>Welcome to Palindrome Finder</html>");
        labelDefinition = new JLabel("<html><style>p {text-align: justify;font-size:10px}</style><p>Definition: pal·in·drome <br>A word, phrase, or sequence that<br> reads the same backward as forward.</html>", SwingConstants.CENTER );
        labelInstruction = new JLabel("<html><style>p {text-align: center;font-size:12px}</style><p><br>Enter a word to determine if it is a Palindrome</html>");
        fieldMyWord = new JTextField(10);
        buttonSubmit = new JButton("<html><style>p {text-align: center;font-size:11px}</style><p>Palindrome?</html>");
 
        setLayout(new FlowLayout());
        // add components to layout
        add(labelWelcome);
        add(labelDefinition);
        add(labelInstruction);
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
 
    // Main creates the new app window.
    public static void main(String[] args) {
        new PalindromeApp().setVisible(true);
    }
}