package challenges;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int AgeDays;
		int years, mounths, days, rest;
		
		
		//in
		AgeDays=scan.nextInt();
		
		//process
		years=AgeDays/365;
		rest=AgeDays%365;
		mounths=rest/30;
		days=rest%30;
		
		//exit
		System.out.println(years + "ano(s)");
		System.out.println(mounths + "mes(es)");
		System.out.println(days + " dia(s)");
		
		

		scan.close();
	}
}
