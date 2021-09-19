package day18_doWhileLoop_Scope;

import java.util.Scanner;

public class C2_DoWhileLoop_01 {

	public static void main(String[] args) {
		
		//  Kullanicidan iki pozitif sayi isteyin.
		// Kullanici negatif sayi girdiginde girilen negatif sayilari yok sayip, yeniden deger isteyin.
		// Kullanici dogru giris yaptiginda 'Well Done' yazdirin. Ve sayilarin carpimini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen iki pozitif tamsayi giriniz.");
		
		int sayi1 = 5;		//DoWhile ile yaparken verilen degerin hicbir önemi yok.   
		int sayi2 = 10;
		
		do {
			
			sayi1 = scan.nextInt();
			sayi2 = scan.nextInt();
			
			if (sayi1>0 && sayi2>0) {
				System.out.println("'Well Done' \nGirilen sayilarin carpimi : " + (sayi1*sayi2));
			} else {
				System.out.println("Lütfen pozitif iki tamsayi giriniz.");
			}
			
		} while (!(sayi1>0 && sayi2>0));
			
		scan.close();

	}

}
