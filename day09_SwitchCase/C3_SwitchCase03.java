package day09_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		
		// Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen g�n giriniz.");
		
		String g�n = scan.next().toLowerCase();
		
		switch(g�n) {
		
		case "pazartesi":
		case "sali":	
		case "carsamba":	
		case "persembe":
		case "cuma":
			System.out.println("Girdiginiz g�n hafta ici.");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("Girdiginiz g�n hafta sonu.");
			break;
		default:
			System.out.println("L�tfen gecerli bir g�n ismi giriniz.");
		
		}
		
		scan.close();

	}

}
