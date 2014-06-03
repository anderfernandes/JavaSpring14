public class Sum{

	public static int sum(int i1, int i2){
		int result = 0;
		for (int i = i1; i <= i2; i++)
			result += i;
		return result;
	}

	public static void main(String[] Args){
		System.out.println("Sum of 1 to 10 is "+ sum(1, 10));
		System.out.println("Sum of 20 to 137 is "+ sum(20, 37));
		System.out.println("Sum of 35 to 49 is "+ sum(35, 49));
		System.out.println("Sum of 15 to 99 is "+ sum(15, 99));
	}
}