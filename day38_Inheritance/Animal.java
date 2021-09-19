package day38_Inheritance;

public class Animal {
	
	public int a = 5;
	public int m;
	
	public void mA() { // Method.
		
		System.out.println("Animal");
	}
	
	public void mM() { // Method.
		
		System.out.println("Animal" + " Mammal");
	}
	
	
	public Animal() { // Parametresiz Constructor.
		
		System.out.println("Parametresiz Animal Constructor.");
	}
	
	public Animal(int i) { // Parametreli Constructor.
		
		System.out.println("INT Parametreli Animal Constructor.");
	}

}
