package day01_Variables;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
	
		// Kullanicidan bilgi almak i�in 3 adima ihtiyacimiz var.
		// 1- Scanner class'indan bir object olusturuyoruz.
		Scanner scan = new Scanner(System.in);
		
		
				
		// 2- Kullaniciya ne istediginizi bildiren bir mesaj yazin.
		
		System.out.println("Lutfen isminizi giriniz");
		
		
		// 3- Kullanicidan istedigimiz bilginin data t�r�ne g�re bir veriable olusturup, konsolda yazilan bilgiyi kodlarimizin i�ine aliyoruz.
		
		String kullanicininIsmi = scan.nextLine();
		
		
		System.out.println("Girdiginiz isim : " + kullanicininIsmi);
		
		
	}

}
