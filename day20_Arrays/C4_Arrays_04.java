package day20_Arrays;

import java.util.Arrays;

public class C4_Arrays_04 {

	public static void main(String[] args) {
		
		String str = "Java, candir.";
		
		// split method'u bize bir array döner. Dönen Array'i ya direkt yazdirmaliyiz.
		
		System.out.println(Arrays.toString(str.split(",")));
		
		// Veya method'dan dönen String barindiran bir Array oldugundan bir Array olusturup ona assing edebiliriz.
		
		String bölünmüsKelimeArray[] = str.split(",");
		System.out.println(bölünmüsKelimeArray[1]);
		
		
		String bölünmüsKelimeArray2[] = str.split("a");
		System.out.println(Arrays.toString(bölünmüsKelimeArray2));
		System.out.println(bölünmüsKelimeArray2.length);
		
		String bölünmüsKelimeArray3[] = str.split(""); // String'i karakterlere ayirir.
		System.out.println(Arrays.toString(bölünmüsKelimeArray3));
		
		
		String cümle = "Java ogren, rahat yasa"; // Cümle kac kelimeden olusur?
		
		String kelimeArrayi[] = cümle.split(" ");
		System.out.println(Arrays.toString(kelimeArrayi));
		System.out.println("Cümledeki kelime sayisi : " + kelimeArrayi.length);
		
		// Harf sayisini nasil buluruz?
		
		String cümle2 = cümle.replaceAll("\\W", "");
		System.out.println(cümle2);
		System.out.println(cümle2.length());
		
		String harfArrayi[] = cümle2.split("");
		System.out.println(harfArrayi.length);


	}

}
