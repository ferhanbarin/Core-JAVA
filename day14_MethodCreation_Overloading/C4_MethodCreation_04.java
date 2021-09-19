package day14_MethodCreation_Overloading;

import java.util.Scanner;

public class C4_MethodCreation_04 {

	public static void main(String[] args) {
		
		/*
		Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin. 
		Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yazin,
		ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen isminizi giriniz.");
		String m�steriIsmi = scan.next();
		
		m�steriIsmi = ismiD�zelt(m�steriIsmi);
		
		
		System.out.println("L�tfen soyisminizi giriniz.");
		String m�steriSoyismi = scan.next();
		
		m�steriSoyismi = ismiD�zelt(m�steriSoyismi);
		
		// Pratik kullanim acisindan, baba adi, anne adi vb. t�m bilgileri ayni method'u kullanarak istedigimiz formata cevirebiliriz.
		
		System.out.println("L�tfen kredi kart numaranizi arada bosluk olmadan giriniz.");
		String kkNo = scan.next();
		
		kkNo = kkNoD�zelt(kkNo);
		
		scan.close();
		
	}

	public static String kkNoD�zelt(String kkNo) {
		
		kkNo = kkNo.replace(" ", "");
		kkNo = kkNo.substring(0,4) + " " + kkNo.substring(4,8) + " " + kkNo.substring(8,12) + " " + kkNo.substring(12,12);
		
		return kkNo;
		
	}

	public static String ismiD�zelt(String m�steriIsmi) {
		// Bu method'un amaci m�steri ismini nasil yazarsa yazsin ilk harf b�y�k, digerleri k�c�k harf olacak sekilde d�zenlemek.
		// Basta veya sonda bosluk birakmissa onlarida yokedelim.
		
		m�steriIsmi = m�steriIsmi.trim(); // Atama yapmazsak degisiklik kalici olmaz.
		m�steriIsmi = m�steriIsmi.substring(0, 1).toUpperCase() +
									m�steriIsmi.substring(1).toLowerCase();
		// m�steriIsmi'nde yapilan degisikleri main method'a g�nderebilmek icin RETURN TYPE'i void yerine variable'in data t�r�ne uygun bir sekle d�nd�rmeliyim.
		
		return m�steriIsmi;
	}

}
