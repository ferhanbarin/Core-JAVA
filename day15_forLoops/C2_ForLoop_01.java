package day15_forLoops;

import java.util.Iterator;

public class C2_ForLoop_01 {

	public static void main(String[] args) {
		
		// 10'dan 20'ye kadar olan sayilari yazdiran bir "Loop" olusturun.
		
		for (int i=10 ; i<=20 ; i++) {
			System.out.print(i + " ");
			
		}
		
		System.out.println("");
		// 100 ile 200 dahil aralarindaki 10 ile bölünebilen sayilari yazdirin.
		
		for (int i=100 ; i<=200 ; i+=10) {
			System.out.print(i + " ");
			
		}
		
		System.out.println("");
		// 50'den 20'ye kadar (sinirlar dahil) 3'er 3'er geri sayarak  yazdirin.
		
		for (int i=50 ; i>=20 ; i-=3) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		// 50 ile 100 arasinda üc ile bölünebilen sayilari yazdirin.
		
		for (int i=50 ; i<=100 ; i++) {
			
			if (i%3 == 0) { // sayi 3 ile tam bölünüyorsa.
				System.out.print(i + " ");
			}
		}
		
		
		System.out.println("");
		/*                                  
		for (int i=10 ; i<20 ; i--) {     *Eger degisken verilen artis veya azalisla bitis kosuluna ulasamiyorsa "SONSUZ LOOP" olusur. Sistem cökene kadar "LOOP" calismaya devam eder.
			System.out.println(i + " ");
		}
		
		*/
				// *Eger baslangic degeri kosulu saglamiyorsa, "LOOP" body hic calismadan "LOOP" sonuna gider. Yani "LOOP" islevsiz olur.
		for (int i=10 ; i<0 ; i++) {
			System.out.print(i + " ");
			
		}
		
		System.out.println("Son ForLoop'un sonrasi");
	}

}
	