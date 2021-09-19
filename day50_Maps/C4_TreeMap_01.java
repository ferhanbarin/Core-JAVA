package day50_Maps;

import java.util.TreeMap;

public class C4_TreeMap_01 {
	
 /*
	 1) TreeMap elemanlari natural order'a g�re siralar.
	 2) TreeMap, Map'lerin en yavasidir.
	 3) TreeMap'lerde key'ler icin "null" kullanilmaz.
	 4) TreeMap'lerde value'lar icin "null" istenildigi kadar kullanilabilir.
	 5) TreeMap'ler synchronized ve thread-safe degildir.
 */

	public static void main(String[] args) {
		
		TreeMap <Integer, String> tm = new TreeMap<>();
		
		tm.put(101, "Alaaddin");
		tm.put(102, "Salih");
		tm.put(103, "Berk");
		tm.put(104, "S�leyman");
		tm.put(105, "EbikGabik");
		System.out.println(tm); // {101=Alaaddin, 102=Salih, 103=Berk, 104=S�leyman, 105=EbikGabik}
		
		// tm.put(null, "Topla"); --> NullPointerException
		
		tm.put(106, "Ali");
		System.out.println(tm); // {101=Alaaddin, 102=Salih, 103=Berk, 104=S�leyman, 105=EbikGabik, 106=Ali}
		
		
		System.out.println(tm.ceilingKey(101)); // 101 --> ceilingKey() method'u istenen key degerini (101) return eder.
		System.out.println(tm.ceilingKey(111)); // null --> ceilingKey() method'u istenen key degerini(111) map'de olmadigindan kendisinden b�y�k en k�c�k key olmadigi icin null return eder.
		
		System.out.println(tm.ceilingEntry(100)); // 101=Alaaddin --> ceilingEntry() method'u istenen key degerini(100) map'de olmadigindan kendisinden b�y�k en k�c�k(bir �st�) key return 101=Alaaddin return eder.
		
		System.out.println(tm.floorEntry(108)); // 106=Ali --> floorEntry() method'u istenen key degeri(108) map'de olmadigindan kendisinden en k�c�k b�y�k bir(bir alti) key return 106=Ali eder.
		
		System.out.println(tm.floorKey(111)); // 106 --> floorKey() method'u istenen key degerini(111) map'de olmadigindan kendisinden k�c�k en b�y�k(bir alti) key 106 return eder.
		
		System.out.println(tm.descendingKeySet()); // [106, 105, 104, 103, 102, 101] --> key'lerde azalan siralama ile return eder. B�y�kten k�c�ge siralar.
		System.out.println(tm.keySet()); // [101, 102, 103, 104, 105, 106] --> key'lerde artan siralama ile return eder. K�c�kten b�y�ge siralar.
		
		System.out.println(tm.headMap(108)); // {101=Alaaddin, 102=Salih, 103=Berk, 104=S�leyman, 105=EbikGabik, 106=Ali} --> Oncekileri.
		System.out.println(tm.headMap(104)); // {101=Alaaddin, 102=Salih, 103=Berk} --> Girilen key haric �nceki entry'leri return eder.
		System.out.println(tm.headMap(104, true)); // {101=Alaaddin, 102=Salih, 103=Berk, 104=S�leyman} --> Girilen key dahil �nceki entry'leri return eder.
		
		System.out.println(tm.tailMap(102)); // {102=Salih, 103=Berk, 104=S�leyman, 105=EbikGabik, 106=Ali} --> Girilen key dahil sonraki entry'leri return eder.
		System.out.println(tm.tailMap(102, false)); // {103=Berk, 104=S�leyman, 105=EbikGabik, 106=Ali} --> Girilen key haric sonraki entry'leri return eder.

	}

}
