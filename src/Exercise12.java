import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input the operation symbol
        System.out.print("Enter symbol (+, -, *, /): ");
        String symbol = scanner.next();

        // Perform the corresponding operation
        double result;
        if (symbol.equals("+")) {
            result = num1 + num2;
        } else if (symbol.equals("-")) {
            result = num1 - num2;
        } else if (symbol.equals("*")) {
            result = num1 * num2;
        } else if (symbol.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("Invalid symbol");
            return;
        }

        // Print the result
        System.out.println("Result: " + result);
    }
}
