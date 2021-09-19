package day09_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		
		// Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen gün giriniz.");
		
		String gün = scan.next().toLowerCase();
		
		switch(gün) {
		
		case "pazartesi":
		case "sali":	
		case "carsamba":	
		case "persembe":
		case "cuma":
			System.out.println("Girdiginiz gün hafta ici.");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("Girdiginiz gün hafta sonu.");
			break;
		default:
			System.out.println("Lütfen gecerli bir gün ismi giriniz.");
		
		}
		
		scan.close();

	}

}
