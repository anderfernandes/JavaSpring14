import java.util.Scanner;

public class integer {
	public static void main (String[] Args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Pick a number between 0 and a 1000: ");
		int number = input.nextInt();
		
		int lastDigit = (number % 10);
		int remainingNumber = (number / 10);
		int secondLastDigit = (remainingNumber % 10);
		remainingNumber = (remainingNumber /10);
		int thirdLastDigit = (remainingNumber %10);
		
		int finalNumber = (lastDigit + secondLastDigit + thirdLastDigit);
		
		System.out.print("the sum of "+ number + " is: " + finalNumber);
		
		}
}