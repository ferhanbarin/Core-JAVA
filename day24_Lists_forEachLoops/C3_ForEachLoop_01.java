package day24_Lists_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop_01 {

	public static void main(String[] args) {
		
		List <String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Ömer");

		
		// Bu listedeki isimlerden uzunlugu 4 harften fazla olan isimleri yazdiralim.
		
		// For-Each Loop index veya size'a bakmadan tek tek tüm elementleri bize getirir.
		
		for (String each : list1) {
			if (each.length() > 4) {
				System.out.println(each + " ");
			}
	
		}

	}

}
