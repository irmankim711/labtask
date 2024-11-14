/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionprogram;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Conversionprogram {

    /**
     * @param args the command line arguments
     */
  
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Distance conversions
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double milesToKilometers(double miles) {
        return miles / 0.621371;
    }

    // Length conversions
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double feetToMeters(double feet) {
        return feet / 3.28084;
    }

    // Memory conversions
    public static double gigabytesToMegabytes(double gigabytes) {
        return gigabytes * 1024;
    }

    public static double megabytesToGigabytes(double megabytes) {
        return megabytes / 1024;
    }

    // Weight conversions
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }
}

    
      
        
        
    
    

