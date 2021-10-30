package Week07;

import java.util.Scanner;

public class charCounter {

    public static int findMe(String s, char c) {
        int count = 0;
        if (s.charAt(0) == c) {
            count++;

        }
        if (s.length() > 1) {
            count += findMe(s.substring(1), c);
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Look at me Bro!";
        char c = 'o';

        System.out.println(findMe(s, c));

    }

}
