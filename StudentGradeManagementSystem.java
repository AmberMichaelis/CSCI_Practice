import java.util.Scanner;

public class StudentGradeManagementSystem {
    // Variables to Store Student Information
    private static String studentName;
    private static double grade1, grade2, grade3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // This Becomes False When The User Chooses To Exit The Program

        // Main Menu Loop
        while (running) {
            System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Details");
            System.out.println("3. View Average Grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;

            // Validate Selection Choice
            try {
                choice = Integer.parseInt(scanner.nextLine()); // Will Throw NumberFormatException Error For Non-Integer
                                                               // Input
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }

            // Menu Options Selection
            switch (choice) {
                case 1:
                    addStudent(scanner); // Accepts An Input Parameter (Name)
                    break;
                case 2:
                    viewStudentDetails();
                    break;
                case 3:
                    viewAverageGrade();
                    break;
                case 4:
                    running = false; // Exit the program
                    System.out.println("Exiting the program.");
                    break;
                default: // If An Invalid Option Is Selected
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }

        scanner.close();
    }

    // Add A Student
    private static void addStudent(Scanner scanner) {
        // Validate Student Name Input
        while (true) {
            System.out.print("Enter student's name: ");
            studentName = scanner.nextLine().trim(); // Trim To Remove Any Leading Or Trailing Whitespace
            if (studentName.isBlank()) {
                System.out.println("Invalid input. Student name cannot be empty. Please try again.");
            } else {
                break; // Valid Name, Exit Loop
            }
        }

        // getGradeInput Is Used To Validate Grade Value Input
        grade1 = getGradeInput(scanner, "Enter grade for subject 1: ");
        grade2 = getGradeInput(scanner, "Enter grade for subject 2: ");
        grade3 = getGradeInput(scanner, "Enter grade for subject 3: ");

        System.out.println("Student information added successfully.");
    }

    // Get Grade Input
    private static double getGradeInput(Scanner scanner, String prompt) {
        double grade;
        while (true) {
            System.out.print(prompt);

            // Validate Grade Input Value
            try {
                grade = Double.parseDouble(scanner.nextLine()); // Will Throw NumberFormatException Error For Non-Double
                                                                // Input
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Please enter a number between 0 and 100."); // Error Handling For
                                                                                                   // Out-Of-Range Grade
                                                                                                   // Value
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return grade;
    }

    // Function To View Student Details
    private static void viewStudentDetails() {
        // Validate that Student Name Exists
        if (studentName == null || studentName.isBlank()) {
            System.out.println("No student information available. Please add a student first.");
            return;
        }

        // Print Student Name and Grades
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
    }

    // Function To Calculate And View Average Grade
    private static void viewAverageGrade() {
        // Validate that Student Name Exists
        if (studentName == null || studentName.isBlank()) {
            System.out.println("No student information available. Please add a student first.");
            return;
        }

        // Calculate and Print Average Grade
        double averageGrade = (grade1 + grade2 + grade3) / 3;
        System.out.printf("Average Grade: %.2f%n", averageGrade); // Format To 2 Decimal Places
    }
}
