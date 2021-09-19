package day07_If_ElseStatements;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
		
		// Soru 1) Kullanicidan dikdörtgen kenar uzunluklarini isteyin ve dikdörtgen kare olup olmadigini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen dikdörtgenin kenarlarini giriniz. \nIlk kenari girince ENTER'a basiniz.");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikdörtgen karedir.");
			} else {
				System.out.println("Girdiginiz dikdörtgen kare degildir.");
			}
	}

}
