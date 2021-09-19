package day18_doWhileLoop_Scope;

import java.util.Scanner;

public class C3_DoWhileLoop_02 {

	public static void main(String[] args) {
		
		/*
		Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin. 
		Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		Kullanici negatif sayi girerse ignore edin.
		*/
		
		double sayi = 5; // Atanan sayinin önemi yok DoWhile icin.
		int count = 0; // Count: Sayac - Kullanicinin kac tane sayi girecegi belli olmadigi icin sayac olusturuyoruz.
		double sayilarToplami = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Lütfen toplamak icin pozitif sayilar girin. \nIslemi bitirmek icin 0'a basin.");
			
			sayi = scan.nextDouble();
			// Kullanicidan aldigim sayiyi pozitif mi diye kontrol edelim.
			
			if (sayi>0) {
				
				sayilarToplami += sayi;
				count++;
				
			} else if (sayi<0) {
				System.out.println("Pozitif sayi girmeliydiniz. \nBu sayi negatif oldugu icin yok sayiyorum.");
			}
	
		} while (sayi != 0.0);
		
		System.out.println("Girdiginiz sayilardan " + count + " tanesi pozitifdi." + "\nVe pozitif sayilarin toplami : " + sayilarToplami);
		
		scan.close();
	
	}

}
