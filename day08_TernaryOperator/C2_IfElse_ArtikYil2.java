package day08_TernaryOperator;

import java.util.Scanner;

public class C2_IfElse_ArtikYil2 {

	public static void main(String[] args) {
		
		/*
       Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
       Kural 1: 4 ile bolunemeyen yillar artik yil degildir 
       Kural 2: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir
        */       
        
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen artik yil kontrolü icin bir yil giriniz.");
		
		int yil = scan.nextInt();
		
		if (yil%4 != 0) { // 4ün kati olmayanlar
			System.out.println("Girdiginiz yil artik yil degil.");
		} else { // 4ün kati olanlar
			
			if (yil%100 == 0 && yil%400 == 0) {
				System.out.println("Girdiginiz yil artik yildir.");
			} else if (yil%100 == 0 && yil%400 != 0) {
				System.out.println("Girdiginiz yil artik yil degildir.");
			} else {
				System.out.println("Girdiginiz yil artik yildir.");
			}
			
		}
		
		scan.close();

	}

}
