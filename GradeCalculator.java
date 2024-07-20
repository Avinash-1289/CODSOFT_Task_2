import java.util.Scanner;

public class GradeCalculator {

    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter the name of subject " + i + ": ");
            String subjectName = scanner.next();

            System.out.print("Enter the marks obtained in " + subjectName + " (out of 100): ");
            int marks = scanner.nextInt();

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numberOfSubjects;

        char grade = calculateGrade(averagePercentage);

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f %% \n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
