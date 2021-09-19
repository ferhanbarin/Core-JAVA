package day25_Constructor;

public class C3 {
	
	int sayi = 10;
	String isim = "Mehmet";
	
	// Ayni package'daki farkli class'lardan bi variable'lara ulasabiliriz.
	// Cünkü acces modifier yazmazsak default access modifier kullanilir. Acces modfier default ise ayni paketten heryerden kullanilabilir.
		
	public static void main(String[] args) {
	
	// sayi = 20; sayi degiskeni static olmadigi main method'dan icin kullanamam.
	//	deneme(); methodu static olmadigi icin main method'dan cagiramam.
		
	C3 obj1 = new C3();
	obj1.deneme();
	
	// Ayni class'da oldugumuz halde static olmadigi icin kullanamadigimiz variable ve method'lari obje olusturarak kullanabiliriz.
	

	}
	
	public void deneme() {
		
		System.out.println("Deneme methodu calisti.");
	}

}
