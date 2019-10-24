import java.util.Scanner;


public class A2_2 
{
	private static double fahrenheit;//variables for the temperatures//
	private static double celsius; 
	private static Scanner input;

	public static void main(String[]args)
	{
	input = new Scanner(System.in);
	System.out.print("enter temperature in celsius : ");
	celsius = input.nextDouble();
	fahrenheit = (celsius*9/5.0)+32; // formula for converting//
	System.out.print(celsius + " degrees Celsius is "+ fahrenheit + " degrees fahrenheit");
			
	}
}

/*enter temperature in celsius : 30
30.0 degrees Celsius is 86.0 degrees fahrenheit*/