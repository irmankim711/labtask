/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountrste;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Discountrste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner reader = new Scanner(System.in);
    
    
    
    String itemname;
    int quantity;
    int pilih;
    float price;
    float discountrated = 0;
    
    
    System.out.println("display item name: ");
    itemname = reader.nextLine();
    System.out.println("Enter price per item: ");
    price = reader.nextInt();
    System.out.print("Enter Quantitiy: ");
    quantity = reader.nextInt();
    
    System.out.println("Choose The colour code discount");
    System.out.println("1.Grey");
    System.out.println("2.Indigo");
    System.out.println("3.Purple");
    System.out.println("4.cyan");
    
    System.out.println("Choose (1-4)");
    pilih = reader.nextInt();
    
    switch(pilih){
        case 1 :
         discountrated = 0.10f;
         break;
        
        case 2 :
            discountrated = 0.25f;
            break;
            
        case 3 :
            discountrated = 0.30f;
            
        case 4 :
            discountrated = 0.45f;
            break;
         
    }

        float totalPrice = price * quantity;
        float discountprice = totalPrice * (1 - discountrated);

        
        System.out.println("\nItem Name: " + itemname);
        System.out.println("Price per Item: rm" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: rm" + totalPrice);
        System.out.println("Discount Rate: " + (discountrated * 100) + "%");
        System.out.println("Price After Discount: rm" + discountprice);



   
    
    }
    
    
}
