package day18_doWhileLoop_Scope;

public class C4_Scope_01 {
	
	// 1- Main method'un disinda olusturulan variable'lara class level variable denir.
	
	int sayi1;
	int sayi2 = 10;
	
	String str1;
	String str2 = "Java";
	
	// 3- Static olmayan variable'lara static alanlardan ulasilamaz.
	
	static boolean anladinMi;
	// 2- Static olarak tanimlanan variable'lar class icinde her yerden kullanýlabilir. 
	// (Static olsun veya olmasin her method'dan ulasabiliriz ve kullabiiriz.)
	static boolean biliyormusun = true;
	static char harf;
	static String str;
	
	// 4- Class level'da olusturulan variable'lar (static olsun veya olmasin) deger atamadan da kullanilabilir.
	// Eger biz deger atamazsak JAVA class level'daki variable'lara default degerler atar.
	// Sayisal degerler icin = 0 atar. - boolean = false - string = null - char = ' '

	public static void main(String[] args) {
	
		
		for (int i=0 ; i<10 ; i++) {
			System.out.print(i + " ");
			i=10;
			String isim = "Mehmet";
		}
		
		// System.out.println(isim);
		// System.out.println(i); Scope disinda i'yi kullanamayiz. 
		// i = 10; // Scope disinda i'yi kullanamayiz.
		
		int sayi;
		// sayi++;
		// System.out.println(sayi);
		
		// method1(); Main Method static klübüne üye. Bu klübe üye olmayanlari muhatap almaz.
		method2();
		System.out.println("main method icinde anladinMi nin degeri : " + anladinMi);
		System.out.println("main method icinde harf in degeri : " + harf);
		System.out.println("main method icinde str nin degeri : " + str);
		
		
		// System.out.println(str1);


	}
	
	public void method1() {
		
		System.out.println("method1 calisti");
		sayi1 = 20;
		System.out.println(anladinMi);
		System.out.println(str1);
		
	}
	
	public static void method2() {
		System.out.println("method2 calisti.");
		System.out.println(biliyormusun);
		// System.out.println(sayi2);
}		
	}