package day30_DateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C2_LocalTime {

	public static void main(String[] args) {
		
		LocalTime zaman = LocalTime.now();
		
		System.out.println("Aktuel zaman : " + zaman);
		LocalTime time1 = LocalTime.of(12, 35, 23);
		System.out.println(time1); // 12:35:23
		
		System.out.println("Su zamandan 2 saat ileri 34 dk geri 45 sn ileri : " + zaman.plusHours(2).minusMinutes(34).plusSeconds(45));
		
		for (int i=0 ; i<10000 ; i++) {
			System.out.print(i);
		}
		
		LocalTime zaman2 = LocalTime.now();
		System.out.println();
		System.out.println(zaman2);
		
		// Ulke saatleri hesaplama:
		
		ZonedDateTime baskaUlke = ZonedDateTime.now(ZoneId.of("Europe/Helsinki"));
		System.out.println(baskaUlke);
	}

}
