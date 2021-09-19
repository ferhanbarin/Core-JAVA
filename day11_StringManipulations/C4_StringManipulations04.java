package day11_StringManipulations;

public class C4_StringManipulations04 {

	public static void main(String[] args) {
		
		// .replace() => Verilen String’deki istenen karakter(ler)i istenen yeni karakter(ler) ile degistirir.
		
		String kkNo = "Java 123 #@";
		
		System.out.println(kkNo.replace(" ", ""));
		
		System.out.println(kkNo);
		
		// replaceAll() methoduyla yapalim.
		
		System.out.println(kkNo.replaceAll("\\s", "")); //  \\s =>  sadece SPACE
		System.out.println(kkNo.replaceAll("\\S", "*")); //  \\S =>  space olmayan hersey (bosluk disindaki tüm karakterler)
		System.out.println(kkNo.replaceAll("\\w", "-")); // \\w =>   harf veya rekamlarin hepsi
		System.out.println(kkNo.replaceAll("\\W", "#")); //  \\W =>  harf veya rakamlarin disindaki hersey
		System.out.println(kkNo.replaceAll("\\d", "0")); //  \\d =>  digit(rakamlar)in hepsi
		System.out.println(kkNo.replaceAll("\\D", "a")); //  \\D =>  digit (rakamlar)in disindaki hersey
		
		// syso icinde yapilan manipulation'lar asil String'i degistirmez.
		
		System.out.println(kkNo);
		
		kkNo = "1234 5698 1278 5687"; // atama yapinca kalici olarak degistirmis oluruz.
		
		System.out.println(kkNo);
		
		
		// replaceAll() => replace() methodu ile benzer olarak verilen String’deki istenene karakter(ler)i istenen yeni karakter(ler) ile degistirir.
		// Aralarindaki farklar;
		// * replace() methodunda char kullanilabilir, replaceAll()’da char kullanilamaz
		// ** replaceAll() methodunda Regular Expressions kullanilabilir.
		
		
		
	}

}
