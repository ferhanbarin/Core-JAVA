package day30_DateTime;

import java.time.LocalDate;

public class C5_ComparingDateAndTime {

	public static void main(String[] args) {
		
		LocalDate bug�n = LocalDate.now();
		LocalDate date = LocalDate.of(2021, 8, 15);
		
		int fark = bug�n.compareTo(date);
		System.out.println(bug�n);
		System.out.println(date);
		System.out.println(fark); // 1: Karsilastirilan iki tarihin en b�y�k parcasinin farkini verir.
		

	}

}
