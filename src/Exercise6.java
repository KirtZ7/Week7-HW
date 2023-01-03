import java.util.Scanner;

// Not finished fully. Formatting + different classes to do
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee information
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter employee name: ");
        scanner.nextLine(); // Consume newline left-over
        String name = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate HRA, DA, TA, and PF
        double hra = basicSalary * 0.1;
        double da = basicSalary * 0.08;
        double ta = basicSalary * 0.09;
        double pf = basicSalary * 0.2;

        // Calculate gross salary
        double grossSalary = basicSalary + hra + da + ta - pf;

        // Print the salary details
        System.out.println("--- Salary Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("TA: " + ta);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
