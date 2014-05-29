// Eercise02_06.java; Summerize all digit in an integer < 1000 

import java.util.Scanner;

public class add0To1000 {

public static void main (String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("enter your number between 0 and 1000");

int number = input.nextInt();

System.out.println("your number is: " + number);

System.out.println("the sum of the number from " + number + " to 1 is: ");
 
int lastdigit = number % 10;

int remainingNumber = number / 10;

int secondLastDigit = remaingNumber % 10;

remainingNumber = remainingNumber /10;
int thirLastDigit = remainingNumber % 10;

int sum = lastDigit + secondLastDigit + thirdLastDigit;

System.out.prinln("The sum of all digits in  " + Number + " is " + sum);



}
}

