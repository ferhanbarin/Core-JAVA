package day06_RelationalOperators_IfStatement;

import java.util.Scanner;

public class C5_IfStatement04 {

	public static void main(String[] args) {
		
		// Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdörtgenin kare olup olmadigini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen kenar uzunluklarindan birini tamsayi olarak giriniz.");
		int kenar1 = scan.nextInt();
		
		System.out.println("Lütfen diger kenar uzunlugunu tamsayi olarak giriniz.");
		int kenar2 = scan.nextInt();
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikdörtgen bir karedir.");
			
		}
		
		if (kenar1!=kenar2) {
			System.out.println("Girdiginiz dikdörtgen bir kare degil.");
			
		}
	}

}
