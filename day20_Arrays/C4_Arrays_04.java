package day20_Arrays;

import java.util.Arrays;

public class C4_Arrays_04 {

	public static void main(String[] args) {
		
		String str = "Java, candir.";
		
		// split method'u bize bir array d�ner. D�nen Array'i ya direkt yazdirmaliyiz.
		
		System.out.println(Arrays.toString(str.split(",")));
		
		// Veya method'dan d�nen String barindiran bir Array oldugundan bir Array olusturup ona assing edebiliriz.
		
		String b�l�nm�sKelimeArray[] = str.split(",");
		System.out.println(b�l�nm�sKelimeArray[1]);
		
		
		String b�l�nm�sKelimeArray2[] = str.split("a");
		System.out.println(Arrays.toString(b�l�nm�sKelimeArray2));
		System.out.println(b�l�nm�sKelimeArray2.length);
		
		String b�l�nm�sKelimeArray3[] = str.split(""); // String'i karakterlere ayirir.
		System.out.println(Arrays.toString(b�l�nm�sKelimeArray3));
		
		
		String c�mle = "Java ogren, rahat yasa"; // C�mle kac kelimeden olusur?
		
		String kelimeArrayi[] = c�mle.split(" ");
		System.out.println(Arrays.toString(kelimeArrayi));
		System.out.println("C�mledeki kelime sayisi : " + kelimeArrayi.length);
		
		// Harf sayisini nasil buluruz?
		
		String c�mle2 = c�mle.replaceAll("\\W", "");
		System.out.println(c�mle2);
		System.out.println(c�mle2.length());
		
		String harfArrayi[] = c�mle2.split("");
		System.out.println(harfArrayi.length);


	}

}
