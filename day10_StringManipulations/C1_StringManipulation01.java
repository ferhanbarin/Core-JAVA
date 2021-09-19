package day10_StringManipulations;

public class C1_StringManipulation01 {

	public static void main(String[] args) {
		
		String name1 = "Ali Can";
		String name2 = "Ali Can";
		String name3 = name2 + "";
		String name4 = "Ali";
		String name5 = "Can";
		String name6 = name4 + " " + name5; // Ali Can
		
		// Verilen iki String’in iceriginin birbirine esit olup olmadigini kontrol eder.
		// Eger verilen Stringlerdeki tum karakterler (bosluk, buyuk harf, kucuk harf, ozel karakter tamamen ayni ise TRUE doner, aksi durumda (bir karakter bile farkli olsa) FALSE doner.
		
		
		System.out.println(name1.equals(name2)); // True - equals sadece içerige bakar.
		System.out.println(name1.equals(name3)); // True
		System.out.println(name2.equals(name6)); // True
		
		// Ilk degerler karsilastirildiginda degerler ayni oldugu icin sonuc hep true oldu.
		
		System.out.println(name1 == name2); // True
		System.out.println(name1 == name3); // False
		System.out.println(name2 == name6); // False
		
		// Farkli objeler ayni degeri aldiginda JAVA referanslara bakar. Bu referanslar ayniysa TRUE döndürür, yoksa FALSE döndürür.
		
		// Degerleri karsilastirmak ve süpriz yasamak istemiyorsaniz equals() kullanmalisiniz.
		
		String name7 = "ALI CAN";
		String name8 = "AlI CAN";
		String name9 = "ali can";
		String name10 = "AliCan";
		
		System.out.println(name1.equals(name7)); // False
		System.out.println(name1.equalsIgnoreCase(name7)); // True
		
		System.out.println(name7.equalsIgnoreCase(name9)); // True
		System.out.println(name8.equalsIgnoreCase(name9)); // True
		System.out.println(name9.equalsIgnoreCase(name10)); // False
		
		// equalsIgnoreCase() büyük kücük harf ayrimi yapmaz.
		// Verilen iki String degiskeni BUYUK / HARF kucuk harf farki gozetmeksizin karsilastirir.
		// Buyuk / kucuk harf farkliligi disinda herhangi bir karakter farkliligi oldugunda equals methodunda oldugu gibi FALSE dondurur.
		
		
		
				
		
	
		
	}	

}
