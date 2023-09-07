package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1036 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double delta = Math.pow(b, 2) - (4 * a * c);
		double r1 = (-b + Math.sqrt(delta)) / (2 * a);
		double r2 = (-b - Math.sqrt(delta)) / (2 * a);

		if (delta > 0 && a != 0) {

			System.out.println("R1 = " + String.format("%.5f", r1));
			System.out.println("R2 = " + String.format("%.5f", r2));

		} else {
			System.out.println("Impossivel calcular");
		}

	}

}
