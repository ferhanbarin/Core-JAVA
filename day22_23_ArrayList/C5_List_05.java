package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C5_List_05 {

	public static void main(String[] args) {
		
		// 200'e kadar olan fibonacci sayilarini bir list olarak yazdirin. [Interview Question]
		
		List <Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		
		System.out.println(fibonacci);
		
		int sayi = 0;
		int i = 1;
		
		while (sayi<200) {
			
		sayi = fibonacci.get(i)+fibonacci.get(i);
		if (sayi<200) {
		fibonacci.add(sayi);
		}
		
		i++;
			
		}
		
		System.out.println(fibonacci);


	}

}
