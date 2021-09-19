package day05_Wrapper_Concatenation;

public class C1_WrapperClass {

	public static void main(String[] args) {
		
		String isim = "Mehmet";
		int sayi = 10;
		
		System.out.println(isim.charAt(2)); // H
		
		// Isim dedigimizde bircok method listeleniyor, c�nk� isim variable'nin data t�r� String ve String non-primitive'dir.
		// Non - Primitive deger'in yaninda method'lar vardir.
		// sayi. sayi variable'nin data t�r� int ve int primitive'dir. Primitive data t�rleri sadece value'ya sahiptirler ve method'lari yoktur.
		// JAVA primitive data t�rleri icin de method'larin kullanilabilmesi icin her primitive data t�r� icin bir WRAPPER CLASS olusturmustur.
		// ************************************************************************************************************************************************************
		
		
		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE); // INT alabilecegi maximum deger.
		System.out.println(sayi2.MIN_VALUE); // INT alabilecegi minimum deger.
		
		// short'un min ve max degerlerini yazdirin.
		
		Short sayi3 = 15;
		
		System.out.println(sayi3.MAX_VALUE);
		System.out.println(sayi3.MIN_VALUE);
		
		
		// Wrapper Class kullanimina bir �rnek verelim;
		
		String okulNo = "858";
		
		// Eger String bir veriable sadece sayilardan olusuyorsa, bu String'i int'a cevirebiliriz.
		
		int okulNOSayiOlarak = Integer.parseInt(okulNo);
		
		// System.out.println(okulNo++); okulNo String olarak tanimlandigi icin matematiksel islem yapilamaz.
		
		System.out.println(++okulNOSayiOlarak);
		
		
		Character basHarf = 'a';
		System.out.println(basHarf.charValue()); // a
		
				
	}

}
