package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		String nameSeller = scan.next();
		double salary = scan.nextDouble();
		double salesAmount = scan.nextDouble();
		double payAmount = salary + salesAmount * 15 / 100;

		System.out.printf("TOTAL = R$ %.2f%n", payAmount);

		scan.close();

	}

}
