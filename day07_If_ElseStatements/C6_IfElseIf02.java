package day07_If_ElseStatements;

import java.util.Scanner;

public class C6_IfElseIf02 {

	public static void main(String[] args) {
		
		// Soru) Kullanicidan g�n ve ismini alin ve haftaici veya haftasonu oldugunu yazdirin.
				// Ornek: g�n=Pazar output = "Hafta sonu" - g�n=Sali output = "Hafta ici"
				// String icin equals method'unu kullanin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen g�n ismini giriniz.");
		
		String g�nIsmi = scan.next().toLowerCase();
		
		if (g�nIsmi.equals("pazartesi") || g�nIsmi.equals("sali") || g�nIsmi.equals("carsamba") || g�nIsmi.equals("persembe") || g�nIsmi.equals("cuma")) {
			System.out.println("Girdiginiz g�n hafta ici.");
			
		} else if (g�nIsmi.equals("cumartesi") || g�nIsmi.equals("pazar")) {
			System.out.println("Girdiginiz g�n hafta sonu."); 
			
		} else {
			System.out.println("L�tfen gecerli bir g�n ismi giriniz.");
		}
		
		scan.close();
	}

}
