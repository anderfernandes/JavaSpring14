import java.util.Scanner;

public class TestVoidMethod{
	
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first grade: ");
		double grade1 = sc.nextDouble();
		System.out.print("Enter the second grade: ");
		double grade2 = sc.nextDouble();
		
		System.out.print("The grade is ");
		printGrade(grade1);
		
		System.out.print("The grade is ");
		printGrade(grade2);		
	}
	
	public static void printGrade(double score){
		if (score >= 90.00){
			System.out.println("A");
		}
		else if (score >= 80.0){
			System.out.println("B");
		}
		else if (score >= 70.0){
			System.out.println("C");
		}
		else if (score >= 60.0){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}