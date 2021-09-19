package day06_RelationalOperators_IfStatement;

import java.util.Scanner;

public class C4_IfStatements03 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
		 * baslayan gun isimlerini yazdirin Ornek: ilkHarf=P output = “Pazar, Pazartesi
		 * veya Persembe” ilkHarf=S output = “Sali” Buyuk kucuk harf problem olmamasi
		 * icin toUpperCase methodunu kullanin
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen istediginiz gün isminin ilk harfini giriniz.");

		char harf = scan.next().toLowerCase().charAt(0); // Tek karakteri char olarak da alabiliriz.
		                                                 // Ancak char primiteve'dir ve method'lari yoktur.
		                                                 // Bunun icin String olarak almayi tercih ettik.

		if (harf == 'p' || harf == 'P') {
			System.out.println("Pazartesi,Persembe veya Pazar");

		}

		if (harf == 's') {
			System.out.println("Sali");
		}

		if (harf == 'c') {
			System.out.println("Carsamba,Cuma veya Cumartesi");
		}
		
		if (harf != 'p' && harf != 's' && harf != 'c') {
			System.out.println("Lütfen gecerli bir harf giriniz.");
			
		}
		
	}
}
