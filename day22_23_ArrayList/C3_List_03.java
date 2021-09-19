package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C3_List_03 {

	public static void main(String[] args) {
		
		// set() methodu ArrayList’de var olan bir elemani degistirmeye yarar.
		// NOT: set() method’u add() method’u yerine kullanilamaz. Olmayan bir index ile set() kullanilirsa exception verir.
		
		List <String> isimler = new ArrayList<>();
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		isimler.set(1, "Fatma");
		System.out.println(isimler);
		
		System.out.println(isimler.set(2, "Mehmet"));
		System.out.println(isimler);

	}

}
