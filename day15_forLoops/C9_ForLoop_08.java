package day15_forLoops;

import java.util.Scanner;

public class C9_ForLoop_08 {

	public static void main(String[] args) {
		
		// Soru 11 ) "Interview Question" Kullanicidan 10’den kucuk bir tamsayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 10'dan kücük pozitif bir tamsayi giriniz.");
		int sayi = scan.nextInt();
		
		int factorial = 1;
		
		for (int i=1 ; i<=sayi ; i++) {
		
			factorial *= i;
			
			System.out.print(i);
			
			if (i!=sayi) {
				System.out.print("*");
			}

		}
		
		System.out.println(factorial);
		
		scan.close();

	}

}
