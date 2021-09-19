package day07_If_ElseStatements;

import java.util.Scanner;

public class C7_IfElseIf03 {

	public static void main(String[] args) {
		
		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
		// 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen notunuzu giriniz.");
		
		double not = scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("Lütfen gecerli not giriniz.");
		} else if (not<50) {
			System.out.println("Notunuz: D");
		} else if (not<60) {                   // 20. satirla birlikte düsünürken 50-60 arasi demek.
			System.out.println("Notunuz: C");
		} else if (not<80) {                   // 20. ve 22. satirla birlikte 60-80 arasi demek
			System.out.println("Notunuz: B");
		} else {
			System.out.println("Notunuz: A");
		}
		
		scan.close();

	}

}
