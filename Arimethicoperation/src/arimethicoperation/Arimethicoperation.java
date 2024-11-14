/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arimethicoperation;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Arimethicoperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        int num1, num2, pilih;
        int result;
        int sum = 0;//initialize value
        int diff = 0;
        int multi = 0;
        int div = 0;
      
        
        System.out.println("Enter num 1: ");
        num1 = reader.nextInt();
        
        System.out.println("enter num 2: ");
        num2 = reader.nextInt();
        
        System.out.println("Choose the arithemathic progression");
        System.out.println("1.Addition");
        System.out.println("2.substraction");
        System.out.println("3.mutiplication");
        System.out.println("4.division");
        
        
        System.out.println("Enter the Choice 1-4");
        pilih = reader.nextInt();
        
        
       
       
                switch (pilih){
                    case 1: 
                         sum = num1 + num2;
                    System.out.println("result :"+sum);;
                    break;
                     case 2: 
                         diff = num1 - num2;
                    System.out.println("result :"+diff);
                    break;
                    case 3: 
                        multi = num1 * num2;
                    System.out.println("result :"+multi);
                    break;
                    case 4: 
                        div = num1 / num2;
                    System.out.println("result :"+div);
                    break;
                    
                }



        
    }
    
}
