package day18_doWhileLoop_Scope;

public class C5_Scope_02 {
	
	// 7- Eger birden fazla local'de (method'da) kullanacaginiz variable varsa bunu class level'da olusturmalisiniz.
	// 8- Variable'nin static olup olmamasina nasil karar verirsiniz?
	// Bu sorunun cevabi variable'nin kullanilacagi local'lerle ilgilir.
	// Eger kullanilacak local static ise o zaman variable'i static yapmak zorundayiz.
	
	int sayiClass = 10;
	static int sayiClassStatic;

	public static void main(String[] args) {
		
	// 5- Class level'da olmayan variable'lara local variable denir.
	// 6- Local variable'lar static olarak tanimlanamaz.
	int sayiMain = 10;
	// System.out.println(sayiClass);
	sayiClassStatic++;
	
	// Local variable'lar deger atanmadan olusturulabilir. Ancak deger atanmadan KULLANILAMAZ.
	int sayi;
	sayi = 10;
	System.out.println(sayi);

	}
	
	public void method1() {
		
		// System.out.println(sayiMain);
		
	}
	
	public static void method2() {
		
		// System.out.println(sayiMain);
	}

}
