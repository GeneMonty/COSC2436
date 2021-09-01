/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 08/31/21
Assignment Description: Hello Java World, gets Input for Name and salary then outputs the name
to user and their new weekly salary.
*/
package Week01;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // new scanner object
        System.out.println("Hello, what is your name? ");
        
        // Get input from user "userName"
        String userName = scan.nextLine(); // read string input
        
        System.out.println("Nice to meet you "+userName+". What is your weekly Salary?");
        
        // Get input for "weeklySalary"
        int weeklySalary = scan.nextInt(); // read int input
        
        // Perform calculation and display final output
        System.out.println("Thank you "+userName+", We will increase your weekly salary by 50 dollars. \nYour new weekly salary is: $" + (weeklySalary+50));
        scan.close(); // Close Scanner
    }
}
