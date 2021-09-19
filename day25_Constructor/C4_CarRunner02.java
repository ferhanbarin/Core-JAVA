package day25_Constructor;

public class C4_CarRunner02 {

	public static void main(String[] args) {
		
		// Ilk deger atamasi yapmadan bos bir car olusturmak istiyorsak, default constructor yeterli olur.
		
		C1 car1 = new C1();
		
		// Ama bu durumda car1'e ait tüm degerleri tek tek atamam gerekir.
		
		car1.ilanNo = 1003;
		car1.marka = "Nissan";
		car1.model = "Primera";
		car1.yil = 2005;
		car1.fiyat = 12000;
		
		System.out.println(car1.fiyat + ", " + car1.ilanNo + ", " + car1.marka + ", " + car1.model + ", " + car1.yil);
		
		// Eger objeyi olustururken deger de atamak istiyorsak, parametreli constructor olusturmamiz gerekir.
		
		C1 car2 = new C1(1004, "Honda", "Civic", 2010, 20000);
		
		System.out.println(car2.fiyat + ", " + car2.ilanNo + ", " + car2.marka + ", " + car2.model + ", " + car2.yil);
		
		
		C1 car3 = new C1(1005, "Mercedes", 50000);
		
		System.out.println(car3.fiyat + ", " + car3.ilanNo + ", " + car3.marka + ", " + car3.model + ", " + car3.yil);
		

	}

}
