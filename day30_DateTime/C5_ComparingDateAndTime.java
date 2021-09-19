package day30_DateTime;

import java.time.LocalDate;

public class C5_ComparingDateAndTime {

	public static void main(String[] args) {
		
		LocalDate bugün = LocalDate.now();
		LocalDate date = LocalDate.of(2021, 8, 15);
		
		int fark = bugün.compareTo(date);
		System.out.println(bugün);
		System.out.println(date);
		System.out.println(fark); // 1: Karsilastirilan iki tarihin en büyük parcasinin farkini verir.
		

	}

}
