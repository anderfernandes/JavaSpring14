import java.util.Scanner;

public class ComputeAverage
{
   public static void main(String[] args)
   {
      // Create Scanner object
	   Scanner input = new Scanner(System.in);
      
	   // Step 1: Get the values from the user
	   System.out.print("Enter the first number: ");
	   double number1 = input.nextDouble();
	   
	   System.out.print("Enter the second number: ");
	   double number2 = input.nextDouble();
	   
	   System.out.print("Enter the third number: ");
	   double number3 = input.nextDouble();
	   
	   // Step 2: Calculate result
	   double average = ((number1 + number2 + number3) / 3);
	   
	   // Step 3: Output result
	   System.out.println("The average is: " + average);
   } // close main
} // close average
