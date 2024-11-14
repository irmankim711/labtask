/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenanddodd;

/**
 *
 * @author HP
 */
import javax.swing.JOptionPane;

public class Evenanddodd {

    public static void main(String[] args) {
        int random_number = 4; // Step 3a: Assign random_number to 4
        int attempts = 0;
        boolean guessedCorrectly = false;

        // Step 3b: Implement a do-while loop
        do {
            // Step 2a: Allow user to insert the number using a dialog box
            String input = JOptionPane.showInputDialog(null, "Guess the number (between 1 and 10):");

            // Step 2b: Convert the input to an integer
            int userGuess = Integer.parseInt(input);

            attempts++;

            // Step 3b1: Check if the user's guess is correct
            if (userGuess == random_number) {
                guessedCorrectly = true;
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number.");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect guess, try again.");
            }
        } while (attempts < 10 && !guessedCorrectly); // Step 3b2: Continue until guessed correctly or 10 attempts

        if (!guessedCorrectly) {
            JOptionPane.showMessageDialog(null, "Sorry, you've used all attempts. The correct number was " + random_number + ".");
        }
    }
}

