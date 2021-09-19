package day11_StringManipulations;

import java.util.Scanner;

public class C1_StringManipulations01 {

	public static void main(String[] args) {
		
		// Kullanicidan bir c�mle ve bir kelime alin. C�mlede kelimenin kullanilip, kullanilmadigini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle giriniz.");
		String c�mle = scan.nextLine().toLowerCase();
		
		System.out.println("L�tfen bir kelime giriniz.");
		String kelime = scan.next().toLowerCase();
		
		// C�mlede kelimenin kullanilip, kullanilmadigini yazdirin.
		// 1- indexOf() method'uyla yapalim.
		
		if (c�mle.indexOf(kelime) != -1) {
			System.out.println("Kelime c�mlede kullanilmistir.");
		} else {
			System.out.println("Kelime c�mlede kullanilmamistir.");
		}
		
		// 2- contains() method'uyla yapalim.
		
		if (c�mle.contains(kelime)) {
			System.out.println("Kelime c�mlede kullanilmistir.");
		} else {
			System.out.println("Kelime c�mlede kullanilmamistir.");
		}
		
		scan.close();
		
		
		// Verilen String�in istenen karakter(ler)i icerip icermedigini kontrol eder Iceriyorsa TRUE, icermiyorsa FALSE d�nd�r�r.
		// NOT: contains() methodu char icin kullanilamaz, String kullanmak zorunludur.
		
	}

}
