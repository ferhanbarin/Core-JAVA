package day35_Encapsulation;

import java.util.Scanner;

public class C4_BookMain_04 {
	
	public static void main(String[] args) {
		
		C3_Book_03 kitap = new C3_Book_03();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Son okudugunuz kitabi giriniz : ");
		String kitap2 = scan.nextLine();
		
		kitap.setBookName("Calikusu");
		kitap.setAuthorName(kitap2);
		
		System.out.print("1. kitabim : " + kitap.getBookName() + " 2. kitabim : " + kitap.getAuthorName());
		
		scan.close();
	}

}
