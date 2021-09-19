package day07_If_ElseStatements;

import java.util.Scanner;

public class C6_IfElseIf02 {

	public static void main(String[] args) {
		
		// Soru) Kullanicidan gün ve ismini alin ve haftaici veya haftasonu oldugunu yazdirin.
				// Ornek: gün=Pazar output = "Hafta sonu" - gün=Sali output = "Hafta ici"
				// String icin equals method'unu kullanin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen gün ismini giriniz.");
		
		String günIsmi = scan.next().toLowerCase();
		
		if (günIsmi.equals("pazartesi") || günIsmi.equals("sali") || günIsmi.equals("carsamba") || günIsmi.equals("persembe") || günIsmi.equals("cuma")) {
			System.out.println("Girdiginiz gün hafta ici.");
			
		} else if (günIsmi.equals("cumartesi") || günIsmi.equals("pazar")) {
			System.out.println("Girdiginiz gün hafta sonu."); 
			
		} else {
			System.out.println("Lütfen gecerli bir gün ismi giriniz.");
		}
		
		scan.close();
	}

}
