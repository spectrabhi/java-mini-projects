import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {

	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int secretNumber = random.nextInt(100) + 1; // random Number between 1 to 100
		int guess;
		int attempts = 0;

		System.out.println(" Welcome to Number Guesser Game");
		System.out.println(" Guess a number between 1 and 100 ");

		while ( true ) {
			System.out.println(" Enter Your guess: ");
			guess = scanner.nextInt();
			attempts++;

			if ( guess == secretNumber ) {
				System.out.println(" Correct! You guesed it in " + attempts + "attempts." );
				break;
			} else if (guess < secretNumber) {
				System.out.println("Too Low ");
			} else {
				System.out.println(" Too High ");
			}
		}
		scanner.close();

	}
}
