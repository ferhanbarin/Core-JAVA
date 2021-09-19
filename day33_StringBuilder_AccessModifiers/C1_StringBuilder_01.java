package day33_StringBuilder_AccessModifiers;

public class C1_StringBuilder_01 {

	public static void main(String[] args) {
		
				
		// String ile StringBuilder karsilastirmasi == equals ->  
		// SB'de equals method'u string class'indan farkli calisir. String class'indaki == operatörü ile ayni islemi yapar. Hem icerik hemde referans esitligine bakar.
		
		String s = "hayat";
		StringBuilder sb = new StringBuilder("hayat");
		
		// System.out.println(s == sb); -> farkli data type'lari karsilastirma operatörü derleyemez CTE verir.
		
		System.out.println(s.equals(sb)); // false 
		
		// SB toString method'u ile stringe cevrilerek string manipulations method'lari kullanilabilir.
		
		System.out.println(s.equals(sb.toString())); // true > string-string karsilastirmasi equals method'u normal calistirir. Sadece icerige bakar.
		System.out.println(sb.equals(sb.toString())); // false > sb-string karsilastirmasi equals method'u normal degil == gibi calisir. Sadece icerige degil, icerik ve referansa bakar.
		
		System.out.println(sb.toString().concat(" güzel")); // hayat güzel
		System.out.println(sb); // hayat
		
		System.out.println(sb.append(s,2,5)); // hayatyat -> sb'ye s'nin 2 ile 5 arasini ekledik. | s = "hayat";

		
		
		
		
		
		
		
		
		
	}

}
