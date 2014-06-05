import java.util.Scanner;

public class AnalizeNumbersTwo {
	public static void main (String[] Args){
		final int NUMBER_OF_ELEMENTS = 5;
		double[] numbers = new double[NUMBER_OF_ELEMENTS];
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++){
			//System.out.print("Enter a number: ");
			//numbers[i] = sc.nextDouble();
			//System.out.println(numbers[i]);
			//sum += numbers[i];
			numbers[i] = (double)(Math.random() * 100);
		}
		
		
		double average = sum / NUMBER_OF_ELEMENTS;
		
		int count = 0;
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++ ){
			if (numbers[i] > average)
				count++;
		}
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average " + count);
	}
}