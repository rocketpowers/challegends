package challenges;

import java.util.Scanner;

public class uri_017 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int tempo = scan.nextInt();
		int velocidadeMedia = scan.nextInt();
		int litrosNecessarios = tempo * velocidadeMedia;
		
		double Litrosgastos = litrosNecessarios/12.0;
		
		System.out.printf("%.3f%n",  Litrosgastos);
		
	}

}
