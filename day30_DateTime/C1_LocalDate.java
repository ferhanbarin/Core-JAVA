package day30_DateTime;

import java.time.LocalDate;

public class C1_LocalDate {

	public static void main(String[] args) {
		
		LocalDate Tarih = LocalDate.now(); // Tarih isminde obj creat ettik. TRICK > New anahtari kullanilmaz.
		System.out.println("Bugünün tarihi : " + 	Tarih);
		
		System.out.println("Bugünden 21 gün sonrasi : " + Tarih.plusDays(21)); // 2021-08-23
		
		System.out.println("Bugünden 3 yil sonrasi : " + Tarih.plusYears(3)); // 2024-08-02
		System.out.println("Bugünden 3 gün 5 ay 2 yil sonrasi : " + Tarih.plusDays(3).plusMonths(5).plusYears(2)); // 2024-01-05
		System.out.println("Bugünden 40 gün öncesi : " + Tarih.minusDays(40)); // 2021-06-23
		System.out.println("Bugünün 5 yil öncesi, 2 ay sonrasi, 3 hafta ertesi : " + Tarih.minusYears(5).plusMonths(2).plusWeeks(3)); // 2016-10-23
		
		// localDate classindan üretilen obj method chain kuralina uyar ve methodlar ayni (homojen) olmak zorunda degildir. Örnek: 17. satir.
		
		System.out.println(Tarih.getDayOfMonth()); // 2
		System.out.println(Tarih.getDayOfWeek()); // MONDAY
		System.out.println(Tarih.getMonthValue()); // 8
		System.out.println(Tarih.getMonth()); // AUGUST
		
		LocalDate dogumGünDate = LocalDate.of(1997, 2, 28);
		System.out.println("Dogum tarihi : " + dogumGünDate); // 1997-02-28
		System.out.println("Dogum günü : " + dogumGünDate.getDayOfWeek()); // FRIDAY
		System.out.println(Tarih.isAfter(dogumGünDate)); // true
		System.out.println(Tarih.isBefore(dogumGünDate)); // false
		
		System.out.println("Bugün artik yil mi : " + Tarih.isLeapYear()); // false
		

	}

}
