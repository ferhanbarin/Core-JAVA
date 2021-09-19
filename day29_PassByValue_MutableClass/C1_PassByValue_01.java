package day29_PassByValue_MutableClass;

import java.util.ArrayList;
import java.util.List;

public class C1_PassByValue_01 {

	public static void main(String[] args) {
		
		/*
		 Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup list elemanlarini artirmayi deneyelim
		- 1. Method’da elemanlari for each loop kullanarak artirin
		- 2. Method’da elemanlari set method’u kullanarak artirin
		- Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
		 */
		
		List <Integer> sayiList = new ArrayList<>();
		
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);
		System.out.println("Ilk olusturdugumuz liste : " + sayiList);
		
		
		forLoopIleArtir(sayiList);
		System.out.println("forLoop Method'undan Sonra List : " + sayiList);
		
		setIleArtir(sayiList);
		System.out.println("Set Method'undan Sonra Main Method Icinde List : " + sayiList);
		
	}

	private static void setIleArtir(List<Integer> sayiList) {
		
		// Set ile elemanlari arttiralim.
		
		for (int i=0 ; i<sayiList.size() ; i++) {
			sayiList.set(i, sayiList.get(i)+5);
		}
		
		// Loop'dan sonra listeyi yazdiralim.
		System.out.println("Set method'u icinde artirimdan sonra list : " + sayiList);
		
	}

	private static void forLoopIleArtir(List<Integer> sayiList) {
		
		// For Each Loop ile elemanlari arttiralim.
		System.out.print("For Each Loop ile arttirdigimiz elementler : ");
		
		for (Integer each : sayiList) {
				each+=5;
			System.out.print(each + " "); // 15 16 17
		}
		System.out.println("");
		System.out.println("For Each Loop'dan sonra list : " + sayiList); // [10, 11, 12]
		
		// ForEach Loop'da atama yapamadigim icin listeyi kalici olarak degistiremedim.	
		// For Loop kullanip get method'u ile elementleri cagirinca da atama yapamadim. Dolayisiyla for loop ile elementleri kalici olarak degistiremedik.
		
		
	}

}
