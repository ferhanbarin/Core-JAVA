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
		
		System.out.println("Lütfen isminizi giriniz.");
		String müsteriIsmi = scan.next();
		
		müsteriIsmi = ismiDüzelt(müsteriIsmi);
		
		
		System.out.println("Lütfen soyisminizi giriniz.");
		String müsteriSoyismi = scan.next();
		
		müsteriSoyismi = ismiDüzelt(müsteriSoyismi);
		
		// Pratik kullanim acisindan, baba adi, anne adi vb. tüm bilgileri ayni method'u kullanarak istedigimiz formata cevirebiliriz.
		
		System.out.println("Lütfen kredi kart numaranizi arada bosluk olmadan giriniz.");
		String kkNo = scan.next();
		
		kkNo = kkNoDüzelt(kkNo);
		
		scan.close();
		
	}

	public static String kkNoDüzelt(String kkNo) {
		
		kkNo = kkNo.replace(" ", "");
		kkNo = kkNo.substring(0,4) + " " + kkNo.substring(4,8) + " " + kkNo.substring(8,12) + " " + kkNo.substring(12,12);
		
		return kkNo;
		
	}

	public static String ismiDüzelt(String müsteriIsmi) {
		// Bu method'un amaci müsteri ismini nasil yazarsa yazsin ilk harf büyük, digerleri kücük harf olacak sekilde düzenlemek.
		// Basta veya sonda bosluk birakmissa onlarida yokedelim.
		
		müsteriIsmi = müsteriIsmi.trim(); // Atama yapmazsak degisiklik kalici olmaz.
		müsteriIsmi = müsteriIsmi.substring(0, 1).toUpperCase() +
									müsteriIsmi.substring(1).toLowerCase();
		// müsteriIsmi'nde yapilan degisikleri main method'a gönderebilmek icin RETURN TYPE'i void yerine variable'in data türüne uygun bir sekle döndürmeliyim.
		
		return müsteriIsmi;
	}

}
