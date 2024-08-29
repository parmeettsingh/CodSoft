import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Random object to generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        int guess = 0;
        int attempts = 0;
        boolean correctGuess = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        
        // Loop until the user guesses the correct number
        while (!correctGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                correctGuess = true;
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}