package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C7_List_07 {

	public static void main(String[] args) {
		
		// 100'den b�y�k ilk 20 fibonacci sayisini list olarak yazdirin. [Interview Question]
		
		int sayi1 = 0;
		int sayi2 = 1;
		int sayi3 = sayi1+sayi2;
		
		int count = 0;
		List <Integer> istenenSayilar = new ArrayList<>();
		
		
		do {
			sayi1 = sayi2;
			sayi2 = sayi3;
			sayi3 = sayi1+sayi2;
			
			if (sayi3>100) {
				istenenSayilar.add(sayi3);
				count++;
			}
			
		} while (count<20);
		
		System.out.println(istenenSayilar);
	
	}

}
