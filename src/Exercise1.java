import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Use the ternary operator to determine if the number is odd or even
        String result = (number % 2 == 0) ? "even" : "odd";

        // Print the result
        System.out.println("The number is " + result);
    }
}
