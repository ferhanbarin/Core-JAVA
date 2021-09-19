package day42_Exceptions;

public class C5_Exceptions_05 {

	public static void main(String[] args) {
		
		int sayi = 34;
		String str = "1453";
		
	//	String str1 = sayi; CTE --> checked exception ClassCast.
		
		int okulNo = Integer.parseInt(str);
		System.out.println("Okul No : " + okulNo);
		System.out.println(str + 35); // 145335
		System.out.println(okulNo + 35); // 1488
		
		
		
		String str1 = "14a3";
	//	int strSayi = Integer.parseInt(str1); NumberFormatException unchecked.
		
		Object sayi3 = 45; // Object DataType JAVA'nin tüm class'larin parenti.
		String strSayi2 = (String)sayi3; // DataType Class casting --> büyük veri kücük konteyner atandi.
										 // Data türlerini casting yaparken uygun olmayan islem --> ClassCastException unchecked verir.
	
	}

}
