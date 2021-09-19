package day07_If_ElseStatements;

import java.util.Scanner;

public class C5_IfElseIf01 {

	public static void main(String[] args) {
		
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
				// eger uzunluklardan birisi 0 veya daha kucukse
				// "gecerli uzunluk giriniz" yazdirin,
				// uzunluklarin ikisi de pozitif ise
				// dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen dikd�rtgenin kenarlarini giriniz. \nIlk kenari girince ENTER'a basiniz.");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if (kenar1<=0 || kenar2<=0) {
			System.out.println("L�tfen gecerli uzunluk giriniz.");
		} else if (kenar1 == kenar2) {
			System.out.println("Girdiginiz dikd�rtgen karedir.");
		} else {
			System.out.println("Girdiginiz dikd�rtgen kare degildir.");
		}
		
		scan.close();
	}

}
