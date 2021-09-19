package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C1_List_01 {

	public static void main(String[] args) {
		
		List <String> isimler = new ArrayList<>();
		
		isimler.add("Ali");
		System.out.println(isimler);
		isimler.add("Veli");
		isimler.add("Ayse");
		isimler.add("Fatma");
		// isimler.add("Hasan,Kemal,Yasar"); // Sadece 1'er 1'er ekleme yapabiliriz.
		
		System.out.println(isimler);
		
		// Özel bir index'e eklemek isterseniz, o zaman index'li add method'unu kullanmaliyiz.
		
		isimler.add(3, "Nihan");
		System.out.println(isimler);
		
		isimler.add(0, "Mehmet");
		System.out.println(isimler);
		
		List <String> yeniList = new ArrayList<>();
		
		yeniList.add("Firat");
		System.out.println(yeniList);
		
		// yeniList'in sonuna isimler listesini eklemek istersek;
		
		yeniList.addAll(isimler);
		System.out.println(yeniList);
		
		// Bir de int elementlerin oldugu liste olusturalim.
		
		List <Integer> sayilar = new ArrayList<>(); // int primitive, Integer wrapper class ve non-primitive
		
		sayilar.add(5);
		
		// Yeni list'e sayilar list'ini ekleyebilir miyim?
		// Farkli bir data türünden liste veya element ekleyemeyiz.
		
		// yeniList.addAll(sayilar);
		
		
		
		
		
		
		
		
		
		
	}

}
