package day09_SwitchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {
		
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin.
		
		// break alt satira ge�mesini saglar.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen haftanin kacinci g�n�nde oldugunuzu giriniz.");
		
		int g�nNo = scan.nextInt();
		
		switch(g�nNo) {
		
		case 1:
			System.out.println("Bug�n Pazartesi");
			break;
		case 2:
			System.out.println("Bug�n Sali");
			break;
		case 3:
			System.out.println("Bug�n Carsamba");
			break;
		case 4:
			System.out.println("Bug�n Persembe");
			break;
		case 5:
			System.out.println("Bug�n Cuma");
			break;
		case 6:
			System.out.println("Bug�n Cumartesi");
			break;
		case 7:
			System.out.println("Bug�n Pazar");
			break;
		default:
			System.out.println("L�tfen gecerli g�n numarasi giriniz.");
			
			scan.close();
			
		}

	}

}
