/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 09/12/21
Assignment Description: This program creates an Payroll object, asks the User to assings the
a name, ID number, hours and payrate. Stores the correct input into the object and finally displays 
the stored information to the user.
*/
package Week02.WeekAssigment; // comment out before submitting

import java.util.Scanner;
// import java.util.regex.*;
// import java.lang.*;
// import java.math.*;
// import java.io.*;

public class PayrollDemo {

    public static void main(String[] args) throws Exception {

        // Create a scanner called kb
        Scanner kb = new Scanner(System.in);

        // Create ne Payroll Object
        Payroll employee1 = new Payroll();

        // While Conditiosn not met, to check for name.
        askForName(kb, employee1);

        // Get Employee ID from user.
        askForID(kb, employee1);

        //Get employee hours from user.
        askForHours(kb, employee1);

        // Get employee hours from user.
        askForPayrate(kb, employee1);

        // Calculate Weekly Salary
        double wSalary = employee1.getHours() * employee1.getRate() * 5;

        //Display Employee Informationto user.
        displayResults(employee1, wSalary);

        //Close kb scanner
        kb.close();
    }

    //*************************
    // Function Definitions
    //*************************

    // Function ask for name and checks input
    private static void askForName(Scanner kb, Payroll employee1) {
        String n1;
        while (true) {
            // Ask for employee Name
            System.out.println("Enter Employee Name: ");
            n1 = kb.nextLine();

            // If employee is empty ask name again
            if (n1.length() == 0) {
                System.out.println("Name field cannot be empty, try again");
                // if employee name is single char ask name again
            } else if (n1.length() <= 1) {
                System.out.println("Name field cannot be Char, try again");
                // Save name in Payroll object and continue to next promp
            } else {
                employee1.setName(n1.toUpperCase());

                break;
            }
        }
    }

    // Function ask for ID number and checks format
    private static void askForID(Scanner kb, Payroll employee1) {
        String id1;
        while (true) {
            System.out.println("Enter Employee ID e.g[\"AB1234\"]: ");
            id1 = kb.nextLine();
            // Check if ID is
            if (
                id1.length() != 6 ||
                !Character.isLetter(id1.charAt(0)) ||
                !Character.isLetter(id1.charAt(1)) ||
                !Character.isDigit(id1.charAt(2)) ||
                !Character.isDigit(id1.charAt(3)) ||
                !Character.isDigit(id1.charAt(4)) ||
                !Character.isDigit(id1.charAt(5))) {
                System.out.println("[!]Incorrect format. Correct form ID e.g[\"AB1234\"]");
                System.out.println("Please try again.\n");
            } else {
                // Save ID number to Payroll object
                employee1.setIdNumber(id1.toUpperCase());
                break;
            }
        }
    }

    // Function ask for hours to and checks inputs   
    private static void askForHours(Scanner kb, Payroll employee1) {
        int h1;
        while (true) {
            // Ask for Employee hours
            System.out.println("Enter Hours between [0-84]: ");
            h1 = kb.nextInt();
            // If hours are negative or greater than 84 throw error,
            if (h1 < 0 || h1 > 84) {
                System.out.println("[!]You entered [" + h1 + "], \n[!]Hours must be positive numbers between [0-84]");
                System.out.println("Plese try again\n");
            } else {
                // Save hours to Payroll object
                employee1.setHours(h1);
                break;
            }

        }
    }

    // function ask for payrate and checks input
    private static void askForPayrate(Scanner kb, Payroll employee1) {
        double r1;
        while (true) {
            System.out.print("Enter Payrate. Between [0-25]: ");
            r1 = kb.nextDouble();
            if (r1 < 0 || r1 > 25) {
                System.out.println("[!]You entered [" + r1 + "], \n[!]Payrate must be positive numbers between [0-25]");
                System.out.println("Plese try again\n");
            } else {
                employee1.setRate(r1);
                break;
            }

        }
    }

    // function display results
    private static void displayResults(Payroll employee1, double wSalary) {
        System.out.println("\nResults");
        System.out.println("|Name: " + employee1.getName() + " \n|ID: " + employee1.getIdNumber());
        System.out.println("|Hours: " + employee1.getHours() + " \n|Payrate: $ " + employee1.getRate() + "\n|Weekly Salary: $ " + wSalary);
    }
}