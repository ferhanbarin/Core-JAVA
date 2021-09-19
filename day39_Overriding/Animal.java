package day39_Overriding;

public class Animal {
	
	public void Beslenme() {
		
		System.out.println("Tüm hayvanlar beslenir.");
	}
	
	protected void Tatli() {
		
		System.out.println("Trilece");
	}
	
	protected String Icecek() {
		
		System.out.println("Nigde Gazozu");
		
		return "Ohhh";
	}
	
	public Integer Topla() {
		
		return 34+6;
	}
	
	public Animal Fatih() {
		
		return new Animal();
	}

}
