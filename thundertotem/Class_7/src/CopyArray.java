import java.util.Scanner;

public class CopyArray {
	public static void main (String[] Args){
		final int NUMBER_OF_ELEMENTS = 5;
		int[] numbers = new int[NUMBER_OF_ELEMENTS];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++){
			numbers[i] = (int)(Math.random() * 100);
		}
		/*for (int i = 0; i < numebrs.length; i++){
			System.out.print("");
		}*/
		
		
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