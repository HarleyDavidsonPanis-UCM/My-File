import java.util.Scanner;

public class Panis_gradeBook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int students = 5;
        System.out.print("Enter number of tests: ");
        int tests = input.nextInt();

        int[][] grades = new int[students][tests];

        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        // Input grades
        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter grades for Student " + (i + 1) + ":");
            for (int j = 0; j < tests; j++) {
                System.out.print("  Test " + (j + 1) + ": ");
                grades[i][j] = input.nextInt();

                if (grades[i][j] < lowest) lowest = grades[i][j];
                if (grades[i][j] > highest) highest = grades[i][j];
            }
        }

        System.out.println("\n\t\t=== Gradebook ===");
        System.out.printf("%-10s", "Student");

        for (int j = 0; j < tests; j++) {
            System.out.printf("%12s", "Test " + (j + 1)); 
        }
        System.out.printf("%12s%n", "Average"); 

        //Student Grades
        for (int i = 0; i < students; i++) {
            System.out.printf("%-10s", "Student" + (i + 1));
            int sum = 0;

            for (int j = 0; j < tests; j++) {
                System.out.printf("%12d", grades[i][j]);
                sum += grades[i][j];
            }

            double average = (double) sum / tests;
            System.out.printf("%12.2f%n", average); 
        }
        
        System.out.println("\nLowest Grade in Class: " + lowest);
        System.out.println("Highest Grade in Class: " + highest);

        input.close();
    }
}