package day50_Maps;

import java.util.Hashtable;

public class C3_HashTable_01 {
	
 /*
	 1) HashMap ve TreeMap synchronized ve thread-safe degildir. Map'lar arasindan synchronized ve thread-safe olan bir map'e ihtiyac vardir. Bu yüzden HashTable olusturulmustur.
	 2) HashTable ne key icin ne de value icin "null" kullanmaz.
	 3) HashTable elemanlari rastgele siralar.
 */

	public static void main(String[] args) {
		
		Hashtable <Integer, String> ht = new Hashtable<>();
		
		ht.put(101, "Feridun");
		ht.put(102, "Samet");
		ht.put(103, "Ipek");
		ht.put(104, "IPEK");
		ht.put(105, "Harun");
		System.out.println(ht); // {105=Harun, 104=IPEK, 103=Ipek, 102=Samet, 101=Feridun}
		
		
		// ht.put(null, "Ali"); NullPointerException
		// ht.put(104, null); NullPointerException
		
		System.out.println(ht.size()); // 5

	}

}
