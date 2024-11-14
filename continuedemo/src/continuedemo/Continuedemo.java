/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continuedemo;

/**
 *
 * @author HP
 */
public class Continuedemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String searchMe = "How can a clam cram in a clean cream can?";
int max = searchMe.length();
int numCs = 0;
int numAs = 0;
for(int i = 0;i< max;i++){
    if(searchMe.charAt(i)!='c')
    continue;
    numCs++;}
for(int B = 0;B<max;B++){
    if(searchMe.charAt(B)!='a')
        continue;
    numAs++;
}
System.out.println("found "   +numCs+ "C's and " +numAs+ "A's in the string");}}
