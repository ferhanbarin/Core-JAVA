package day10_StringManipulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {
		
	 // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
	 // - Girilen kelime cumlede kullanilmamis.
	 // - Girilen kelime cumlede 1 kere kullanilmis.
	 // - Girilen kelime cumlede 1�den fazla kullanilmis.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle giriniz.");
		String c�mle = scan.nextLine().toLowerCase();
		
		System.out.println("L�tfen bir kelime giriniz.");
		String kelime = scan.next().toLowerCase();
		
		
		int ilkKullanimIndexi = c�mle.indexOf(kelime); 
		int sonKullanimIndexi = c�mle.lastIndexOf(kelime); 
		
		if (ilkKullanimIndexi == -1) {
			System.out.println("Girilen kelime c�mlede kullanilmamis.");
		} else if (ilkKullanimIndexi == sonKullanimIndexi) {
			System.out.println("Girilen kelime c�mlede 1 kere kullanilmis.");
		} else {
			System.out.println("Girilen kelime c�mlede birden fazla kullanilmis.");
		}
		
		scan.close();
		
		// lastIndexOf() => Verilen String�de istenen karakterin kullanildigi son index�i dondurur.

	}

}
