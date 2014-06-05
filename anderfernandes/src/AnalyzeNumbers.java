import java.util.Scanner;
import java.util.Arrays;

public class AnalyzeNumbers {

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println("");
	}
	
	public static int[] addOneToArray(int[] array) {
		int[] addedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			addedArray[i] =  array[i] + 1;
		}
		System.out.println("");
		
		return addedArray;
	}

	
	
	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS = 5;
		int[] numbers = new int[NUMBER_OF_ELEMENTS];
		int[] copyNumbers = new int[numbers.length];
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100);
			}

		
		Scanner input = new Scanner(System.in);
			
		for (int i = 0; i < numbers.length; i++) {
			//System.out.print("Enter a number: ");
			//numbers[i] = input.nextDouble();
			System.out.println("Item index " + i + 
					" and of position " + (i+1) + 
					" in the array is " + numbers[i]);
			sum += numbers[i];
		}
		
		System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);
		
		printArray(numbers);
		printArray(copyNumbers);
		
		
		
		
		int[] addedArray = addOneToArray(numbers);
		
		printArray(addedArray);
		
		double average = sum / numbers.length; 
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i]> average)
				count++;
		
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);
	}

}
