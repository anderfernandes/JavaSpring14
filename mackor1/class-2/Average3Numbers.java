import java.util.Scanner; // Scanner is in the java.util package
public class Average3Numbers {
		public static void main (String[] args) {
				// Create a Scanner object
				@SuppressWarnings("resource")
				Scanner input = new Scanner (System.in);
		//Prompt the user to enter 1st number
				System.out.print("Enter the number1: ");
		// 		step 1: read in number1
		double number1 = input.nextDouble();
				
				
		//Prompt the user to enter 2nd number
				System.out.print("Enter the number2: ");
		// 		step 1: read in number2
		double number2 = input.nextDouble();		
				
				
	//Prompt the user to enter 1st number
				System.out.print("Enter the number3: ");
		// 		step 1: read in number3
		double number3 = input.nextDouble();			
				
				// Step 2: Compute average
		double average = (number1 + number2 +number3)/3;
		//Step 3: Display the average
		System.out.println("The average is:" + average);
		} // close main
		
} // close class average

		
		