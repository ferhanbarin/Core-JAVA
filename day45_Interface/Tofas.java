package day45_Interface;

public abstract class Tofas {
	
	public abstract void motor();
	public abstract void yakit();
	public void sunroof() { // Concrete method oldugu icin override etmek zorunlu degil.
		
		System.out.println("Bol günesli günlerde dikkatli kullan.");
	}

}
