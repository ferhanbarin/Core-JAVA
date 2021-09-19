package day33_StringBuilder_AccessModifiers;

public class C4_AccessModifiersRunner_02 {

	public static void main(String[] args) {
		
		C3_AccessModifiers_01 obj1 = new C3_AccessModifiers_01(); // C2 class'indan obj1 olusturduk.
		
		System.out.println(obj1.defaultage); // 15
		System.out.println(obj1.protectedage); // 32
		System.out.println(obj1.publicage); // 61
		
		C5_AccessModifiers_03 name = new C5_AccessModifiers_03();
		
		System.out.println(name.protectedName); // Hakan Tetik
		System.out.println(name.defaultName); // Murat Bey
		System.out.println(name.publicName); // Dayanch Bey
		
		/*
	     Erisim alanlari :
	         1- Class in ici
	         2- Paketin ici
	         3- Projenin içi (yani diger paketler)
	         Public : Projenin her tarafindan erisilebilir, yani diger paketlerden bile. (Class, field, properties, metodlarda, constructor)
	         default: Yani hiç bir sey yazilmazsa, yani diger adi friendly : sadece paketin icindekiler erisebilir. (Class, field,properties metodlarda, constructor)
	         private: Sadece içinde bulundugu sinif tan erisilebilir.(field,properties, metodlarda)
	         
	              	  1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
	                  Baska class'lardan "private" class memler'lari (field,properties, metodlarda, constructor)kullanmak mumkun degildir.
	                  
	                  2) Baska package'lerden object olusturursaniz object olusturulan class'i import etmeniz gerekir.
	                  
	                  3) Baska package'lerden default class memberlara ulasamazsiniz. Ayni package'de iseniz
	                  ulasabilirsiniz. "default" ile "package private" es anlamlidir.
	                  
	                  4) public class member'lara herkes her yerden ulasabilir(farkli java projesi disinda).
	                  
	                  5) "protected" class member'lara ayni package icindeyseniz ulasabilirsiniz. Farkli package'de
	                   iseniz iki durum var : a)Child class iseniz ulasabilirsiniz.   b)Child class degil iseniz ulasamazsiniz.
	                   
	                  6) Class'larda da access modifier kullanilir. Ama sadece "public" ve "default" kullanilir.
	                   Class olustururken "private" veya "protected" access modifier kullanilmaz.
	           
	           */
		
		
		

	}

}
