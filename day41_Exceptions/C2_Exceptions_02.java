package day41_Exceptions;

import java.util.Scanner;

public class C2_Exceptions_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = 1;
		while (count<=2) {
			
			System.out.print("Bölünen sayiyi giriniz : ");
			int sayi1 = scan.nextInt();
			
			System.out.print("Bölen sayiyi giriniz : ");
			int sayi2 = scan.nextInt();
			
			try {
				System.out.println("Bölüm : " + sayi1/sayi2);
			} catch (ArithmeticException e) { // Try body'sinden muhtemel hata ArithmeticException olarak Catch body'a sart olarak yazildi.
				System.out.println("Bölme isleminde bölen 0 olamaz."); // Manuel handle.
				System.out.println(e.getMessage()); // / by zero ---> Handle(fix) edilecek veridir.
				e.printStackTrace(); // java.lang.ArithmeticException: / by zero
									 //Bölünen sayiyi giriniz : at day41_Exceptions.C2_Exceptions_02.main(C2_Exceptions_02.java:20)
									 // Hatanin handle edilmesi icin tüm verileri yazdirdi.
				
			}
			
			count++;
			
			System.out.println("Bu yaziyi okuyorsan kod bu satira kadar sorunsuz RUN olmustur.");
				
		}
			
			scan.close();	
	}

}
