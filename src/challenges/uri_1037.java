package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1037 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double value = scan.nextDouble();

		if (value >= 0.00 && value <= 25.00) {
			System.out.println("Intervalo [0,25]");

		} 
		
		else if (value > 25.00 && value <= 50.00) {
			System.out.println("Intervalo (25,50]");

		}
		
		else if (value > 50.00 && value <= 75.00) {
		System.out.println("Intervalo (50,75]");
		}
		
		else if (value > 75.00 && value <= 100.00) {
			System.out.println("Intervalo (75,100]");

		}
		
		else {
			System.out.println("Fora de intervalo");
		}

	}

}
