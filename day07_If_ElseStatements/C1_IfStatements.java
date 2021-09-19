package day07_If_ElseStatements;

import java.util.Scanner;

public class C1_IfStatements {

	public static void main(String[] args) {
		
		// Soru) Kullanicidan g�n ve ismini alin ve haftaici veya haftasonu oldugunu yazdirin.
		// Ornek: g�n=Pazar output = "Hafta sonu" - g�n=Sali output = "Hafta ici"
		// String icin equals method'unu kullanin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen g�n ismini giriniz.");
		
		String g�nIsmi = scan.next().toLowerCase();
		
		// FLAG kullanimi
		int flag = 0;
		
		if (g�nIsmi.equals("pazartesi") || g�nIsmi.equals("sali") || g�nIsmi.equals("carsamba") || g�nIsmi.equals("persembe") || g�nIsmi.equals("cuma")) {
			System.out.println("Girdiginiz g�n hafta ici.");
			flag++;
			
		}
		
		if (g�nIsmi.equals("cumartesi") || g�nIsmi.equals("pazar")) {
			System.out.println("Girdiginiz g�n hafta sonu.");
			flag++;
		}
		
		// Pazar ==> flag=1 -- 2. if body'si calisacak.
		// Sali ==> flag=1 -- 1. if body'si calisacak.
		// Pezer ==> flag=0
		
		if (flag==0) {
			System.out.println("L�tfen gecerli bir g�n ismi yaziniz.");
			
		}
	}

}
