package day27_StaticKeyword;

public class C2_Runner {

	@SuppressWarnings("static-access") // Bu main method'da static access ile ilgili isleyisi bozmayan kücük bir hata var ve ben bunu onayliyorum. ==> SATIR NO: 32 & 38 icin.
	public static void main(String[] args) {
		
		// C1'deki variable'lara ulasmak istersem ilk önce C1'deki variable'larin instance mi yoksa static mi olduguna bakmam gerekir.
		// Ornegin sayi ve str instance variable'lardir, dolayisiyla onlara obje üzerinden ulasabilirim.
		
		C1 obj1 = new C1();
		System.out.println(obj1.str); // Yasasin eclipse
		
		obj1.str = "Yasasin Ferhan";
		System.out.println(obj1.str); // Yasasin Ferhan
		
		C1 obj2 = new C1();
		System.out.println(obj2.str); // Yasasin eclipse
		
		
		// sayi2 variable'i static oldugu icin obj'ye IHTIYAC DUYULMAZ.
		
		System.out.println(C1.sayi2); // 0
		
		C1 obj3 = new C1();
		
		obj3.sayi2 = 27; // CTE vermez... - Ancak altini sari cizer ve satir numarasina ünlem koyar. - Cünkü JAVA daha kisa ve emin bir yol varken nicin obje üzerinden ulastin diye sikayet eder.
						 // Bu kodun calismasi icin engel degildir onun icin CTE vermez. Fakat gereksiz bir islem oldugundan JAVA bizi uyarir.
		
		System.out.println(obj3.sayi2); // 27
		
		C1.sayi2 = 34; // Static variable'lara class ismi.variable ismi yazilarak ulasilabilir. Buna static way denir.
		System.out.println(C1.sayi2); // 34 - Static variable'lar ulasabilen her obje ve her class icin ortaktir. - Okul adi gibi.
		
		System.out.println(obj2.sayi2); // 34 
												// Static variable'lar bir kere degisirse tüm objeler icinde degisir.
		System.out.println(obj1.sayi2); // 34
		
	
		

	}

}
