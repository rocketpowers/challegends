package challenges;

import java.util.Scanner;

public class uri_1019 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int totalSegundos = scan.nextInt();

		// 1 hora 3600 segundos
		int qtdHoras = totalSegundos / 3600;

		totalSegundos = totalSegundos % 3600;

		int qtdMinutos = totalSegundos / 60;
		totalSegundos = totalSegundos % 60;

		int qtdSegundos = totalSegundos;

		System.out.println(qtdHoras + ":" + qtdMinutos + ":" + qtdSegundos);
		// ou
		//System.out.printf("%d:%d:%d", qtdHoras, qtdMinutos, qtdSegundos);

	}
}
