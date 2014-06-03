import java.util.Scanner;

public class EvilMath{
	public static void main (String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("The value of " + num1 + " X " + num2 + " is " + multiply(num1, num2));
		System.out.println("The value of " + num1 + " / " + num2 + " is " + divide(num1, num2));
		System.out.println("The value of " + num1 + " + " + num2 + " is " + add(num1, num2));
		System.out.println("The value of " + num1 + " - " + num2 + " is " + subtract(num1, num2));
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