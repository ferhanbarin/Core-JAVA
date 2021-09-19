package day48_Set;

import java.util.Arrays;
import java.util.HashSet;

public class C4_Set_04 {
	
	   
    // Main method altinda bir double hashSet olusturunuz. Ve bu seti, adi setOlustur ve return tipi hashSet double olan ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    // Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak hashSetin degerlerinin toplamini alacaksiniz.
    // HashSetin degerlerinin toplamini alacaksiniz. --> Çikti--> sonuc = 44.69

	public static void main(String[] args) {
		
		HashSet <Double> hs = new HashSet<>(); // Gereksiz. Soruda söylendigi icini yazildi.
		
		double sonuc = toplaminiAl(setOlustur());
		
		System.out.println(sonuc); // 44.69

	}
	
	public static HashSet <Double> setOlustur() {
		
		HashSet <Double> hs = new HashSet<>(Arrays.asList(3.23, 3.10, 5.12, 10.12, 23.12 ));
		
		return hs;
	}
	
	
	public static Double toplaminiAl(HashSet <Double> dhs) {
		
		double toplam = 0;
		
		for (double each : dhs) {
			toplam+=each;
		}
		
		return toplam;
	}

}
