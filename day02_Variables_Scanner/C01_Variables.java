package day02_Variables_Scanner;

public class C01_Variables {

	public static void main(String[] args) {
		
		// 1- Farkli 3 data türünde variable olusturun ve bunlari yazdirin.
		
		String kelime = "Merhaba"; // Satirdaki kod sonunda mutlaka ; kullanilmalidir.
		
		System.out.println(kelime); // Kelimenin variable oldugunu anlar ve variable'in degerini yazdirir.
		
		System.out.println("kelime"); // "   " Yazildigi icin kelime yazdirir.
		
		
		int sayi = 1000;
		
		System.out.println(sayi);  // 20
		
		// Yazdirirken basina aciklama eklemek istersem
		// Girilen sayi : 20
		// Eger degisken ve aciklamayi birlikte yazdirmak istersek 
		// "  aciklama  " + variableIsmi
		
				
		System.out.println("girilen sayi : " + sayi);
		
		boolean tatildeMi = true;
		
		System.out.println(tatildeMi);
		
		// Konsolda bu sene tatile gittiniz mi? = True
		// bu sene tatile gittiniz mi? = True
		
		// Variable olmayan kisim: " bu sene tatile gittiniz mi? = "
		// Variabledan gelen kisim: True
		
		
		System.out.println("bu sene tatile gittiniz mi? = " + tatildeMi);
		
		/*
		 * 2- Isim ve soyisim icin iki variable olusturun ve bunlari
		 * Isminiz: Mehmet
		 * Soyisminiz: Bulutluoz
		 * seklinde yazdirin.
		 */
		 
		String name = "Ferhan";
		String surname = "Barin";
		
		System.out.println("isminiz : " + name);
		System.out.println("soyisminiz : " + surname);
		
		// 3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
		
		int sayi1 = 10;
		byte sayi2 = 5;
		
		
		System.out.println(sayi1 + sayi2);
		
		
		// Toplama isleminin basina aciklama yazmak istersek
		
		// iki sayinin toplami = 15
		
		
		System.out.println("iki sayinin toplami = " + (sayi1 + sayi2));
		
		// String ve sayisal islemleri birlikte yaptirdigimizda matematiksel islemi parantez icine alin
		
		
		// 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
		
		
		int sayi3 = 15;
		double sayi4 = 3.14; 
		
		System.out.println(sayi3 + sayi4);
		
		// toplam : 18.14
		
		System.out.println("toplam: " + (sayi3+sayi4));
		
		
		// 5- char data turunde bir variable olusturun ve yazdirin
		
		char karakter = '?';
		
		System.out.println(karakter);
		System.out.println("Girilen karakter: " + karakter);
		
		
		// 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin
		
		int sayi5 = 20;
		char harf = 'M';
		
		System.out.println(sayi + harf);  // 20M
		
		// char data türündeki degiskenler matematiksel islemlerde kullanilirsa ASCII tablosu devreye girer
		// JAVA o karakter yerine ASKII tablosundaki degeri kullanir.
		

	
	}

}
