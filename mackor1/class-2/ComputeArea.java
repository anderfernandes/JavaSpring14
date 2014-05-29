import java.util.Scanner; // Scanner is in the java.util package
public class ComputeArea {
		public static void main (String[] args) {
				// Create a Scanner object
				@SuppressWarnings("resource")
				Scanner input = new Scanner (System.in);
				final double PI = 3.14159;
				//Prompt the user to enter a radius
				System.out.print("Enter a number for radius: ");
		// 		step 1: read in radius
		double radius = input.nextDouble();
				// Step 2: Compute Area
		double area = radius * radius * PI;
		//Step 3: Display the area
		System.out.println("The area for circle of radius " + radius + " is " + area);
		
		
	}
}
