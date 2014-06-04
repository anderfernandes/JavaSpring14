import java.util.Scanner;

public class MathCalc{
	public static void main (String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("This is a test about functions");
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter a number for a calculation. /n 1 is Multiply /n 2 is divide /n 3 is add /n 4 is subtract");
		int choice = sc.nextInt();
		
		switch (choice){
			case 1 :
				System.out.println("The value of " + num1 + " X " + num2 + " is " + multiply(num1, num2));
				break;
			case 2 :
				System.out.println("The value of " + num1 + " / " + num2 + " is " + divide(num1, num2));
				break;
			case 3 :
				System.out.println("The value of " + num1 + " + " + num2 + " is " + add(num1, num2));
				break;
			case 4 :
				System.out.println("The value of " + num1 + " - " + num2 + " is " + subtract(num1, num2));
				break;
			default:
				System.out.print("Error, Enter a number for a calculation. /n 1 is Multiply /n 2 is divide /n 3 is add /n 4 is subtract");
		}
		//System.out.println("The value of " + num1 + " X " + num2 + " is " + multiply(num1, num2));
		//System.out.println("The value of " + num1 + " / " + num2 + " is " + divide(num1, num2));
		//System.out.println("The value of " + num1 + " + " + num2 + " is " + add(num1, num2));
		//System.out.println("The value of " + num1 + " - " + num2 + " is " + subtract(num1, num2));
	}
	
	public static int multiply(int a, int b){
		int result = (a * b) ;
		return result;	
	}
	public static int divide(int a, int b){
		int result = (a / b) ;
		return result;	
	}
	public static int add(int a, int b){
		int result = (a + b) ;
		return result;	
	}
	public static int subtract(int a, int b){
		int result = (a - b) ;
		return result;	
	}
}