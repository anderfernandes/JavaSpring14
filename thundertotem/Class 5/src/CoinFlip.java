import java.util.Scanner;

public class CoinFlip {
	public static void main (String[] Args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("computer flips a coin, guess heads or tails. 0 is heads, 1 is tails. Guess: ");
		int guess = input.nextInt();
		
		int number = (int)(Math.random() * 2);
		
		if (number == guess){
			System.out.print("You guessed: " + guess + " the flip was: " + number + " - You win!");
		}
		if (number != guess){
			System.out.print("You guessed: " + guess + " the flip was: " + number + " - You lose!");
		}
	}
}