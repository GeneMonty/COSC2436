package Week04.Notes;

import java.util.ArrayList;
import java.util.*;

//Generics
public class lectureCh19 {
    public static void main(String[] args){
        int firstNum = 5;
        int secondNum = 7;

        double thirdNum = 8.5;
        double fourthNum = 9.7;
        
        // This is not generics
        // ArrayList<String> myList = new ArrayList<>();
        // ArrayList<Integer> myIntList = new ArrayList<>();// this is a generic array list <> assumes String
        // ArrayList<Double> myDoubleList = new ArrayList<>();
        // ArrayList<Character> myCharList = new ArrayList<>();
        // ArrayList<Boolean> myBooleanList = new ArrayList<>();

        // myList.add("First");
        // myList.add(0,"String");
        // myList.add("third");
        // myList.add("fourth");
        // myIntList.add(7);
        // myIntList.add(10);

        // System.out.println(myList);
        //System.out.println(myFunc(firstNum, secondNum));

        Point<String> strPoint = new Point<>("Anna","Bannana");
        System.out.println(strPoint);

        
        Point<Number> pie = new Point<>(3.14,2.71);
        System.out.println(pie);


    }

    class Point<T> //T represents a placeholder parameter
    {
        private T x, y;
        public Point (T x, T y){
            set(x,y);
        }
        public void set(T x, T y){
            this.x = x;
            this.y = y;
        }
        T getX(){return x;}
        T getY(){return y;}

        public String  toString(){return "(" + x.toString() + "," + y.toString() +")";}
    }

    // public static int myFunc(int f, int s){
    //     return f + s;
    // }
    // Lets make the function generic enough
    // ArrayList Class

    // instead of overloading we use generics in java 
    // generic class or method is one whose definition uses a palce holder
    // for one or more data types.

    // Research sorting algorithms CS50 insertion sorting
    // sorting is very important
    // Insertion, selection, bubble, 
    //T extends Comparable<>


}
