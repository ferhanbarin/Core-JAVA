package day38_Inheritance;

public class Mammal extends Animal {
	
	public int c = 7;
	public int m = 4; // Parenti ile ayni. (Animal)
	
	public void mA() { // Method  |  Parenti ile ayni. (Animal)
		
		System.out.println("Mammal");
	}
	
	public void mC() { // Method.
		
		System.out.println("Cat" + "Mammal");
	}
	
	
	public Mammal() { // Parametresiz Constructor.
		
		this('A');
		System.out.println("Parametresiz Mammal Constructor.");
	}
	
	public Mammal(char c) { // Parametreli Constructor.
		
		super(34); // Parentten (Animal) parametreli constructor call.
		System.out.println("Char Parametreli Mammal Constructor.");
	}

}
