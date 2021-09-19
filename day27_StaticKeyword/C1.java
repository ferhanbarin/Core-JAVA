package day27_StaticKeyword;

public class C1 {
	
	int sayi = 10;
	String str = "Yasasin eclipse";
	static int sayi2;

	public static void main(String[] args) {
		
	// System.out.println(sayi); Sayi instance bir variable oldugu icin direkt main method'dan kullanilamaz.
	// Instance variable'lara obje üzerinden ulasabilirim.
	
		// Obje olusturmak icin constructor kullanmaliyim.
		// Bu class'da contructor var mi? - VAR.
		
		C1 obj1 = new C1();
		// Soldaki C1 : class ismi ve ayni zamanda data türüdür.
		// Sagdaki C1 : class ismi ile ayni ama yaninda () oldugu icin CONSTRUCTOR'dir.
		
		// obj1.sayi; CTE verir cünkü ya atama yapmaliyiz veya yazdirmaliyiz.
		
		System.out.println(obj1.sayi); // 10
		
		obj1.sayi = 44;
		// System.out.println(sayi); Obje ürettik diye instance'a direkt ulasamayiz. Mutlaka obje kullanmaliyiz.
		
		System.out.println(obj1.sayi); // 44
		
		C1 obj2 = new C1();
		System.out.println(obj2.sayi); // 10
		
		obj2.sayi = 34;
		
		System.out.println(sayi2);
		// JAVA Run Time programdir.

	}

}
