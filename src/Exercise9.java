import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales information
        System.out.print("Enter sales ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter seller's name: ");
        scanner.nextLine(); // Consume newline left-over
        String name = scanner.nextLine();

        System.out.print("Enter sales amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter salary basic: ");
        double salaryBasic = scanner.nextDouble();

        // Calculate commission
        double commission;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.2;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.1;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        // Print the commission
        System.out.println("--- Commission ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Salary Basic: " + salaryBasic);
        System.out.println("Commission: " + commission);
    }
}
