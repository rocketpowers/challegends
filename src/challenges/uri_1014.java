package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1014 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int distanciaPercorrida = scan.nextInt();
		double qtdCombustivel = scan.nextDouble();
		double consumo = distanciaPercorrida / qtdCombustivel;

		System.out.printf("%.3f km/l%n", consumo);
		

	}				

}
