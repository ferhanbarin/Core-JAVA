package day19_Arrays;

import java.util.Arrays;

public class C1_Arrays_01 {

	public static void main(String[] args) {
		
		short arr1 [] = new short[5];
		System.out.println(arr1); // arr1 bir Array. Data türü non-primitive. Short Array'in degil, icine koyacagimiz degerlerin data türü.
								  // Eger non-primitive bir datayi direkt syso ile yazdirirsaniz JAVA arr1'in referans bilgisini yazdirir.
		
		// Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu  array’i yazdirin.
		
		
		// 1. yöntem, önce olusturup, sonra istedigim indexlere deger atiyorum.
		String isimler [] = new String[4];
		isimler[0] = "Ali";
		isimler[1] = "Veli";
		isimler[2] = "Ayse";
		isimler[3] = "Fatma";
		
		System.out.println(Arrays.toString(isimler));
		
		// 2. yöntem, hem olusturup hemde tüm indexlere deger atiyorum.
		String isimler2[] = {"Ali","Veli","Ayse","Fatma"};
		
		// Isimler Array'indeki Veli yerine Hasan yazalim.
		isimler[1] = "Hasan";
	//	isimler[5] = "Hakan"; // JAVA 5. index mi varmi yok mu bilmiyor. Syntax acisindan sorun olmadigi icin CTE hatasi vermiyor. 
							  // Ama RUN ettigimizde 5. index'i bulamadigi icin RTE hatasi verir.
		
		System.out.println(isimler.length); // 4
		
		System.out.println(isimler[3]); // Fatma
		System.out.println(isimler[1]); // Hasan
		
		// Tüm elemanlari yazdirma 1. YOL loop kullanma
		
		for (int i=0 ; i<isimler2.length ; i++) {
			System.out.print(isimler[i] + " ");
		}
		
		System.out.println();
		
		// 2. YOL Arrays class'indan yardim aliriz.
		
		System.out.print(Arrays.toString(isimler)); // Eger Array'i direkt yazdirmak isterseniz Arrays.toString() method'unu kullanmalisiniz.
													// Parametre olarak Array'in ismini yazmalisiniz.
		
		
	
		
		
	}

}
