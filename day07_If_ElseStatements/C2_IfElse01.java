package day07_If_ElseStatements;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
		
		// Soru 1) Kullanicidan dikd�rtgen kenar uzunluklarini isteyin ve dikd�rtgen kare olup olmadigini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen dikd�rtgenin kenarlarini giriniz. \nIlk kenari girince ENTER'a basiniz.");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikd�rtgen karedir.");
			} else {
				System.out.println("Girdiginiz dikd�rtgen kare degildir.");
			}
	}

}
