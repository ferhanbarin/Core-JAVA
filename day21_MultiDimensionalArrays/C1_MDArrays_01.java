package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class C1_MDArrays_01 {

	public static void main(String[] args) {
		
		int arr[][]= {{1},{2,3,4},{5,6,7,8}};
		
		// I. Yazdirma Yöntemi
		// Bu Array'i "Nested For Loop" ile yazdiralim.
		
		for (int i=0 ; i<arr.length ; i++) { // Bu Loop outer Array'in elementlerini getirir.
			
			// arr[i] >>  arr[0] - arr[1] - arr[2] verecek.
			
			for (int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
				System.out.println("");
			
		}
			// II. Yazdirma Yöntemi
		System.out.println(Arrays.deepToString(arr));

	}

}
