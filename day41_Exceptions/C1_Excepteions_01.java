package day41_Exceptions;

import java.util.Scanner;

//Kullanicidan alacaginiz iki tam sayinin b�l�m�n� yazdiriniz.

public class C1_Excepteions_01 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("B�l�nen sayiyi giriniz.");
	int sayi1 = scan.nextInt();
	
	System.out.println("B�len sayiyi giriniz.");
	int sayi2 = scan.nextInt();
	
	try {
		System.out.println("B�l�m : " + sayi1/sayi2);
	} catch (ArithmeticException e) {                          // Try body'sinden muhtemel hata ArithmeticException olarak Catch body'a sart olarak yazildi.
		System.out.println("B�lme isleminde b�len 0 olamaz."); 
	}
	                                                           // ArithmeticException class'indan data type ArithmeticException olan bir exception obj manuel handle(fix) yaptik.
	scan.close();

	}
}
