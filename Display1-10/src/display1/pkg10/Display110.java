/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package display1.pkg10;

/**
 *
 * @author HP
 */
public class Display110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int even=0;
        int odd=0;
        
        
        
        System.out.println("Even integer from 1-10");
        for(int i =1; i<=10; i++){
            if(i%2 == 0){//print nombor yang tiada 0 jika dibahagi 2
                System.out.println(i+"");
                even += i;
            }
           
        }
          System.out.println("print sum of even integer " +even);
      System.out.println("odd integer from 1-10");
      for(int i = 1; i<=10; i++){
          if(i % 2!=0){//print nombor yang ada baki jika dibahgi dua
              System.out.println(i+"");
              odd+=i;
              
          }
      }
      
     
      System.out.println("print sum of odd integer " +odd);
              
    }
    
    
}

