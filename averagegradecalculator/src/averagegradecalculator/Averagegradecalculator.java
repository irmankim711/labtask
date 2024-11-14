/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averagegradecalculator;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Averagegradecalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);

        // Create an array to hold student objects
        Student[] students = new Student[3];

        // Input data for three students
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = reader.nextLine();

            System.out.print("Enter marks for " + name + " (three marks separated by space): ");
            double mark1 = reader.nextDouble();
            double mark2 = reader.nextDouble();
            double mark3 = reader.nextDouble();
            reader.nextLine(); // consume the newline character

            students[i] = new Student(name, mark1, mark2, mark3);
        }

        // Calculate averages and find the highest average
        double highestAverage = 0;
        String highestStudent = "";

        System.out.println("\nAverage Marks:");
        for (Student student : students) {
            double average = student.calculateAverage();
            System.out.printf("%s: Average = %.2f%n", student.getName(), average);

            // Check for the highest average
            if (average > highestAverage) {
                highestAverage = average;
                highestStudent = student.getName();
            }
        }

        // Display the highest average
        System.out.printf("\nThe highest average is %.2f by %s.%n", highestAverage, highestStudent);

        reader.close();
    }
}
    
 

