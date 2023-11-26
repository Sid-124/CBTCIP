// Importing the required packages and libraries.
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Initializing variables
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 5;
        int score = 0;

        do {
            // The system generates a random number from 1 to 100.
            int guessNumber = random.nextInt(100) + 1;
            System.out.println("Guess the number between 1 and 100: ");

            // User input is taken
            int attempts = 0;
            while (attempts < maxAttempts) {
                int userGuess = scanner.nextInt();

                // Conditional statements for further input
                if (userGuess == guessNumber) {
                    System.out.println("Congratulations! You guessed the correct number!!");
                    score += (maxAttempts - attempts); // Award points based on remaining attempts
                    break;
                } else if (userGuess > guessNumber) {
                    System.out.println("You guessed too high! Try again.");
                } else {
                    System.out.println("You guessed too low! Try again.");
                }

                attempts++;
            }

            // Display the correct number if the user couldn't guess it
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number is: " + guessNumber);
            }

            // Ask if the user wants another chance
            System.out.println("Your current score: " + score);
            System.out.println("Do you want another chance? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Game Over. Your final score: " + score);
    }
}
