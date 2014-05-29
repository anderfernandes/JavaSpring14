public class ShowMiles{
	public static void main(String[] Args){
		
		double kilometers = 1.609;
		int miles = 1;
		
		while (miles <= 10){
			System.out.println("Mile: " + miles + " = " + miles * kilometers + " kilometers");
			
			miles++;
		}
			
	}
}