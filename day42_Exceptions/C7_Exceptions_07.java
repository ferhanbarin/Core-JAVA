package day42_Exceptions;

import java.util.Scanner;

public class C7_Exceptions_07 {
	
	// Kullanicidan yasinin girmesini isteyin. Kodunuzu kullanici sifirdan kücük bir sayi girerse Exception verecek sekilde yazin.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen sayi giriniz : ");
		int age = scan.nextInt();
		
		// I. YOL --> Try-Catch kullanmadan.
		
	/*
		if (age >= 0) {
			System.out.print("Yasiniz : " + age);
		} else {
			throw new IllegalArgumentException(); Exceptions firlatip code kirilir.
		}
		
	*/

		// II. YOL --> Try-Catch kullanarak.
		
		try {
			if (age >= 0) {
				System.out.print("Yasiniz : " + age);
			} else {
				throw new IllegalArgumentException(); // Exceptions firlatip code kirilmaz cünkü try body devam eder. Catch calisir.
			}
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n");
		System.out.println("Bu yaziyi okuyorsan kod bu satira kadar sorunsuz RUN olmustur.");

	}

}
