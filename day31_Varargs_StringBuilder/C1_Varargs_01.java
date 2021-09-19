package day31_Varargs_StringBuilder;

public class C1_Varargs_01 {

	public static void main(String[] args) {
		
		// Verilen iki sayinin toplamini bulan bir method yaziniz.
		
		int sayi1 = 17;
		int sayi2 = 20;
		int sayi3 = 35;
		
		
		topla(17,20,35);
		ikiSayiTopla(sayi1,sayi2);
		ucSayiTopla(sayi1,sayi2,sayi3);

	}

	private static void topla(int... sayi) {
		
		int toplam = 0;
		for (int i : sayi) {
			toplam+=i;
		}
		
		System.out.println("Varargs toplam : " + toplam);
	}

	private static void ucSayiTopla(int sayi1, int sayi2, int sayi3) {
		
		System.out.println("Uc sayi toplami : " + "" + (sayi1+sayi2+sayi3));
		
	}

	private static void ikiSayiTopla(int sayi1, int sayi2) {
		
		System.out.println("Iki sayi toplami : " + "" + (sayi1+sayi2));
		
		
		
	}

}
