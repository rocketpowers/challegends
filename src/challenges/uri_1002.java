package challenges;

import java.util.Scanner;

public class uri_1002 {

	public static void main(String[] args) {

		double raio, area;

		Scanner scan = new Scanner(System.in);

		raio = scan.nextDouble();
		
		area=3.14159 * (raio * raio);
		
		System.out.printf("A=%.4f\n", area);

	}

}
