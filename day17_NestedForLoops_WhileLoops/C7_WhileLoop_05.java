package day17_NestedForLoops_WhileLoops;

import java.util.Scanner;

public class C7_WhileLoop_05 {

	public static void main(String[] args) {
		
		/*
		 	Kullanicidan toplamak �zere sayi isteyin. Toplam 200 oluncaya kadar sayi istemeye devam edin.
		 	Toplam 200'� gectiginde kullanicinin, kac sayi girdigini ve bu sayilarin toplaminin kac oldugun yazdirin.
		*/
		
		// ForLoop'da islem yapabilmek icin tekrar sayisini bilmek lazim.
		// WhileLopp'da ise adim sayisi �nemli degil, bitirme kosulu �nemlidir.
		
		Scanner scan = new Scanner(System.in);
		
		int sayi = 0;
		int toplam = 0;
		int sayac = 0;
		
		while (toplam<200) {
			
			System.out.println("L�tfen toplamak icin bir tamsayi giriniz.");
			sayi = scan.nextInt();
			
			toplam += sayi;
			sayac++;
		
		}
		
		// Toplamin 200'� gectiginden eminiz.
			System.out.println("Toplam " + sayac + " adet sayi giridiniz ve bu sayilarin toplami : " + toplam);
			
			// *** Eger adim sayisi bilinmiyor veya �ng�r�lemiyorsa ForLoop degil de WhileLoop kullanmak daha mantiklidir.
			// Eger adimlar belli ise ForLoop kullanmak daha mantikli olur.
			// Veya degisimi unutup sonsuz Loop'a girmekten kurtulmus oluruz.
		
			scan.close();
	}

}
