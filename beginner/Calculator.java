import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean shouldExit = false;

    while (!shouldExit) {
      try {
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
          case '+':
            result = num1 + num2;
            break;

          case '-':
            result = num1 - num2;
            break;

          case '*':
            result = num1 * num2;
            break;

          case '/':
            result = num1 / num2;
            break;

          default:
            System.out.println("Invalid operator!");
            continue;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
      } catch (Exception e) {
        System.out.println("Invalid input!");
        input.nextLine(); // clear the input buffer
      }

      System.out.print("Do you want to perform another calculation? (Y/N): ");
      String choice = input.next().toUpperCase();

      if (choice.equals("N")) {
        shouldExit = true;
      }
    }

    input.close();
  }
}
