package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1008 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int numberEmployed = scan.nextInt();
		int qtdHours = scan.nextInt();
		double timeValue = scan.nextDouble();
		double salary = qtdHours * timeValue;

		System.out.println("NUMBER = " + numberEmployed);
		System.out.printf("SALARY = U$ %.2f%n", salary);

		scan.close();

	}
}