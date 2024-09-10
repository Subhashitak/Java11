import java.util.Scanner;

public class StudentGradeManagementSystem {
    // StudentGrade class to manage the student's grade
    public static class StudentGrade {
        private int grade; // Private attribute for the student's grade

        // Constructor to initialize the grade
        public StudentGrade() {
            this.grade = 0; // Default grade
        }

        // Method to set the grade with validation
        public void setGrade(int grade) {
            if (grade >= 0 && grade <= 100) {
                this.grade = grade;
                System.out.println("Grade set to: " + grade);
            } else {
                System.out.println("Error: Grade must be between 0 and 100.");
            }
        }

        // Method to get the current grade
        public int getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrade student = new StudentGrade(); // Create a StudentGrade object

        while (true) {
            System.out.println("\nStudent Grade Management");
            System.out.println("1. Set Grade");
            System.out.println("2. Get Grade");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Set Grade
                    System.out.print("Enter the grade to set (0-100): ");
                    int grade = scanner.nextInt();
                    student.setGrade(grade);
                    break;

                case 2:
                    // Get Grade
                    System.out.println("Current Grade: " + student.getGrade());
                    break;

                case 3:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
