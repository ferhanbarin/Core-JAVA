package day50_Maps;

import java.util.HashMap;

public class C5_Example_01 {
	
	// Ad ve soyad bulunduruan iki ayri array'i bir map' ekleyip yazdiriniz.  Input : {"Ahmet", "Ahmet Can", "Haluk"};  {"Seref", "Erdem", "Bilgin"};
  
	public static void main(String[] args) {
		
		String[] isim = {"Ahmet", "Ahmet Can", "Haluk"};
		String[] soyisim = {"Seref", "Erdem", "Bilgin"};
		
		HashMap <String, String> adSoyad = new HashMap<>();
		
		for (int i=0 ; i<isim.length ; i++) {
			adSoyad.put(isim[i], soyisim[i]);
		}
			System.out.println(adSoyad); // {Ahmet=Seref, Ahmet Can=Erdem, Haluk=Bilgin}
	}

}
