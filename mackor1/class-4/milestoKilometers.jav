// Eercise04_02.java; milesToKilometers 

import java.util.Scanner;

public class milesToKilometers {

public static void main (String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("miles to kilometers");

      int x = 1;

      while( x < 10 ) {
         System.out.print("value of x : " + x*1.609);
         x++;
         System.out.print("\n");
      }
   }
}
