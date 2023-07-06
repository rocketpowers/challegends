package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1010 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		int peca1 = scan.nextInt();
		int qtdPecas1 = scan.nextInt();
		double valuePeca1 = scan.nextDouble();
		
		double amount1 =  qtdPecas1 * valuePeca1;
		
		int peca2 = scan.nextInt();
		int qtdPecas2 = scan.nextInt();
		double valuePeca2 = scan.nextDouble();
		
		double amount2 =  qtdPecas2 * valuePeca2;
		
		double total=amount1+amount2;

		
	
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total );
		
		scan.close();

	}

}
