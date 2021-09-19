package day44_AbstractClasses;

public abstract class Volvo { // Abstract class.
	
	public abstract void kapi(); // Abstract method.
		
	public abstract void motor(); // Abstract method.
	
	int fiyat;
	
	public void sunroof() { // Concrete method.
				
		System.out.println("Sunroof ile geceleri mehtaba dalip yoldan cikma.");
	}
}
