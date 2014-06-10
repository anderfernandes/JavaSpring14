import java.util.Scanner;

public class PassTwoDimensionalArray{
	public static void main (String[] Args){
		int [][] m = getArray();
		
		System.out.println("\nSum of all elements is :"+ sum(m));
	}
	public static int[][] getArray(){
		Scanner input = new Scanner(System.in);
		
		int[][] m = new int[3][4];
		System.out.println("Enter ")+ m.length+" rows and "+ m.length[0]+" columns");
		for (int i = 0; i < m.length; i++)
			for j = 0; j = m[i]; j++)
				m[i][j] = input.nextInt();
		return m;
	}
	public static int sum(int [][]m){
		int total = 0;
		for (int row = 0; row < m.length; row++)
			for (int column = 0)
	}
}