package day21_MultiDimensionalArrays;

public class C2_MDArrays_02 {

	public static void main(String[] args) {
		
		// Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana  yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
		
		int arr[][] = { {1,2,3},{4,5,6} };
		
		int carpim = 1;
		
		for (int i=0 ; i<arr.length ; i++) { // Outer Array icin.
			for (int j=0 ; j<arr[i].length ; j++) {
				carpim *= arr[i][j];
				
			}
		}
			System.out.println("Tüm elementlerin carpimi : " + carpim);
	}

}
