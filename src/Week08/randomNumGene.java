package Week08;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class randomNumGene {
    
    public static void main(String[] args) {
    int min = 0;
    int max = 1000;
    
    // Initialize array list for integers
    List<Integer> myintlist = new ArrayList<Integer>();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    
    for (int i = 0; i < max; i++) {
        // Generate a random integer between 0 and 1000, 100 times and add to list
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        // add random number to list
        myintlist.add(randomNum);
        //System.out.println(randomNum);
    }
    // print list of numbers
    System.out.println(myintlist);




    }
    
}
