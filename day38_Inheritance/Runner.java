package day38_Inheritance;

public class Runner {

	public static void main(String[] args) {
		
		Cat c1 = new Cat(); // Parametresiz constructor ile obje olusturduk. Objenin data type Cat classindan.
		
		// Ayni isimli variable'lar call obj. call edilirken önce obj kendi class'indaki variable call edilir. Sonra parentindeki variable call edilir.
		
		System.out.println(c1.a); // 5 Animal.
		System.out.println(c1.c); // 9 kendi class c Mammal'dan degil.
		System.out.println(c1.d); // 5 kendi class.
		System.out.println(c1.m); // 4 Mammal.
		
		c1.mM(); // Animal Mammal  <--  Animal class call.
		c1.mC(); // Cat  <--  Cat class call.
		c1.mA(); // Mammal  <--  Mammal class call.
		
		// Method call edilirken ayni isimli method'larin hangisinin alinacagina constructor karar verir. Child'dan parente dogru hiyerasi yapilir. Babadan dedeye önce kimde bulursa onu alir.
		// Data Type ve Constructor farkli class'lar --> Parent obj = new Child();  -  Parent class'dan baslanir, child class'dan degil.
		
		Mammal c2 = new Cat("X"); // c2 obje'sinin kendi class'i Mammal.
		
		System.out.println(c2.a); // 5  <--  Animal class call.
		System.out.println(c2.c); // 7  <--  Mammal class call.
		System.out.println(c2.m); // 4  <--  Mammal class call.
		
		c2.mA(); // Mammal
		c2.mC(); // Cat  -->  ?
		c2.mM(); // Animal Mammal  
	
	}

}
