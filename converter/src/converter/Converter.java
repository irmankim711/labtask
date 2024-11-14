/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converter;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner reader = new Scanner(System.in);
     double currency;
     double conversionRate;
     double pound;
     double mass;
     double distance;
     double meter;
     int choose;
     
     
     
     
     
     System.out.println("Converter available :");
     System.out.println("1. Currency (MYR - YEN)");
     System.out.println("2. mass (Kg - Pound)");
     System.out.println("3. Distance (km - m)");
     
     
     
     System.out.println("Choose Your converter");
     choose = reader.nextInt();
     
    
     
   

     
     
     switch(choose){
         
         
         
        case 1:
        System.out.print("Insert amount/quantity: ");
                currency = reader.nextDouble();
                conversionRate = 32.3588f; // 1 MYR = 32.3588 JPY
                System.out.print("RM"+currency + " is equal to = "    + (currency * conversionRate) + " JPY");
                
                break;
        case 2:
            System.out.print("Insert amount/quantity:");
            mass = reader.nextDouble();
            pound = 2.20462f;
            System.out.println(mass+"Kg is equal to = " +(mass * pound)+ "pound");
           break;
        
        case 3 :
            System.out.print("Insert amount/quantity:");
            distance = reader.nextDouble();
            meter = 1000;
            System.out.println(distance+"km is equal to = "+(distance * meter)+ "meter");
            break;
            
       
            
                
                
                
                
                
        
    }
     
     
        
        
        
        
    }
    
}
