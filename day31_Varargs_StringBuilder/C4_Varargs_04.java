package day31_Varargs_StringBuilder;

public class C4_Varargs_04 {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9};
		arrTopla(arr);
		varargsTopla(1,3,5,7,9);
		
		System.out.println("Array Toplami : " + arrTopla(arr));
		System.out.println("Varargs toplam : " + varargsTopla(1,3,5,7,9));
		System.out.println("Varargs'in Array parametreli toplami : " + varargsTopla(arr));
		
		// Varargs array gibi davrandigi icin herhangi bir arrayi parametre olarak alabilir.
	}

	

	// Array elemanlari toplayan method.
	private static int arrTopla(int[] arr) {
		
		int topla = 0;
		
		for (int each : arr) {
			topla+=each;
		}
	
		return topla;
	}
	
		// Varargs elemanlari toplayan method.
	private static int varargsTopla(int... i) {
		
		int toplam = 0;
		for (int w : i) {
			toplam+=w;
			
			
		}
			return toplam;
	}
	
}
