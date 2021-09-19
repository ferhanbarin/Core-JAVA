package day32_StringBuilder;

import java.time.LocalTime;

public class C2_StringBuilder_02 {

	public static void main(String[] args) {
		
		// 1000 kere donecek bir loop yazalim. Loop'da String ve StringBuilder kullanip. Oncesinde ve sonrasinda zaman alalim. Hizlarini karsilastiralim.
		
		String s = "";
		StringBuilder sb = new StringBuilder();
		
		LocalTime lt = LocalTime.now();
		
		System.out.println("String öncesi zaman : " + lt);
		
		for (int i=0 ; i<=1000 ; i++) {
			s+=i;
		}
			System.out.print(s);
			
			System.out.println();
			
			
		LocalTime lt2 = LocalTime.now();
		
		System.out.println("String sonrasi SB öncesi zaman : " + lt2);
		
		for (int i=0 ; i<=1000 ; i++) {
			sb.append(i);
		}
			System.out.print(sb);
			
			System.out.println();
			
			
			LocalTime lt3 = LocalTime.now();
			
			System.out.println("SB sonrasi zaman : " + lt3);
	}

}
