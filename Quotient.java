package chapter12;

import java.util.Scanner; 

public class Quotient {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    if (number2 != 0)
      System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
    else
      System.out.println("Divisor cannot be 0");
    int result = quotient(number1, number2);
    System.out.println("Value of quotient is " + result);

  }

  public static int quotient(int number1, int number2){
    if (number2 == 0){
      System.out.println("Divisor cannot be 0.");
      System.exit(1);
    }
    return (number1 / number2);
  }
}
