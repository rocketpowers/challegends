package challenges;

import java.util.Scanner;

public class uri_1020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int qtdTotalDays = scan.nextInt();

		int qtdTotalYears = qtdTotalDays / 365;
		qtdTotalDays = qtdTotalDays % 365;

		int qtdMounth = qtdTotalDays / 30;
		qtdTotalDays = qtdTotalDays % 30;

		int qtdDays = qtdTotalDays;

		System.out.printf("%d ano(s)%n", qtdTotalYears);
		System.out.printf("%d mes(es)%n", qtdMounth);
		System.out.printf("%d dia(s)%n", qtdDays);

	}
}
