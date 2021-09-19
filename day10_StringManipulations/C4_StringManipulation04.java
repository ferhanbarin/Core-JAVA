package day10_StringManipulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {
		
	 // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
	 // - Girilen kelime cumlede kullanilmamis.
	 // - Girilen kelime cumlede 1 kere kullanilmis.
	 // - Girilen kelime cumlede 1’den fazla kullanilmis.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir cümle giriniz.");
		String cümle = scan.nextLine().toLowerCase();
		
		System.out.println("Lütfen bir kelime giriniz.");
		String kelime = scan.next().toLowerCase();
		
		
		int ilkKullanimIndexi = cümle.indexOf(kelime); 
		int sonKullanimIndexi = cümle.lastIndexOf(kelime); 
		
		if (ilkKullanimIndexi == -1) {
			System.out.println("Girilen kelime cümlede kullanilmamis.");
		} else if (ilkKullanimIndexi == sonKullanimIndexi) {
			System.out.println("Girilen kelime cümlede 1 kere kullanilmis.");
		} else {
			System.out.println("Girilen kelime cümlede birden fazla kullanilmis.");
		}
		
		scan.close();
		
		// lastIndexOf() => Verilen String’de istenen karakterin kullanildigi son index’i dondurur.

	}

}
