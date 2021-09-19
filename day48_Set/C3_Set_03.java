package day48_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class C3_Set_03 {
	
	// Elemanlari alfabetik sirada dizen ve tekrarsiz bir collection elde etmek isterseniz ne kullanirsiniz? Cevap: TreeSet
	// Soru: Ama TreeSet cok yavastir. Nasil bir cözüm bulabilirsin? Cevap: HashSet olustururum, elemanlari HashSet'e eklerim. 
																			//Sonra HashSet'i TreeSet'e ceviririm böylece tekrarsiz ve alfabetik sirada bir collection'a sahip olmus olurum.
	public static void main(String[] args) {
		
		long start1 = System.currentTimeMillis();
		TreeSet <String> ts1 = new TreeSet<>(Arrays.asList("Said", "Oguz", "Levent", "Oner", "Sedef"));
		long stop1 = System.currentTimeMillis();
		System.out.println("TreeSet ile hizi : " + (stop1-start1));
		
		
		
		long start = System.currentTimeMillis();
		
		HashSet <String> hs = new HashSet<>(Arrays.asList("Said", "Oguz", "Levent", "Oner", "Sedef"));
		System.out.println(hs); // Hurra --> [Sedef, Oguz, Levent, Oner, Said]
		
		TreeSet <String> ts = new TreeSet<>(hs);
		System.out.println(ts); // Alfabetik --> [Levent, Oguz, Oner, Said, Sedef]
		
		long stop = System.currentTimeMillis();
		System.out.println("HashSet ile hizi : " + (stop-start));
		
		
		
		
	}

}
