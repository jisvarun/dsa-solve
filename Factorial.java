
import java.util.Scanner;

public class Factorial{
  public static int fact(int n){
    if(n == 0)
      return 1;

    return n * fact(n-1);
  }

  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Enter a number: ");
      int n = myObj.nextInt();
      System.out.println("Factorial of " + n + ": " + fact(n));
    }
  }
}