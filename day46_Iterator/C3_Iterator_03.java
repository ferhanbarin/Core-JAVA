package day46_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C3_Iterator_03 {

	public static void main(String[] args) {
		
		List <String> myList = new ArrayList<>(Arrays.asList("I", "S", "T", "A", "N", "B", "U", "L")); // Ilk elemanina :-) ile update ediniz, elemanlarini sondan basa dogru yazdiriniz.
		
		ListIterator <String> IT = myList.listIterator(); // ListIterator Interface'den IT variable olusturuldu. Degerini myList'ten aldi.
		while (IT.hasNext()) {
		String temp = IT.next();
				
		if (!IT.hasNext()) {
			IT.set(":-)" + temp);
		}
		
		}
		
		while (IT.hasPrevious()) {
			String temp = IT.previous(); // Pointer öncesi elemani return eder ve pointer öncesine getirir.
			
			System.out.print(temp + " "); // :-)L U B N A T S I 
		}
		
		// ---> hasPrevious() ve previous() method'larinin calismasi icin öncesinde MUTLAKA hasNext() ve next() method'lari calistirilarak cursor(pointer) en sona getirilmelidir.
		
		/* "ITERATOR" ve "LISTITERATOR" arasindaki farklar;
		 
		 1) "ITERATOR" sadece hasNext(), next() ve remove() methodlarini icerir. 
		 2) "LIST ITERATOR" ise hasNext(), next(), remove(), hasPrevious(), previous(), add(), set() method'larini icerir.
		 3) "LIST ITERATOR" sadece list'ler icin kullanilir. "ITERATOR" ise tüm collection(list set map) elemanlari icin kullanilir.
		 4) "ITERATOR" sadece ileri gider, "LIST ITERATOR" hem ileri hem geri cift yönlü gitmek icin kullanilir.
		
		
		*/
	
 	}

}
