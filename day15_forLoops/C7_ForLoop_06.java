package day15_forLoops;

import java.util.Scanner;

public class C7_ForLoop_06 {

	public static void main(String[] args) {
		
		// Soru 7 ) "Interview Question" Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen tersten yazdirmak icin bir String yaziniz.");
		String kelime = scan.nextLine();
		
		for (int i=0 ; i<kelime.length() ; i++) {
			System.out.print(kelime.substring(kelime.length()-1-i, kelime.length()-i));
		}
		
		scan.close();
		
	}

}
