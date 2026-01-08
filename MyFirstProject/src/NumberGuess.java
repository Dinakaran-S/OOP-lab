import java.util.Scanner;
import java.util.Random;

class NumberGuess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int min = 1;
        int max = 100;

        int secretNumber = rand.nextInt(min,max+1); // 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between (%d-%d) \n",min,max);

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High!");
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct! 🎉");
                System.out.println("Attempts: " + attempts);
            }

        } while (guess != secretNumber);
    }
}
