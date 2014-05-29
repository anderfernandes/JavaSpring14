import java.util.Scanner;

public class SubtractionQuiz {
	public static void main (String[] args) {
		// 1. Generate two random single-digit integers
		int number1 = number1 = (int)(Math.random() * 10);
		int number2 = number2 = (int)(Math.random() * 10);
		
		// 2. If ymber 1 < nuber2, swap nubmer1 with number2
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		//3. Prompt the student to answ3er "What is number1 - number2?"
		System.out.print
		("What is " + number1 + " -" + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		//4. Grade the answer and display the result
		if (number1 - number2 == answer)
			System.out.println("Your are correct!");
		else
			System.out.println("Your answer is wrong\n" + number1 + " - " + number2 + " is " + (number1 - number2));
		;
		}
	}
