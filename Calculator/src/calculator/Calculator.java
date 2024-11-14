/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner reader =  new Scanner(System.in);
        
        int result1 = -5 + 8 * 6;
        int result2 = (55 + 9) % 9;
        int result3 = 20 + -3 * 5 / 8;
        int result4 = 5 + 15 / 3 * 2 - 8 % 3;
                
        
        
        System.out.println("Here are some Calculation");
        
        
        
                System.out.println("-5 + 8 * 6            :"+result1);
                 System.out.println("(55 + 9) % 9          :"+result2);
                  System.out.println("20 + -3 * 5 / 8       :"+result3);
                   System.out.println("5 + 15 / 3 * 2 - 8 % 3:"+result4);
                 

        
       
        
        
    }
    
}
