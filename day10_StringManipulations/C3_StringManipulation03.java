package day10_StringManipulations;

import java.util.Scanner;

public class C3_StringManipulation03 {

	public static void main(String[] args) {
		
		// indexOf() ==> index bulamazsa -1 verir.
		// indexOf() ==> Verilen String’de istenen karakterin kullanildigi ilk index’i dondurur.
		
		String str = "Java ögrenmek ne güzel";
		
		System.out.println(str.indexOf("e")); // 8
		
		System.out.println(str.indexOf(' ')); // 4
		
		System.out.println(str.indexOf("mek")); // 10
		
		System.out.println(str.indexOf("")); // 0
		
		System.out.println(str.indexOf("j")); // -1 
		
		System.out.println(str.indexOf("J")); // 0
		
		System.out.println(str.indexOf("m", 10)); // index olarak 10 dahil sonrasi  " m " arar.
		
		
		// Kullanicidan bir String isteyin. Girdigi String "java" iceriyorsa "Aferin yazdirin, icermiyorsa "Daha cok calisman lazim" yazdirin. Büyük kücük harf önemsiz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir cümle giriniz.");
		
		String cümle = scan.nextLine().toLowerCase();
		
		// cümle.indexOf("Java") // cümlede java varsa index dönecek, yoksa -1 dönecek.
		
		// 1. YOL
		
		if (cümle.indexOf("java") == -1) {
			System.out.println("Daha cok calisman lazim.");
		} else {
			System.out.println("Aferin.");
		}
		
		
		// 2. YOL
		
		if (cümle.indexOf("java") != -1) {
			System.out.println("Aferin.");
		} else {
			System.out.println("Daha cok calisman lazim.");
		}
		
		// 3. YOL
		
		System.out.println(cümle.indexOf("java") == -1 ? "Daha cok calisman lazim." : "Aferin.");
		
		scan.close();
	}

}
