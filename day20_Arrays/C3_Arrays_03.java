package day20_Arrays;

import java.util.Arrays;

public class C3_Arrays_03 {

	public static void main(String[] args) {
		
		// Verilen bir Array'i büyükten kücüge sirayalan bir method yaziniz.
		
		int arr[] = {3, 15, 10, 11, 9};
		
		arr = arrayiSirala(arr);
		System.out.println("Siralanmis hali : " + Arrays.toString(arr));
		
		// System.out.println(Arrays.toString(arrayiTerstenSirala(arr))); // Sonucu sadece yazdirmak icin.
		
		arr = arrayiTerstenSirala(arr);
		System.out.println("Tersten siralanmis hali : " + Arrays.toString(arr));
	
	}

	private static int[] arrayiTerstenSirala(int[] arr) {
		
		int temp[] = new int[arr.length]; // Eski Array ile ayni uzunlukta bir Array olusturdum.
		
		for (int i=0 ; i<temp.length ; i++) {
			temp[i] = arr[arr.length-1-i];
			
		}
		// temp Array'i istedigim gibi arr'nin ters siralanisi oldu. Bunu main method'a döndürmek icin return gerekli.
		
		return temp;
	}

	private static int[] arrayiSirala(int[] arr) {
		
		// Öncelikle Array'i kücükten büyüge siralamaliyiz.
		
		Arrays.sort(arr);
		
		return arr;
	}

}
