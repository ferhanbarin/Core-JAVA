package day27_StaticKeyword;

public class C3_StaticKeyword {
	
	static int sayi = 15;
	String str = "Java";

	public static void main(String[] args) {
		
		/*
		 Bir method veya variable'i static yapmanin avantaji;
		 Static variable ve method'lara ulasmak istedigimizde classIsmi.methodIsmi yazmamiz yeterli olur.
		 Ornegin Array'lerde kullandigimiz Arrays class'i altindaki toString() method'u static olarak java developerlari tarafindan hazirlanmis oldugu icin Arrays.toString() yazarak method'u kullanabiliyoruz.
		 Ancak variable'lari static yapmak biraz riskli. Mesela bir okul uygulamasinda okul ismini static variable yaparak olusturursak avantaj olarak her yerden rahatlikla okul ismine ulasabiliriz.
		 Ama ögrenci objelerinden veya ögretmen objelerinden biri üzerinden okul adi degistirilirse, tüm ögrenciler ve tüm ögretmenler icin okul adi kalici olarak degismis olur. 
		 Buda uygulama icin istenmeyen bir durumdur.
		 */
		
		sayi = 20;
		// str = "static oan main method'dan instance variable'a direkt ulamazsin."
		staticMethod();
		// staticOlmayanMethod(); // Main method static olmayan method'u cagiramaz.
		
		System.out.println(C1.sayi2); // 0
		
		// JAVA RUNTIME PROGRAMDIR. HANGI CLASS'DA RUN TUSUNA BASARSANIZ O CLASS CALISIR.

	}
	
	public static void staticMethod() {
		
		System.out.println("Static variable'lar gökteki ay gibidir.");
		sayi = 30;
		// str = "Burdan ulasilamaz."
	}
	
	public void staticOlmayanMethod() {
		
		System.out.println("Static olmayan method calisti.");
		
		staticMethod(); // Static method'lara her yerden cagirilabilir.
		sayi = 25; // Static variable'lara her yerden ulasilabilir ve deger atanabilir.
		str = "static olmayan method'dan static olmayan variable'a ulasabilirim.";
		
	}

}
