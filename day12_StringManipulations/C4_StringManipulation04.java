package day12_StringManipulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {
		
		// Soru 5) Kullanicidan 4 harfli bir kelime isteyin. 4 harften uzun veya kisa ise lütfen 4 harfli bir kelime girin, yazdirin.
		// Ve uygun kelime girilirse girilen kelimeyi tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 4 harfli bir kelime giriniz.");
		
		String kelime = scan.next();
		
		if (!(kelime.length() == 4)) {
			System.out.println("Lütfen 4 harfli bir kelime giriniz.");
		} else {
			System.out.println(kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1));
		}
		
		scan.close();
		
		// substring (3, 4) ilk sayiyi verir yani 3, ikincisi sayiyi yazdirmaz yani 4.
		
	}

}
