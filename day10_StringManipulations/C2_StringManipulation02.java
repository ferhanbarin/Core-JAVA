package day10_StringManipulations;

public class C2_StringManipulation02 {

	public static void main(String[] args) {
		
		String str = "Java güzeldir";
		System.out.println(str.length()); // 13
		
		// length String'deki toplam karakter sayisini verir.
		
		String str2 = "";
		System.out.println(str2.length()); // 0
		
		str2 = null;
		
		// System.out.println(str2.length()); Hata verir.
		
		// str'in son harfinin index'i nedir? str'in uzunlugu: 13 - son harfin index'i: 12
		
		String str3 = "aasdadadafadasd,afadfasdasdasdaaffasdfafasdasd,gasdagsdbvvbASDAS DSDADASDSADASDSAD;DSAFASDASDASD.";
		
		// str'ün son harfinin index'i ==> str3.length()-1
		
		System.out.println(str3.length()-1);
		
		
		
		

	}

}
