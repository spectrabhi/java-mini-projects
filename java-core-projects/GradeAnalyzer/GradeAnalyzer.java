import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String[] names = new  String[5];
        int[] marks = new int[5];

        // Input names and marks
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        // Display and Analyze

        displayAll(names, marks);
        findTopper(names, marks);
        calculateAverage(marks);

        scanner.close();
    }

    public static void displayAll(String[] names, int[] marks) {
        System.out.println("\nStudent Marks:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + marks[i]);
        }
    }

    public static void findTopper(String[] names, int[] marks) {
        int max = marks[0];
        String topper = names[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                topper = names[i];
            }
        }

        System.out.println("\nTopper: " + topper + " with marks: " + max);
    }

    public static void calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;

        System.out.printf("\nAverage Marks: %.2f%n", average);
    }   

}
