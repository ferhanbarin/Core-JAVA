package day32_StringBuilder;

import java.util.Arrays;

public class C1_StringBuilder_01 {

	public static void main(String[] args) {
		
		// Fazladan ayrilan kapasiteyi silmek. -> obj.trimToSize();
		
		StringBuilder sb1 = new StringBuilder(); // bos bir sb1 creat ettik.
		
		// sb eleman ekleme -> obj.appent(obj);
		
		sb1.append("ferhan");
		System.out.println("sb1 ilk hali : " + sb1); // ferhan
		
		sb1.append(" barin");
		System.out.println("sb1 barin eklenmis hali : " + sb1); // barin
		
		System.out.println("sb1 uzunluk : " + sb1.length()); // 12
		System.out.println("sb1 kapasitesi : " + sb1.capacity()); // 16
		System.out.println("sb1 son hali : " + sb1.append(" güzel insan")); // ferhan barin güzel insan
		System.out.println("sb1 son hali kapasitesi : " + sb1.capacity()); // 34
		
		
		sb1.trimToSize();
		System.out.println(sb1.capacity()); // 24
		
		// Istenen karakterin indexini almak. -> obj.indexOf();
		
		System.out.println(sb1.indexOf("e")); // 1
		System.out.println(sb1.lastIndexOf("e")); // 16
		
		// Istenen bir characteri index'ine göre almak. -> obj.charAt();
		
		System.out.println("sb 7. karakter : " + sb1.charAt(7)); // b
		
		// Belirli bir araliktaki characteri almak. -> obj.subSequence();
		
		System.out.println("sb'nin 7 dahil 12 haric karakterleri : " + sb1.subSequence(7, 12)); // barin
		System.out.println("sb'nin 7 dahil tüm karakterleri : " + sb1.toString().substring(7)); // barin güzel insan | toString() cevirip substring methodunu kullandik.
		System.out.println(sb1.subSequence(7, sb1.length())); // barin güzel insan
		
		// sb'deki belli bir index'deki karakteri silmek.-> obj.delete(); | a dahil b haric arasi siler. obj.deleteCharAt(a); sadece  o karakteri siler.
		
		sb1.delete(3, 7); // ferbarin güzel insan
		System.out.println("3-7 arasi karakter silinmis hali : " + sb1); 
		
		sb1.deleteCharAt(2); // febarin güzel insan
		System.out.println("2. karakter silinmis hali : " + sb1); // febarin güzel insan
		
		// istenen index'i istenen karakteri ve karakterleri eklemek. -> obj.insert(index, char);
		sb1.insert(2, "r");
		System.out.println("2. index'e eklenmis hali : " + sb1); // ferbarin güzel insan
		
		sb1.insert(7, 3.14); // sb1 obj 7. index'ine 3.14 value eklendi. 
		System.out.println(sb1); // ferbari3.14n güzel insan
		
		int[] arr = {17,63,21};
		sb1.insert(9, Arrays.toString(arr)); // sb1'in 9. karakterinden itibaren arr verileri eklendi.
		System.out.println("sb1'e arr eklenmis hali : " + sb1); // sb1'e arr eklenmis hali : ferbari3.[17, 63, 21]14n güzel insan
		
		// Istenen index'deki characterin yerine birden fazla character eklemek -> obj.replace(a,b,"chactacterler");
		
		StringBuilder sb2 = new StringBuilder("Bugün hava cok sicak");
		System.out.println(sb2);
		sb2.replace(3, 8, "xxxxxx"); // 3 dahil 8 haric indexler arasini silip yerine xxxxxx koyduk.
		
		// 3 dahil 8 haric index arasina verilen xxxxxx stringi atar, ama atanacak string kisa atanacak index uzun olursa kalan index'teki karakterleri siler.
		
		System.out.println("sb2 son hali : " + sb2); // Bugxxxxxxva cok sicak
		
		System.out.println("Ozel durum : " + sb2.insert(5, "basarili", 2, 4)); 
		// 5: sb2'ye basarili ekleme baslangic index'i.
		// basarili : eklenecek string.
		// 2: eklenecek string'in baslagic index'i. -- > dahil
		// 4: eklenecek string'in bitis index'i. -- > haric
		
		
		// reverse methodu ters cevirir. -> obj.reverse(); 
		
		StringBuilder sb3 = new StringBuilder("Bugün hava cok soguk");
		sb3.reverse();
		System.out.println("sb3 ters cevrilmis hali : " + sb3);
		
		
		
	}

}
