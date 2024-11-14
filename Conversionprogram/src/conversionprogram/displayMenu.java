/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionprogram;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class displayMenu {
    public static void displayMenu() {
        System.out.println("\nUnit Conversion Menu:");
        System.out.println("1. Temperature (Celsius to Fahrenheit)");
        System.out.println("2. Temperature (Fahrenheit to Celsius)");
        System.out.println("3. Distance (Kilometers to Miles)");
        System.out.println("4. Distance (Miles to Kilometers)");
        System.out.println("5. Length (Meters to Feet)");
        System.out.println("6. Length (Feet to Meters)");
        System.out.println("7. Memory (Gigabytes to Megabytes)");
        System.out.println("8. Memory (Megabytes to Gigabytes)");
        System.out.println("9. Weight (Kilograms to Pounds)");
        System.out.println("10. Weight (Pounds to Kilograms)");
        System.out.println("11. Exit");
    }

    public static void run() {
        Scanner reader = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-11): ");
            int choice = reader.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = reader.nextDouble();
                    System.out.printf("%.2f°C = %.2f°F%n", celsius, Conversionprogram.celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = reader.nextDouble();
                    System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, Conversionprogram.fahrenheitToCelsius(fahrenheit));
                    break;
                case 3:
                    System.out.print("Enter distance in kilometers: ");
                    double kilometers = reader.nextDouble();
                    System.out.printf("%.2f km = %.2f miles%n", kilometers, Conversionprogram.kilometersToMiles(kilometers));
                    break;
                case 4:
                    System.out.print("Enter distance in miles: ");
                    double miles = reader.nextDouble();
                    System.out.printf("%.2f miles = %.2f km%n", miles, Conversionprogram.milesToKilometers(miles));
                    break;
                case 5:
                    System.out.print("Enter length in meters: ");
                    double meters = reader.nextDouble();
                    System.out.printf("%.2f m = %.2f feet%n", meters, Conversionprogram.metersToFeet(meters));
                    break;
                case 6:
                    System.out.print("Enter length in feet: ");
                    double feet = reader.nextDouble();
                    System.out.printf("%.2f feet = %.2f m%n", feet, Conversionprogram.feetToMeters(feet));
                    break;
                case 7:
                    System.out.print("Enter memory in gigabytes: ");
                    double gigabytes = reader.nextDouble();
                    System.out.printf("%.2f GB = %.2f MB%n", gigabytes, Conversionprogram.gigabytesToMegabytes(gigabytes));
                    break;
                case 8:
                    System.out.print("Enter memory in megabytes: ");
                    double megabytes = reader.nextDouble();
                    System.out.printf("%.2f MB = %.2f GB%n", megabytes, Conversionprogram.megabytesToGigabytes(megabytes));
                    break;
                case 9:
                    System.out.print("Enter weight in kilograms: ");
                    double kilograms = reader.nextDouble();
                    System.out.printf("%.2f kg = %.2f lbs%n", kilograms, Conversionprogram.kilogramsToPounds(kilograms));
                    break;
                case 10:
                    System.out.print("Enter weight in pounds: ");
                    double pounds = reader.nextDouble();
                    System.out.printf("%.2f lbs = %.2f kg%n", pounds, Conversionprogram.poundsToKilograms(pounds));
                    break;
                case 11:
                    System.out.println("Exiting the program.");
                    reader.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}

