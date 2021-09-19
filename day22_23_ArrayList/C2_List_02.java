package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C2_List_02 {

	public static void main(String[] args) {
		
		List <Integer> sayilar = new ArrayList<>();
		
		sayilar.add(10);
		sayilar.add(20);
		
		System.out.println(sayilar.size());
		System.out.println(sayilar.isEmpty());
		System.out.println(sayilar);
		
		sayilar.add(30);
		sayilar.add(40);
		System.out.println(sayilar);
		
		// System.out.println(sayilar.remove(2)); 30
		// remove method'u iki türlü kullanilabilir.
		// 1- silmek istedigimiz elementin index'ini yazarsak o elementi siler ve delil olarak sildigi elementi bize döndürür.
		
		int silinenEleman = sayilar.remove(2);
		
		System.out.println(sayilar); // [10, 20, 40}
		
		sayilar.add(silinenEleman);
		System.out.println(sayilar); // [10, 20, 40, 30]
		
		// remove ikinci yöntem olarak direkt silmek istedigimiz degeri yazabiliriz.
		
		// sayilar.remove(20);
		// System.out.println(sayilar);
		// Eger listemiz sayilardan olusuyorsa biz silmesini istedigimiz elementi yazdigimizda java index olarak algilar. Ama String için böyle bir problem olmaz.
		
		List <String> isimler = new ArrayList<>();
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		System.out.println(isimler.remove("Zeki"));
		System.out.println(isimler);
		
		isimler.remove("Ayse");
		System.out.println(isimler);
		
		boolean sonuc = isimler.remove("Mehmet");
		
		if (sonuc) {
			System.out.println("Mehmet'i buldum ve sildim.");
		} else {
			System.out.println("Mehmet'i bulamadim dolayisiyla silemedim.");
		}
		
		isimler.remove(0);
		System.out.println(isimler); // []
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		System.out.println(isimler); // [Ali, Ayse, Zeki]
		
		isimler.removeAll(isimler);
		System.out.println(isimler); // []

	}

}
