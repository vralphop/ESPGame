/*
 * Class: CMSC203 20984
 * Instructor: Ahmed Tarek
 * Description: An ESP (extrasensory perception) game that generates colors from a predefined list and lets the user guess the selected color.
 * Due: 09/11/2023
 * Platform/compiler: Eclipse for IDE and compilier is Java Development Kit
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: ____Valerie Ralph-Opara______
*/

package javac;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Describe yourself: ");
        String userDescription = scanner.nextLine();
        String dueDate = "09/11/2023";
        System.out.println("Due Date: " + dueDate);
        System.out.println("CMSC203 Assignment1: Test your ESP skills!\n");

        int correctGuesses = 0;

        for (int round = 1; round <= 10; round++) {
            int randomColorIndex = random.nextInt(7);
            String correctGuessColor;

            switch (randomColorIndex) {
                case 0:
                    correctGuessColor = "Red";
                    break;
                case 1:
                    correctGuessColor = "Orange";
                    break;
                case 2:
                    correctGuessColor = "Yellow";
                    break;
                case 3:
                    correctGuessColor = "Green";
                    break;
                case 4:
                    correctGuessColor = "Blue";
                    break;
                case 5:
                    correctGuessColor = "Black";
                    break;
                case 6:
                    correctGuessColor = "White";
                    break;
                default:
                    correctGuessColor = "Invalid";
                    break;
            }

            System.out.println("Round " + round);
            System.out.println("\nI am thinking of a color.");
            System.out.print("Is it Red, Orange, Yellow, Green, Blue, Black, or White?\n");
            System.out.print("Enter your guess: ");

            String userGuess = scanner.nextLine();

            if (isValidColor(userGuess)) {
                if (correctGuessColor.equalsIgnoreCase(userGuess)) {
                    System.out.println("I was thinking of " + correctGuessColor + ".\n");
                    correctGuesses++;
                } else {
                    
                    System.out.println("I was thinking of " + correctGuessColor + ".\n");
                }
            } else {
                System.out.print("You entered an incorrect color. Is it Red, Orange, Yellow, Green, Blue, Black, or White? ");
                System.out.print("\nEnter your guess again: ");
                userGuess = scanner.nextLine();
                System.out.println("I was thinking of " + correctGuessColor + ".\n");
            }
        }

        System.out.println("Game Over\n");
        System.out.println("You guessed " + correctGuesses + " out of 10 colors correctly.");
        System.out.println("User Name: " + userName);
        System.out.println("User Description: " + userDescription);
        System.out.println("Due Date: " + dueDate);
    }

    private static boolean isValidColor(String color) {
        return color.equalsIgnoreCase("Red")
                || color.equalsIgnoreCase("Orange")
                || color.equalsIgnoreCase("Yellow")
                || color.equalsIgnoreCase("Green")
                || color.equalsIgnoreCase("Blue")
                || color.equalsIgnoreCase("Black")
                || color.equalsIgnoreCase("White");
    }
}
