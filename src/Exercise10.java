import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a letter
        System.out.print("Enter a letter from A to F: ");
        String letter = scanner.nextLine();

        // Print the corresponding city name
        if (letter.equals("A")) {
            System.out.println("City: Atlanta");
        } else if (letter.equals("B")) {
            System.out.println("City: Boston");
        } else if (letter.equals("C")) {
            System.out.println("City: Chicago");
        } else if (letter.equals("D")) {
            System.out.println("City: Denver");
        } else if (letter.equals("E")) {
            System.out.println("City: Edmonton");
        } else if (letter.equals("F")) {
            System.out.println("City: Fresno");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
