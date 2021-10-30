package Week07.Submit;

public class MyNumber {
    // private variable
    private int number;

    // Constructors inits variable
    public MyNumber() {
        number = 0;
    }

    public MyNumber(int n) {
        number = n;
    }

    // Setter
    // return n if n is 2 or greater.
    public int setValid(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Number must be greater or equal to 2");
        } else {
            return n;
        }

    }

    // getters
    public int getMyNumber() {
        return number;
    }

}
