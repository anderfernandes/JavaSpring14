import java.util.Scanner;

public class EvilMathTwo{
	public static void main (String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true){
			System.out.print("Choose a calculation: 1 is multiply, 2 is divide, 3 is addition, 4 is subtraction, 0 to quit");
			int choice = sc.nextInt();
			
			System.out.print("Enter number 1: ");
			int num1 = sc.nextInt();
			System.out.print("Enter Number 2: ");
			int num2 = sc.nextInt();
			
			if (choice == 1)
				System.out.println("The value of " + num1 + " X " + num2 + " is " + multiply(num1, num2));
			else if (choice == 2)
				System.out.println("The value of " + num1 + " / " + num2 + " is " + divide(num1, num2));
			else if (choice == 3)
				System.out.println("The value of " + num1 + " + " + num2 + " is " + add(num1, num2));
			else if (choice == 4)
				System.out.println("The value of " + num1 + " - " + num2 + " is " + subtract(num1, num2));
			else
				System.out.print("Quitting...");
				break;
		}
	}
	
	public static int multiply(int i1, int i2){
		int result = (i1 * i2) ;
		return result;	
	}
	public static int divide(int i1, int i2){
		int result = (i1 / i2) ;
		return result;	
	}
	public static int add(int i1, int i2){
		int result = (i1 + i2) ;
		return result;	
	}
	public static int subtract(int i1, int i2){
		int result = (i1 - i2) ;
		return result;	
	}
}