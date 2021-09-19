package day14_MethodCreation_Overloading;

import java.util.Scanner;

public class C2_MethodCreation02 {

	public static void main(String[] args) {
		
		// Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.  Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
		// Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kac sayi toplamak istersiniz?");
		int sayiAdedi = scan.nextInt();
		
		if (sayiAdedi < 2) {
			System.out.println("Toplamak icin en az 2 sayi girmelisiniz.");
		} else if (sayiAdedi == 2) {
			ikiSayiTopla();
		} else if (sayiAdedi == 3) {
			ücsayiTopla();
		} else if (sayiAdedi == 4) {
			dörtsayiTopla();
		} else {
			System.out.println("Cok sayi girdiniz, ben toplayamam.");
			
			scan.close();
		}
	}

	private static void dörtsayiTopla() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki tamsayi giriniz.");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		int sayi4 = scan.nextInt();
		System.out.println("Dört sayi girmeyi tercih ettiniz. \nGirilen dört sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
		
		scan.close();
		
	}

	private static void ücsayiTopla() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki tamsayi giriniz.");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		System.out.println("Uc sayi girmeyi tercih ettiniz. \nGirilen üc sayinin toplami : " + (sayi1+sayi2+sayi3));
		
		scan.close();
		
	}

	public static void ikiSayiTopla() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki tamsayi giriniz.");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		System.out.println("Iki sayi girmeyi tercih ettiniz. \nGirilen iki sayinin toplami : " + (sayi1+sayi2));
		
		scan.close();
	}

}
