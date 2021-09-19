package day03_DataCasting_Increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		
		/*
		 Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
 		Isminiz : Mehmet
 		Soyisminiz : Bulut
 		Kursumuza katiliminiz alinmistir,tesekkur ederiz
 		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi ve soyismizi yaziniz. \nIsminizi yazdiktan sonra ENTER'a basiniz.");
		
		// syso icinde alt satira gecmek istediginizde \n yazariz.
		// \n sonra bosluk birakirsak ikinci satirin basinda bosluk olur.
		
		String name = scan.nextLine();
		String surname = scan.nextLine();
		
		// next () sadece ilk kelimeyi alir, girilen deger daha uzunsa ilk kelimeden sonrasi kalir.
		// nextLine () ise o satirin sonuna kadar girilen tüm degerleri alir.
		
		System.out.println("Isminiz: " + name +"\nSoyisminiz: " + surname + "\nKursumuza katiliminiz alinmistir, tesekkur ederiz.");
	
		scan.close();
	
		
	}	

}
