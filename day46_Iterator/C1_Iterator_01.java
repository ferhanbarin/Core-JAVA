package day46_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C1_Iterator_01 {

	public static void main(String[] args) {
		
		List <String> myList = new ArrayList<>(Arrays.asList("F", "E", "R", "H", "A", "N"));
		System.out.println("List ilk hali : " + myList);
		
		// myList elemanlarini for loop kullanarak yazdiriniz...
		
		for (int i=0 ; i<myList.size() ; i++) {
			System.out.print(myList.get(i) + " ");
		}
		
		System.out.println("\n");
		// myList elemanlarini for each kullanarak yazdiriniz...
		
		for (String each : myList) {
			System.out.print(each);
		}
		
		System.out.println("\n");
		// myList elemanlarini for loop kullanarak her elemanin yanina :-) yazdirip update ediniz.
		
		for (int i=0 ; i<myList.size() ; i++) {
			System.out.print(myList.get(i) + ":-)" + " ");
		}
		
		System.out.println("\n");
		System.out.println(":-) sonrasi myList : " + myList); // for loop ile myList elemanlari :-) concat edildigi halde myList degismedi, update edilmedi.
		
		List <String> myList2 = new ArrayList<>(Arrays.asList("Y", "U", "N", "U", "S"));
		
		Iterator <String> IT1 = myList2.iterator(); // Iterator IT1 variable olusturduk. IT1 obje degildir. Interface'den obje olmaz.
		while (IT1.hasNext()) {
			IT1.next();
				IT1.remove();
		}
		
		System.out.println("myList2'nin Iterator sonrasi : " + myList2); // []

	}

}
