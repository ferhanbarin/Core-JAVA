package day12_StringManipulations;

import java.util.Scanner;

public class C2_StringManipulation02 {

	public static void main(String[] args) {
		
		// (Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
	 	// isim-soyisim : M***** B*******
	 	// kart no : **** **** **** 1234
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz.");
		String isim = scan.nextLine();
		
		System.out.println("Lütfen soyisminizi giriniz.");
		String soyisim = scan.nextLine();
		
		System.out.println("Lütfen kart numaranizi giriniz.");
		String kkNo = scan.nextLine();
		
		String isimDüzenlenmis = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		String soyisimDüzenlenmis = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\S", "*");
		String kkNoDüzenlenmis = "**** **** **** " + kkNo.substring(12);
		
		System.out.println("isim-soyisim : " + isimDüzenlenmis + " " + soyisimDüzenlenmis + "\nkart no : " + kkNoDüzenlenmis);
		
		scan.close();
			 	
	}

}
