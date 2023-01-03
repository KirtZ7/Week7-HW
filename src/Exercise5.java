import java.util.Scanner;


// Not finished fully. Formatting + different classes to do


public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();

        // Input marks for each subject
        System.out.print("Enter marks for Math: ");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter marks for Science: ");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter marks for English: ");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;

        // Determine if the student passed or failed
        String result;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        // Determine the grade
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "";
        }

        // Print the mark sheet
        System.out.println("--- Mark Sheet ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Math: " + mathMarks);
        System.out.println("Science: " + scienceMarks);
        System.out.println("English: " + englishMarks);
        System.out.println("Total: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
        if (grade.length() > 0) {
            System.out.println("Grade: " + grade);
        }
    }
}
