/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 09/04/21
Assignment Description: Hello Java World using Swing GUI, Gets user input firstName and weeklySalary then outputs the name
to user and their new weekly salary.
*/

// Comment out package Week01 before submit 
package Week01; // vscode source package location


import javax.swing.*;
import java.util.*;
import java.io.*;


public class HelloWorldGui {
    public static void main(String[] args) {

        // Declare Variables
        String firstName = "";
        int weeklySalary = 0;

        // Ask user for input using swing GUI library
        firstName = JOptionPane.showInputDialog("Hello, what is your name?");

        // Display greetings to user and ask for weeklySalary
        weeklySalary = Integer.parseInt(JOptionPane.showInputDialog("Nice to meet you " + firstName + ".\nWhat is your weekly Salary?"));

        // Perform Calculation and update user on their new total.
        JOptionPane.showMessageDialog(null, "Thank you " + firstName + "!. \nWe will increase your weekly salary by 50 dollars. \nYour new weekly salary is: $" + (weeklySalary + 50));

    }
}
