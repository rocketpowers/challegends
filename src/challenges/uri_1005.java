package challenges;

import java.util.Locale;
import java.util.Scanner;

public class uri_1005 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		double A= scan.nextDouble();
		double B= scan.nextDouble();

		double MEDIA = ((A*3.5) + (B*7.5)) /11;
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		

		
		scan.close();

	}

}
