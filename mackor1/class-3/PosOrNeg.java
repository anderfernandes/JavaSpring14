import java.util.Scanner;

public class PosOrNeg {
public static void main (String[] args) {
	
Scanner input = new Scanner(System.in);

System.out.println("Enter your number:");

int number = input.nextInt();

if (number < 0){
System.out.println(number + " is negative.");
else if (number == 0) {
	System.out.println.(number + " is zero.");
	
}
}
if (number > 0){
System.out.println(number + " is positive.");
}
}
