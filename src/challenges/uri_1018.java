package challenges;

import java.util.Scanner;

public class uri_1018 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int value = scan.nextInt();

		System.out.println(value);

		System.out.println(value /100 + " nota(s) de R$ 100,00");
		value = value % 100;
		System.out.println(value /50 + " nota(s) de  R$ 50,00");
		value = value % 50;
		System.out.println(value /20 + " nota(s) de  R$ 20,00");
		value = value % 20;
		System.out.println(value /10 + " nota(s) de  R$ 10,00");
		value = value % 10;
		System.out.println(value /5 + " nota(s) de  R$ 5,00");
		value = value % 5;
		System.out.println(value /2 + " nota(s) de  R$ 2,00");
		value = value % 2;
		System.out.println(value /1 + " nota(s) de  R$ 1,00 ");
		value = value % 1;
	}

}
