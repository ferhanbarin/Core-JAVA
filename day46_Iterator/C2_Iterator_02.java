package day46_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C2_Iterator_02 {

	public static void main(String[] args) {
		
		List <String> myList = new ArrayList<>(Arrays.asList("T", "A", "R", "I", "K"));
		System.out.println("Ilk hali : " + myList);
		
		ListIterator <String> IT1 = myList.listIterator(); // listIterator Interface'den IT1 variable olusturduk. Degerini myList'ten assign edildi.
		while (IT1.hasNext()) {
		String temp = IT1.next();
			
		IT1.set(temp + ":-)");
		
		}
		
		System.out.println("Update hali : " + myList);
		System.out.println("");
		
		List <String> myList2 = new ArrayList<>(Arrays.asList("I", "S", "T", "A", "N", "B", "U", "L")); // Son elemanina :-) ile update ediniz.
		System.out.println("Ilk hali : " + myList2);
		
		ListIterator <String> IT2 = myList2.listIterator();
		while (IT2.hasNext()) {
		String temp = IT2.next();
				
		if (!IT2.hasNext()) {
		IT2.set(temp + " " + ":-)");
		}
		
		}
		
		System.out.println("Update hali : " + myList2);
	}
}
