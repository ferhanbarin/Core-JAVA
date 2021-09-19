package day11_StringManipulations;

import java.util.Scanner;

public class C3_StringManipulations03 {

	public static void main(String[] args) {
		
		// Soru 2) Kullanicidan bir cumle isteyin. 
		// Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak, 
		// “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin, 
		// iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir cümle giriniz.");
		
		String cümle = scan.nextLine().toLowerCase();
		
		if (cümle.contains("büyük")) {
			System.out.println(cümle.toUpperCase());
		} else if (cümle.contains("kücük")) {
			System.out.println(cümle.toLowerCase());
		} else {
			System.out.println("Cümle kücük yada büyük kelimesi icermiyor.");
		}
		
		scan.close();

	}

}
