package day24_Lists_forEachLoops;

public class C4_ForEachLoop_02 {

	public static void main(String[] args) {
		
		// Soru 1) Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		
		int arr[] = {2,4,5,7,8,1,23};
		int carpim = 1;
		
		for (int each : arr) {
			carpim*=each;
		}
		
		System.out.println("Array'in elemanlarinin carpimi : " + carpim);
		
		int count = 1;
		carpim = 1;
		
		// Her adimda carpim sonucunu görmek istesem.
		
		for (int each : arr) {
			carpim*=each;
			System.out.println(count + ". adimdaki carpim " + carpim);
			count++;
		}
	}

}
