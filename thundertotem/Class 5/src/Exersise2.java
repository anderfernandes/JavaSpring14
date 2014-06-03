import java.util.Scanner;

public class Exersise2 {
	public static void main (String[] Args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Pick a number between 0 and a 1000: ");
		int number = input.nextInt();
		if (number <= 0 && number >=1000){
			System.out.print("Please enter an number between 0 and a 1000, try again");
		}
			
			int ones = (number % 10);
		int remainingNumber = (number / 10);
		int tens = (remainingNumber % 10);
		remainingNumber = (remainingNumber /10);
		int hundreds = (remainingNumber %10);
		
		int finalNumber = (ones + tens + hundreds);
		
		System.out.print("the sum of "+ number + " is: " + finalNumber);
		
		}
}