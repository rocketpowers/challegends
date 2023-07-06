package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		double PI = 3.14159;
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();

		double areaTriangoloRetangulo = (A * C) / 2.0;
		double areaCirculo = PI * Math.pow(C, 2);
		double areaTrapezio = ((A + B) * C) / 2.0;
		double areaQuarado = B * B;
		double areaRetangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", areaTriangoloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuarado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

	}
}
