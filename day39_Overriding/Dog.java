package day39_Overriding;

public class Dog extends Animal {
	
	@Override  // Annotation -> Mutlaka childe yazilir. Parent ve child method'larinda iliski kurar.
	public void Beslenme() {
		
		System.out.println("Köpekler kemik ile beslenir.");
	}

	@Override
	public void Tatli() {
		
		System.out.println("Fistik Sarma");
	}

	@Override
	protected String Icecek() {
		
		System.out.println("Tursu Suyu");
		
		return "Yarasin";
	}

	@Override
	public Integer Topla() {
		
		return 41+54;
	}

	@Override
	public Animal Fatih() {
		
		return new Dog();
	}
	
	
	
	
	
	

}
