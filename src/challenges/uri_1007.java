package challenges;

import java.util.Scanner;

public class uri_1007 {

	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);

	int A = scan.nextInt();
	int B = scan.nextInt();
	int C = scan.nextInt();
	int D = scan.nextInt();
	int DIFERENCA= (A*B-C*D);

	
	System.out.println("DIFERENCA = "+ DIFERENCA);
}
}