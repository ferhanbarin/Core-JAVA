package day08_TernaryOperator;

import java.util.Scanner;

public class C6_NestedTernary {

	public static void main(String[] args) {
		
		// Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam veya negatif” , 100’den kucukse “iki basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir tamsayi giriniz.");
		
		int sayi = scan.nextInt();
		
		System.out.println(sayi < 10 ? "Rakam veya negatif sayi" : sayi<100 ? "Iki Basamakli Sayi" : "Uc Basamakli Sayi");
		
		scan.close();

	}

}
