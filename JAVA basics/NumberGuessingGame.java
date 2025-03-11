import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1; // Random number between 1 and 100
        Scanner sc = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between 1 and 100!");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it right.");
                break;
            }
        }
        
        sc.close();
    }
}
