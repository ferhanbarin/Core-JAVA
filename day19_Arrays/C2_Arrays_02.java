package day19_Arrays;

import java.util.Arrays;

public class C2_Arrays_02 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
		
		// Bir kez olusturdugum Array'in sonradan uzunlugunu degistirebilir miyim?
		// [0, 0, 0, 0, 0, 5]
		
		// arr[5]= 5;
		
		// Array'in length'i sonradan degistirilemez. Array'i kullanissiz yapanda bu özelligidir.
		
		arr[2] = 1;
		System.out.println(Arrays.toString(arr)); // [0, 0, 1, 0, 0]
		
		arr = new int[6]; // Bu ekleme yapmaz. Deger olarak 6 elementlik yeni array atar.
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]
		
		// ARRAY'in length'i DEGISTIRILEMEZ.

	}

}
