/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakexample;

/**
 *
 * @author HP
 */
public class Breakexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Numbrts 1-10");
        for(int i = 1;i<=10;i++){
            if(i == 5)
                break;//break loop when i is 5
            System.out.println(i+ "\t");}
        int i =0;
        System.out.println("Broke out of loop at i ="+i);}}
