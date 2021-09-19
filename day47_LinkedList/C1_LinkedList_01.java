package day47_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C1_LinkedList_01 {

	public static void main(String[] args) {
		
		LinkedList <String> LL1 = new LinkedList(Arrays.asList("Erdem", "Mehmet", "Samet", "Said", "Yagmur"));
		System.out.println(LL1); // [Erdem, Mehmet, Samet, Said, Yagmur]
		
		
		LL1.add("Merve"); // ---> add yapilan node LinkedList'in sonuna ekler.
		System.out.println(LL1); // [Erdem, Mehmet, Samet, Said, Yagmur, Merve]
		
		
		LL1.add(2, "Faruk"); // ---> 2. index'e node eklenir.
		System.out.println(LL1); // [Erdem, Mehmet, Faruk, Samet, Said, Yagmur, Merve]
		
		
		LinkedList <String> LL2 = new LinkedList(Arrays.asList(":-)", ":-("));
		
		LL1.addAll(LL2); // LL1 sonuna LL2 node'lerini ekler.
		System.out.println(LL1); // [Erdem, Mehmet, Faruk, Samet, Said, Yagmur, Merve, :-), :-(]
		
		
		LL1.addFirst("Gayret"); // ---> Ilk index'e node ekler.
		System.out.println(LL1); // [Gayret, Erdem, Mehmet, Faruk, Samet, Said, Yagmur, Merve, :-), :-(]
		
		
		LL1.addLast("Basarili"); // ---> Son index'e node ekler.
		System.out.println(LL1); // [Gayret, Erdem, Mehmet, Faruk, Samet, Said, Yagmur, Merve, :-), :-(, Basarili]
		
		
		LL1.addAll(3, LL2); // --> 3. index'e collection obj LL2 ekler.
		System.out.println(LL1); // [Gayret, Erdem, Mehmet, :-), :-(, Faruk, Samet, Said, Yagmur, Merve, :-), :-(, Basarili]
		
		
		LL1.remove(); // Ilk node siler ve silenen node'u return eder. --> Öldür ve kalbini getir :)
		System.out.println(LL1); // [Erdem, Mehmet, :-), :-(, Faruk, Samet, Said, Yagmur, Merve, :-), :-(, Basarili]
		
		
		LL1.removeFirst(); // Ilk node siler ve silenen node'u return eder. --> Öldür ve kalbini getir :)
		System.out.println(LL1); // [Mehmet, :-), :-(, Faruk, Samet, Said, Yagmur, Merve, :-), :-(, Basarili]
		
		
		LL1.remove("Faruk"); // Faruk node'unu siler return True.
		System.out.println(LL1); // [Mehmet, :-), :-(, Samet, Said, Yagmur, Merve, :-), :-(, Basarili]
		
		
		LL1.remove(2); // 2. index'teki node siler ve node'u return eder.
		System.out.println(LL1); // [Mehmet, :-), Samet, Said, Yagmur, Merve, :-), :-(, Basarili]
		
		
		LL1.removeFirstOccurrence(":-)"); // Ilk görülen node silinir.
		System.out.println(LL1); // [Mehmet, Samet, Said, Yagmur, Merve, :-), :-(, Basarili]
		
		
		LL1.add(3, "Basarili"); // [Mehmet, Samet, Said, Basarili, Yagmur, Merve, :-), :-(, Basarili]
		
		LL1.removeLastOccurrence("Basarili"); // Son görülen node silinir.
		System.out.println(LL1); // [Mehmet, Samet, Said, Basarili, Yagmur, Merve, :-), :-(]
		
		
		
		LinkedList <Integer> LL3 = new LinkedList(Arrays.asList(1,2,3,4,5,6));
		
		LL3.remove(2); // 2 node'u degil 2. index'teki 3 node'u siler.
		System.out.println(LL3); // [1, 2, 4, 5, 6]
		
		
		// LL3.remove(33);
		// System.out.println(LL3); ---> IndexOutOfBoundsException 
		
		
		LL3.remove(LL3.indexOf(6));
		System.out.println(LL3); // [1, 2, 4, 5]
		
		
		LL1.removeAll(LL2); // LL1'den LL2 objesini siler.
		System.out.println(LL1); // [Mehmet, Samet, Said, Basarili, Yagmur, Merve]
		System.out.println(LL2); // [:-), :-(]
		
				
		System.out.println(LL1.get(4)); // Yagmur --> get(i) index'teki elemani return eder.
		
		
		System.out.println(LL1.element()); // Mehmet --> element() method'u list'in sadece ilk node'nu verir.
	

	}

}
