package day17_NestedForLoops_WhileLoops;

import java.util.Scanner;

public class C5_WhileLoop_03 {

	public static void main(String[] args) {
		
		// Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. 
				// Kullanicinin hata yapmadigini farz edin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen baslangic harfini giriniz.");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen bitis harfini giriniz.");
		char sonHarf = scan.next().toUpperCase().charAt(0);
		
		char harf = ilkHarf;
		while (harf<=sonHarf) {
			System.out.print(harf + " ");
			harf+=1;
		}
			
		scan.close();
	}

}
