
import java.util.Scanner;

// Sum of Natural Numbers (n=3)
// The sum of first 3 natural numbers is 1+2+3 = 6

public class Main{

  public static int sum(int n){
    if(n == 1)
      return 1;

    return n + sum(n-1);
  }
  public static void main(String[] args)
  {
    int n;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = myObj.nextInt();
    System.out.println("Sum of natural number: " + sum(n));
    myObj.close(); 
  }
}