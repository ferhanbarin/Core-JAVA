package day14_MethodCreation_Overloading;

import java.util.Scanner;

public class C1_MethodCreation01 {

	public static void main(String[] args) {
		/* Soru 1 ) Kullanicidan bir sayi alin.
		 Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu kucuk mu oldugunu,
		 ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin
		 toplamini,100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir tamsayi giriniz.");
		int sayi = scan.nextInt();
		
		tekMiCiftmiYazdir(sayi);
		sifirlaKarsilastir(sayi);
		istenenBasamaklariYazdir(sayi);
		
		scan.close();

	}

	public static void istenenBasamaklariYazdir(int sayi) {
		
		if (sayi < 100) {
			System.out.println("Girilen sayinin birler basamagi : " + (sayi%10));
		} else { // Sayi 100'den büyük. 455254
			
		int rakamlarToplami = 0;
		int rakam = 0;
		
		rakam = sayi%10; // 4
		rakamlarToplami += rakam; // 4
		sayi /= 10; // 45525
			
		rakam = sayi%10; // 5
		rakamlarToplami += rakam; // 9
		sayi /= 10; // 4552
		
		rakam = sayi%10; // 2
		rakamlarToplami += rakam; // 11
		
		System.out.println("Sayinin birler, onlar ve yüzler basamagindaki rakamlar toplami : " + rakamlarToplami);
	
		}
		
		
	}

	public static void sifirlaKarsilastir(int sayi) {
		
		if (sayi > 0 ) {
			System.out.println("Girilen sayi pozitiftir.");
		} else if (sayi < 0) {
			System.out.println("Girilen sayi negatiftir.");
		} else {
			System.out.println(" 0 sayisi pozitif yada negatif degildir.");
		}
		
	}

	public static void tekMiCiftmiYazdir(int sayi) {
		
		if (sayi % 2 == 0) {
			System.out.println("Girilen sayi cift bir sayidir.");
		} else {
			System.out.println("Girilen sayi tek bir sayidir.");
		}
	}

}
