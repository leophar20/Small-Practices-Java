import java.util.Scanner;

public class A2_1 {
	private static Scanner in;
	private static int quarters;
	private static int dimes;     //variables for type of coins//
	private static int nickels;
	private static int pennies;
	private static int change;

	public static void main(String[] args) {
	    in = new Scanner(System.in);  
		quarters = 0;  
	    dimes = 0;  
	    nickels = 0;  
	    pennies = 0;
	    System.out.print("Enter number of pennies : ");  //asking the question//
		change = in.nextInt();
		if (change/25 != 0) {  
	         quarters = change/25;  
	         change = change%25;  
	         System.out.println("quarters : "+ quarters); //conditions for the remainder// 
	      }  
	     if (change/10 != 0) {  
	         dimes = change/10;  
	         change = change%10;  
	         System.out.println("dimes : "+dimes);  
	      }  
	     if (change/5 != 0) {  
	         nickels = change/5;  
	         change = change%5;  
	         System.out.println("nickels : "+nickels);  
	      }  
	      pennies = change;  
	      System.out.println("pennies : "+pennies);
	}
}

/*Enter number of pennies : 119
quarters : 4
dimes : 1
nickels : 1
pennies : 4 */