package Week02.WeekPractice;

import java.util.Scanner;

public class EmployeesDemo {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        // Step 1 Variables
        //local variables =
        //String nam = ""; // hardcoded
        // create object instance
        Employees emp1 = new Employees();// Creating an employee object named emp1 with no arg constructor
        Employees emp2 = new Employees("Tim Cook", 10); // employee object with 2 argo constructor
        Employees emp3 = new Employees("Larry Page",11235813,"CEO","Ruler");
        
        // 2. Talk tot he user
        System.out.println("Enter Employee name: ");
        // 3. Save 
        //nam = kb.nextLine(); // hardcoded
        //emp1.setName(nam); // saves the name into the name field in the database
        emp1.setName(kb.nextLine()); //saves name into the name fiel
 // saves the name into the name
        // 4. Calculation or Logic 
        
        
        // 5. Display 
        System.out.println("Name: "+ emp1.getName());
        System.out.println("Name: "+ emp2.getName() + " ID: " + emp2.getIdNumber());
        System.out.println("Name: "+ emp3.getName() + " ID: " + emp3.getIdNumber() +" Department: "+ emp3.getDepartment() +" Position: "+emp3.getPosition());
        kb.close();
    }
}
