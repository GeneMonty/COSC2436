/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 09/12/21
Assignment Description: This program...
*/
package Week02.WeekAssigment;

import java.util.Scanner;
import java.util.regex.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class PayrollDemo {
    public static void main(String[] args) throws Exception {

        // Declare local Variables
        String n1;      // local name variable
        String id1;     // local id variable
        int h1;         // local hours variable
        double r1;      // local payrate variable

        // Create a scanner called kb
        Scanner kb = new Scanner(System.in);

        // Create ne Payroll Object
        Payroll employee1 = new Payroll();


        // While Conditiosn not met, to check for name.
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
                // Store name in Employee object and continue to next promp
            } else {
                employee1.setName(n1);
                break;
            }
        }

        // 1.2 Get Eployee id from user account LLNNNN format
        // Parse ID for correct LLNNN format,else throw exception
        // id1=kb.nextLine();
        // // id1.toUpperCase();
        // System.out.println(id1);
        // String firstTwo = id1.substring(0, 2);
        // String lastFour = id1.substring(2);
        // String firstTwo = id1.substring(0,2);

        // System.out.println(firstTwo);
        // System.out.println(lastFour);
        // Pattern p = Pattern.compile("(([A-Z].*[0-9]))");
        // Matcher m = p.matcher(id1);
        // boolean b = m.find();
        // System.out.println(b);

        //!! Check for for values broken try having different values and concate

        // while (true){

        //     System.out.println("Enter Employee ID e.g[\"AB1234\"]: ");
        //     id1=kb.nextLine();
        //     String firstTwo = id1.substring(0, 2);
        //     String lastFour = id1.substring(2);

        //     if (id1.length()>6){
        //         System.out.println("ID has more than 6 characters, try agian.");
        //     } 
        //     //
        //     if (!firstTwo.matches("[a-zA-Z]")){
        //         System.out.println("First two Characters ["+ firstTwo +"] are not letters, try again");

        //     }else {
        //         break;
        //     }

        //     if (!lastFour.matches(".*\\d.*")){
        //         //String idf = id1.toUpperCase();
        //         System.out.println("Last 4 Characters ["+ lastFour +"] must be digits, try again");
        //         //break;
        //     }
        //     else{
        //         System.out.println(lastFour);
        //         employee1.setIdNumber(id1);
        //         break;
        //     }
        // }

        while (true){
            System.out.println("Enter Employee ID e.g[\"AB1234\"]: ");
            id1 = kb.nextLine();
            if(id1.length() != 6 || !Character.isLetter(id1.charAt(0)) ||
            !Character.isLetter(id1.charAt(1)) || !Character.isDigit(id1.charAt(2)) ||
            !Character.isDigit(id1.charAt(3)) || !Character.isDigit(id1.charAt(4)) ||
            !Character.isDigit(id1.charAt(5))){
                System.out.println("User Correct form for ID e.g[\"AB1234\"]: ");
                System.out.println("Please try agian.\n");
            }else {
                
                employee1.setIdNumber(id1.toUpperCase());
                break;
            }
        }


        //Get employee hours from user.
        while (true) {
            // Ask for Employee hours
            System.out.println("Enter Hours between [0-84]: ");
            h1 = kb.nextInt();
            // If hours are negative or greater than 84 throw error,
            if (h1 < 0 || h1 > 84) {
                System.out.println("[!]You entered [" + h1 + "], \n[!]Hours must be positive numbers between [0-84]");
                System.out.println("Plese try again\n");
            } else {
                // Store hours to employee object
                employee1.setHours(h1);
                break;
            }

        }

        // Get employee hours from user.
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

        // Calculate Weekly Salary
        double wSalary = employee1.getHours() * employee1.getRate() * 5;

        //Display Employee Informationto user.
        System.out.println("\nResults");
        System.out.println("|Name: " + employee1.getName() + " \n|ID: " + employee1.getIdNumber());
        System.out.println("|Hours: " + employee1.getHours() + " \n|Payrate: $ " + employee1.getRate() + "\n|Weekly Salary: $ " + wSalary);

        //Close kb scanner

        kb.close();
    }

}