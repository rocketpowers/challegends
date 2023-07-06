package challenges;

import java.util.Scanner;

public class uri_1013 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int maiorAb= (a + b + Math.abs(a - b)) / 2;
		int maiorAbc = (maiorAb + c + Math.abs(maiorAb - c)) / 2;

		System.out.println(maiorAbc + " eh o maior");
	}

}
