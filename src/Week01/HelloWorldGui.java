/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 08/31/21
Assignment Description: Hello Java World, gets Input for Name and salary then outputs the name
to user and their new weekly salary.
*/

// comment out before submit
package Week01; // vscode source package location

import javax.swing.*;
//import java.util.*;
//import java.io.*;

public class HelloWorldGui {
    public static void main(String[] args) {

        // Declare Variables
        String firstName = "";
        int weeklySalary = 0;

        // Ask for user input
        firstName = JOptionPane.showInputDialog("Hello, what is your name?");
        // Display Greetings with user name, ask for salary

        weeklySalary = Integer.parseInt(JOptionPane.showInputDialog("Nice to meet you " + firstName + ". What is your weekly Salary?"));
        //JOptionPane.showMessageDialog(null,"Nice to meet you "+firstName+". What is your weekly Salary?");

        // Perform Calculation
        JOptionPane.showMessageDialog(null, "Thank you " + firstName + ", We will increase your weekly salary by 50 dollars. \nYour new weekly salary is: $" + (weeklySalary + 50));

    }
}