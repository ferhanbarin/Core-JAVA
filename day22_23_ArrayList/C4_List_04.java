package day22_23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C4_List_04 {

	public static void main(String[] args) {
		
		// get() methodu ArrayList’deki istenen indexdeki elemani dondurur.
		
		// contains() methodu ArrayList’de bir elemanin var olup olmadigini kontrol eder. Eleman varsa true, yoksa false return eder.
		
		// Collections sort() : sort() methodu ArrayList’deki elemanlari kucukten buyuge veya alfabetik siraya gore dizer.
		
		// equals() methodu iki listteki ayni indexteki elemanlarin ayni olup olmadigini kontrol eder. Ayni indexteki tum elemanlar ayni ise true return eder, farkli ise false return eder.
		
		// clear() methodu ArrayList’teki tum elemanlari siler. Return type’i void’dir, hic bir sey donmez.
		
		
		// Verilen bir Array'de tekrar eden elementleri silip tekrarsiz yeni bir Array haline getirin.
		
		int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3};
		
		
		List <Integer> sayilar = new ArrayList<>();
		
		for (int i=0 ; i<arr.length ; i++) {
			if (!sayilar.contains(arr[i])) {
				
				sayilar.add(arr[i]);
			}
		}
		
		System.out.println(sayilar);
		Collections.sort(sayilar);
		System.out.println(sayilar);
		
		// Yeni bir Array olusturup bu elementleri yeni Array'e eklemeliyiz.
		// Yeni Array'in length'i 7 olacak.
		
		int yeniArr[] = new int[sayilar.size()];
		
		for (int i=0 ; i<yeniArr.length ; i++) {
			yeniArr[i] = sayilar.get(i);
			
		}
			System.out.println("Tekrarsiz Array : " + Arrays.toString(yeniArr));
		
	}

}
