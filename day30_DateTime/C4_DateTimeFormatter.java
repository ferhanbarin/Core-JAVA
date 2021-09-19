package day30_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C4_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDate bug�n = LocalDate.now();
		LocalDate date = LocalDate.of(2020, 5, 15);
		
		/*
         * yy: YILIN SON iKi RAKAMI
         * yyyy : yilin tamamini
         * y : yilin tamamini
         * M : ay sirasini verir TEMMUZ icin : 7
         * MM:  ay sirasini veriri TEMMUZ icin : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamamini verir
         */
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy"); // 02/8/21
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy"); // 15/05/20
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yy"); // 02/Agu/21
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd$M$yyyy"); // 15$5$2020
		
		System.out.println(dtf.format(bug�n)); // 02/8/21
		System.out.println(dtf1.format(date)); // 15/05/20
		System.out.println(dtf2.format(bug�n)); // 02/Agu/21
		System.out.println(dtf3.format(date)); // 15$5$2020
		
		// Kac yasindayiz?
		
		LocalDate dt = LocalDate.of(1997, 2, 28);
		System.out.println("Ferhan dt : " + dt);
		System.out.println("Bug�n�n tarihi : " + bug�n);
		Period yasim = Period.between(dt, bug�n);
		System.out.println("Ferhan beyin yasi : " + yasim);
		System.out.println(yasim.getYears()); // 24
		
	}	

}
