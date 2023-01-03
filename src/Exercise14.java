import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a value
        System.out.print("Enter a value: ");
        String value = scanner.nextLine();

        // Determine if the value is a number, alphabet, or symbol
        if (isNumeric(value)) {
            System.out.println("The value is a number.");
        } else if (isAlphabet(value)) {
            System.out.println("The value is an alphabet.");
        } else {
            System.out.println("The value is a symbol.");
        }
    }

    // Returns true if the value is a number
    public static boolean isNumeric(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Returns true if the value is an alphabet
    public static boolean isAlphabet(String value) {
        return value.length() == 1 && Character.isLetter(value.charAt(0));
    }
}
