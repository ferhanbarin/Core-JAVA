package day09_SwitchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {
		
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin.
		
		// break alt satira geçmesini saglar.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen haftanin kacinci gününde oldugunuzu giriniz.");
		
		int günNo = scan.nextInt();
		
		switch(günNo) {
		
		case 1:
			System.out.println("Bugün Pazartesi");
			break;
		case 2:
			System.out.println("Bugün Sali");
			break;
		case 3:
			System.out.println("Bugün Carsamba");
			break;
		case 4:
			System.out.println("Bugün Persembe");
			break;
		case 5:
			System.out.println("Bugün Cuma");
			break;
		case 6:
			System.out.println("Bugün Cumartesi");
			break;
		case 7:
			System.out.println("Bugün Pazar");
			break;
		default:
			System.out.println("Lütfen gecerli gün numarasi giriniz.");
			
			scan.close();
			
		}

	}

}
