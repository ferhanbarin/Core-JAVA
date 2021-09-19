package day11_StringManipulations;

import java.util.Scanner;

public class C1_StringManipulations01 {

	public static void main(String[] args) {
		
		// Kullanicidan bir cümle ve bir kelime alin. Cümlede kelimenin kullanilip, kullanilmadigini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir cümle giriniz.");
		String cümle = scan.nextLine().toLowerCase();
		
		System.out.println("Lütfen bir kelime giriniz.");
		String kelime = scan.next().toLowerCase();
		
		// Cümlede kelimenin kullanilip, kullanilmadigini yazdirin.
		// 1- indexOf() method'uyla yapalim.
		
		if (cümle.indexOf(kelime) != -1) {
			System.out.println("Kelime cümlede kullanilmistir.");
		} else {
			System.out.println("Kelime cümlede kullanilmamistir.");
		}
		
		// 2- contains() method'uyla yapalim.
		
		if (cümle.contains(kelime)) {
			System.out.println("Kelime cümlede kullanilmistir.");
		} else {
			System.out.println("Kelime cümlede kullanilmamistir.");
		}
		
		scan.close();
		
		
		// Verilen String’in istenen karakter(ler)i icerip icermedigini kontrol eder Iceriyorsa TRUE, icermiyorsa FALSE döndürür.
		// NOT: contains() methodu char icin kullanilamaz, String kullanmak zorunludur.
		
	}

}
