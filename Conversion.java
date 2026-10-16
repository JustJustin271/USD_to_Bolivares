//Numbers as of 10/15/26

import java.util.Scanner;

public class Conversion {
	
	public static double convertBolivares(double USD) {
		double rateBolivares = 11.73;
		
		return USD * rateBolivares;
	}
	
	public static double convertUSD(double Bolivares) {
		double rateUSD = 0.085;
		
		return Bolivares * rateUSD;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the currency converter!");
		
		System.out.println("Would you like to convert (U)SD or (B)olivares?");
		
		String rawAnswer = scan.nextLine();
		
		String processedAnswer = rawAnswer.toLowerCase();
		
		char choice = processedAnswer.charAt(0);
		
		if (choice == 'u') {
			
			System.out.println("How many USD do you want to convert?");
			
			double currency = scan.nextDouble();
			
			System.out.println("You have " + convertUSD(currency) + " Bolivares!");
		} else if (choice == 'b') {
			
			System.out.println("How many Bolivares do you want to convert?");
			
			double currency = scan.nextDouble();
			
			System.out.println("You have " + convertBolivares(currency) + " Bolivares!");
		} else {
			System.out.println("Hope you have a nice day!");
		}
		
		scan.close();

	}

}
