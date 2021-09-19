package day17_NestedForLoops_WhileLoops;

import java.util.Scanner;

public class C6_WhileLoop_04 {

	public static void main(String[] args) {
		
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz.");
		int sayi = scan.nextInt();
		
		int i = sayi;
		int rakamlarToplami = 0;
		int rakam = 0;
		
		while (i>0) {
			
			rakam=i%10;
			rakamlarToplami += rakam;
			i/=10;
	
		}
		
		System.out.println("Girdiginiz " + sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
		
		scan.close();
	}

}
