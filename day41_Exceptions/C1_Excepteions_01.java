package day41_Exceptions;

import java.util.Scanner;

//Kullanicidan alacaginiz iki tam sayinin bölümünü yazdiriniz.

public class C1_Excepteions_01 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Bölünen sayiyi giriniz.");
	int sayi1 = scan.nextInt();
	
	System.out.println("Bölen sayiyi giriniz.");
	int sayi2 = scan.nextInt();
	
	try {
		System.out.println("Bölüm : " + sayi1/sayi2);
	} catch (ArithmeticException e) {                          // Try body'sinden muhtemel hata ArithmeticException olarak Catch body'a sart olarak yazildi.
		System.out.println("Bölme isleminde bölen 0 olamaz."); 
	}
	                                                           // ArithmeticException class'indan data type ArithmeticException olan bir exception obj manuel handle(fix) yaptik.
	scan.close();

	}
}
