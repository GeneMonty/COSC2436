package Week01;

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
;


/* 
bmi = Weight x (703/Height)
Weight in pounds
Heigt in inches
Optimal BMI
Sedentary 18.5<x<25 ,
underweight bmi < 18.5
overweight bmi > 25

*/
public class BMI {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        
        // Declare Variables
        double weight ; // Pounds
        double heightFoot = 0;
        double underweightBMI = 18.5;
        double overweightBMI = 25;
        
        // Ask for input
        weight = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your weight in pounds eg 178.2","Input your Weight",JOptionPane.QUESTION_MESSAGE));
        heightFoot = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your height in Foot eg 5.11","Input your Height",JOptionPane.QUESTION_MESSAGE));
        
        //Calculate foot to Inches
        double heightInches = heightFoot * 12; // Inches 5,11 in

        // Display Entteresd values to user
        JOptionPane.showMessageDialog(null, "You Entered:\n" + weight + " lb\n" + heightFoot + " ft,in");
        
        // Calculate BMI
        double BMI = (weight / (Math.pow(heightInches,2))) * 703;
        
        //Display correct Under, Normal or Overweight warning
        if (BMI < underweightBMI){
            JOptionPane.showMessageDialog(null,"You have a BMI of "+ df.format(BMI)+"\n You are Underweight");
            JOptionPane.showMessageDialog(null,"At this point you might be gone with the wind! Eat MOAR! :D, \nGoodbye");
        } else if (BMI <=overweightBMI && BMI >=underweightBMI) {
            JOptionPane.showMessageDialog(null,"You have a BMI of "+ df.format(BMI)+"\n You are Normal");
            JOptionPane.showMessageDialog(null,"You are the epitome of health :D, \nGoodbye");
        } else {
            JOptionPane.showMessageDialog(null,"You have a BMI of "+ df.format(BMI)+"\n You are Overweight");
            JOptionPane.showMessageDialog(null,"Eat Healtier and do more excersie :D, \nGoodbye");
        }

        // else if 18.5< x<25 healthy
        // else bmi >25 owverwieht

        //JOptionPane.showMessageDialog(null,"You have a BMI of "+ df.format(BMI) );

        //JOptionPane.showInputDialog("Value: %.2f", heightInches);

    }
}
