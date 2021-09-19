package day10_StringManipulations;

import java.util.Scanner;

public class C3_StringManipulation03 {

	public static void main(String[] args) {
		
		// indexOf() ==> index bulamazsa -1 verir.
		// indexOf() ==> Verilen String�de istenen karakterin kullanildigi ilk index�i dondurur.
		
		String str = "Java �grenmek ne g�zel";
		
		System.out.println(str.indexOf("e")); // 8
		
		System.out.println(str.indexOf(' ')); // 4
		
		System.out.println(str.indexOf("mek")); // 10
		
		System.out.println(str.indexOf("")); // 0
		
		System.out.println(str.indexOf("j")); // -1 
		
		System.out.println(str.indexOf("J")); // 0
		
		System.out.println(str.indexOf("m", 10)); // index olarak 10 dahil sonrasi  " m " arar.
		
		
		// Kullanicidan bir String isteyin. Girdigi String "java" iceriyorsa "Aferin yazdirin, icermiyorsa "Daha cok calisman lazim" yazdirin. B�y�k k�c�k harf �nemsiz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle giriniz.");
		
		String c�mle = scan.nextLine().toLowerCase();
		
		// c�mle.indexOf("Java") // c�mlede java varsa index d�necek, yoksa -1 d�necek.
		
		// 1. YOL
		
		if (c�mle.indexOf("java") == -1) {
			System.out.println("Daha cok calisman lazim.");
		} else {
			System.out.println("Aferin.");
		}
		
		
		// 2. YOL
		
		if (c�mle.indexOf("java") != -1) {
			System.out.println("Aferin.");
		} else {
			System.out.println("Daha cok calisman lazim.");
		}
		
		// 3. YOL
		
		System.out.println(c�mle.indexOf("java") == -1 ? "Daha cok calisman lazim." : "Aferin.");
		
		scan.close();
	}

}
