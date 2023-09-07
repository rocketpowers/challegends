package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		float n1, n2, n3, n4, media, n5, mediaFinal;

		n1 = scan.nextFloat();
		n2 = scan.nextFloat();
		n3 = scan.nextFloat();
		n4 = scan.nextFloat();
		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

		if (media >= 7.0) {

			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno aprovado.");

		} else if (media < 5.0) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno reprovado.");

		}

		else {

			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno em exame.");

			n5 = scan.nextFloat();
			System.out.println("Nota do exame: " + String.format("%.1f", n5));

			mediaFinal = (n5 + media) / 2;

			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + String.format("%.1f", mediaFinal));

			}
			
				else if (mediaFinal <= 4.9) {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + String.format("%.1f", mediaFinal));
			}

		}

	}
}
