import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store student grades
        ArrayList<Integer> grades = new ArrayList<>();
        
        // Input grades
        System.out.println("Enter student grades. Type -1 to finish:");
        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;  // Exit the loop when -1 is entered
            }
            grades.add(grade);  // Add the grade to the list
        }
        
        // Calculate average, highest, and lowest grades
        if (!grades.isEmpty()) {
            int total = 0;
            int highest = grades.get(0);
            int lowest = grades.get(0);
            
            for (int grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }
            
            double average = total / (double) grades.size();
            
            // Output results
            System.out.println("Average grade: " + average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        } else {
            System.out.println("No grades were entered.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
