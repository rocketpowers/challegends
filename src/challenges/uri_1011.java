package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1011 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		double PI = 3.14159;
		double raio = scan.nextDouble();

		double volumeEsfera = (4 / 3.0) * PI * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volumeEsfera);
	}

}
