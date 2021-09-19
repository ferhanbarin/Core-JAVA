package day29_PassByValue_MutableClass;

public class C4_ImmutableClasses_02 {

	public static void main(String[] args) {
		
		String A = "Ali";
		String B = "Ali";
		String C = B + ""; // C'nin degeri sonucta yine sadece Ali olsa da Conctenation oldugundan JAVA risk almaz ve yeni bir obje olusturur.
		String D = C;
		
		
		// equals method'u sadece icerige bakar. Icerik hepsinde Ali oldugundan equals iki satirda da true döner.
		
		System.out.println(A.equals(C)); // True
		System.out.println(A.equals(B)); // True
		System.out.println(D.equals(C)); // True
		
		// == hem icerige hemde referansa bakar. Dolayisiyla A==C false verir. 
		// A ve B objesi farkli objeler oldugu halde nicin A==B true döndü?
		
		System.out.println(A==C); // False
		System.out.println(A==B); // True
		System.out.println(D==C); // True
		
		String E = new String("Ali");
		// Aslinda String non-primitive oldugundan new kelimesini kullanmak gerekir.
		// Ama String cok kullanildigi icin String'e özel olarak new kelimesi kullanilmadan da yeni String olusturabiliriz. | String isim = "Ali";
		System.out.println("new ile olusturdugum E degiskeni : " + E);
		
		String F = new String("Ali");
		System.out.println(E.equals(F)); // True
		System.out.println(E==F); // False
		
		
	}

}
