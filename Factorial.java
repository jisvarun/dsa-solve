
import java.util.Scanner;

public class Factorial{
  public static int fact(int n){
    if(n == 0)
      return 1;

    return n * fact(n-1);
  }

  public static void main(String[] args) {
    int n;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = myObj.nextInt();
    System.out.println("Factorial of 5: " + fact(n));
  }
}