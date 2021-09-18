package Week3.Practice;

public class Test {

  // Example 1
  public static void main(String[] args) {
    System.out.println("Sum is " + xMethod(5));
  }

  // Example 1 Methodx
  public static int xMethod(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + xMethod(n - 1);
    }
  }
}

// Example 2
// public class Test {

//   public static void main(String[] args) {
//     xMethod(1234567);
//   }

//   public static void xMethod(int n) {
//     if (n > 0) {
//       System.out.println(n % 10);
//       xMethod(n / 10);
//     }
//   }
// }