package day02_Variables_Scanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
		
		// Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak su sekilde yazdirin. > Isim - Soyisim: Ferhan Barin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz.");
		
		String name = scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz.");
		
		String surname = scan.next();
		
		// Isim - soyisim : +Ferhan+ +Barin
		
		System.out.println("Isim - Soyisim : " + name + " " + surname);
		

		
		

	}

}
