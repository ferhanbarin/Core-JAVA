package day11_StringManipulations;

import java.util.Scanner;

public class C3_StringManipulations03 {

	public static void main(String[] args) {
		
		// Soru 2) Kullanicidan bir cumle isteyin. 
		// Cumle �buyuk� kelimesi iceriyorsa tum cumleyi buyuk harf olarak, 
		// �kucuk� kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin, 
		// iki kelimeyi de icermiyorsa �Cumle kucuk yada buyuk kelimesi icermiyor� yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle giriniz.");
		
		String c�mle = scan.nextLine().toLowerCase();
		
		if (c�mle.contains("b�y�k")) {
			System.out.println(c�mle.toUpperCase());
		} else if (c�mle.contains("k�c�k")) {
			System.out.println(c�mle.toLowerCase());
		} else {
			System.out.println("C�mle k�c�k yada b�y�k kelimesi icermiyor.");
		}
		
		scan.close();

	}

}
