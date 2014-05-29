// Eercise02_06.java; Heads or Tails 

import java.util.Scanner;

public class headOrTails {

public static void main (String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("guess 0 for heads or 1 for tails");

int guess = input.nextInt();

System.out.println("you guessed " + guess);

int number = (int)(Math.random()* 2);


System.out.println("");

System.out.println("the random number is " + number);
 
 
}
}

