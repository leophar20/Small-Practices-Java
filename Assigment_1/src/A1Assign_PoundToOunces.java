	/**Java Convertion from pound to ounces **/
	import java.util.Scanner;
	public class A1_2 {
		private static Scanner input;

		public static void main(String[]args) {
			input = new Scanner(System.in);
			System.out.print("Enter pounds:");
			double Pounds = input.nextDouble();
			
			double ounces = Pounds * 16;
			System.out.print(Pounds + " pounds"+" is "+ounces+" Ounces.");
		
			
		}
	}

	/* Enter pounds:4
	4.0 pounds is 64.0 Ounces.*/
