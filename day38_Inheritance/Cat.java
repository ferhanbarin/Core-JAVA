package day38_Inheritance;

public class Cat extends Mammal {
	
	public int c = 9; // Parenti ile ayni. (Mammal)
	public int d = 5; 
	
	public void mC() { // Method.
		
		System.out.println("Cat");
	}
	
	public Cat() { // Parametresiz Constructor.
		
		System.out.println("Parametresiz Cat Constructor.");

	}
	
	public Cat(String s) { // Parametreli Constructor.
		
		this();
		System.out.println(super.c); // Parentten variable getirdigimiz icin super. methodu kullanilir.
		System.out.println("String Parametreli Constructor.");
	}

}
