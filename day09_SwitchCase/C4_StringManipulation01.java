package day09_SwitchCase;

import java.util.Locale;

public class C4_StringManipulation01 {

	public static void main(String[] args) {
		
		String isim = "Ferhan";
		String soyisim = "Barin";
		
		System.out.println(isim + " " + soyisim);
		
		System.out.println(isim.concat(" ").concat(soyisim));
		
		
		
		System.out.println(isim.charAt(2));
		System.out.println(isim.charAt(4));
		System.out.println(isim.charAt(5)); // Olmayan index yazilirsa java error verir.
											// Burada syntax acisindan bir hata yok.
		
		// Anca JAVA calismaya basladiktan sonra isim variable'na degeri atiyor ve 5. index'in olmadigini ancak 18. satira gelince farkediyor.
		// Bu tür hatalari JAVA ancak RUN ettigimizde farkkettigi icin bunlara Run Time Error RTE denir.
		
		// int sayi = isim; // Biz kodu yazar yazmaz Java Kodu compile (derleme) der.
						// Eger syntax hatasi varsa JAVA bunu hemen farkeder ve altini cizer ve alti cizili bölümü düzeltmeden kodu calistiramayiz.
						// Compile Time Error denir. CTE
		
		String str = "FIRAT";
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		
		
	}

}
