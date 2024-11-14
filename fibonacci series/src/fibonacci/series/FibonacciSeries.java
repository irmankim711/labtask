/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci.series;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);
        
        // Command: Enter a positive integer to display Fibonacci series up to that number
        System.out.print("Enter a positive integer to display the Fibonacci series up to that number: ");
        int limit = reader.nextInt();
        
        if (limit < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            System.out.println("Fibonacci series up to " + limit + ":");
            displayFibonacciSeries(limit);
        }

        reader.close(); // Close the scanner resource
    }

    private static void displayFibonacciSeries(int limit) {
        int a = 0, b = 1;
        
        if (limit >= 0) {
            System.out.print(a + " "); // Print the first Fibonacci number
        }
        if (limit >= 1) {
            System.out.print(b + " "); // Print the second Fibonacci number
        }

        int nextTerm;
        while (true) {
            nextTerm = a + b; // Calculate the next term in the series
            if (nextTerm > limit) {
                break; // Stop if the next term exceeds the limit
            }
            System.out.print(nextTerm + " ");
            a = b; // Update a to the last term
            b = nextTerm; // Update b to the new term
        }
        System.out.println(); // New line after the series
    }
    
}
