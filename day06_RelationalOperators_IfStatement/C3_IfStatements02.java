package day06_RelationalOperators_IfStatement;

import java.util.Scanner;

public class C3_IfStatements02 {

	public static void main(String[] args) {

		// Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen bir sayi giriniz.");

		int girilenSayi = scan.nextInt();

		if (girilenSayi % 2 == 0) {
			System.out.println("Girdiginiz sayi cift sayidir.");

		}

		if (girilenSayi % 2 == 1) {
			System.out.println("Girdiginiz sayi tek sayidir.");
			
		}
		
		if (girilenSayi<0) {
			System.out.println("Lütfen pozitif bir tam sayi giriniz.");
			
		}
	}

}
