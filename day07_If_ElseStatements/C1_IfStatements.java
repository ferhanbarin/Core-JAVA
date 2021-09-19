package day07_If_ElseStatements;

import java.util.Scanner;

public class C1_IfStatements {

	public static void main(String[] args) {
		
		// Soru) Kullanicidan gün ve ismini alin ve haftaici veya haftasonu oldugunu yazdirin.
		// Ornek: gün=Pazar output = "Hafta sonu" - gün=Sali output = "Hafta ici"
		// String icin equals method'unu kullanin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen gün ismini giriniz.");
		
		String günIsmi = scan.next().toLowerCase();
		
		// FLAG kullanimi
		int flag = 0;
		
		if (günIsmi.equals("pazartesi") || günIsmi.equals("sali") || günIsmi.equals("carsamba") || günIsmi.equals("persembe") || günIsmi.equals("cuma")) {
			System.out.println("Girdiginiz gün hafta ici.");
			flag++;
			
		}
		
		if (günIsmi.equals("cumartesi") || günIsmi.equals("pazar")) {
			System.out.println("Girdiginiz gün hafta sonu.");
			flag++;
		}
		
		// Pazar ==> flag=1 -- 2. if body'si calisacak.
		// Sali ==> flag=1 -- 1. if body'si calisacak.
		// Pezer ==> flag=0
		
		if (flag==0) {
			System.out.println("Lütfen gecerli bir gün ismi yaziniz.");
			
		}
	}

}
