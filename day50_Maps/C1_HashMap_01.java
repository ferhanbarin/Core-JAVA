package day50_Maps;

import java.util.HashMap;

public class C1_HashMap_01 {

	public static void main(String[] args) {
		
		// !!! --> VALUE'ler UNIQUE olmak zorunda degildir fakat KEY'ler UNIQUE olmak zorundadir.
		
		HashMap <Integer, String> mp1 = new HashMap<>();
		
		mp1.put(101, "Levet");
		mp1.put(102, "Said");
		mp1.put(103, "Hasan");
		mp1.put(104, "Canan");
		mp1.put(105, "Ayse");
		
		System.out.println(mp1); // {101=Levet, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}
		
		
		mp1.put(101, "Harun"); // key value'si update edilir, eski veri üzerine yeni girilen veri yazilir.
		System.out.println(mp1); // {101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}
		
		mp1.put(106, "Canan"); // Ayni veriyi farkli key'e atanabilir.
		System.out.println(mp1); // {101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
		
		mp1.put(null, "Haluk"); // key degeri null alabilir.
		System.out.println(mp1); // {null=Haluk, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
		
		mp1.put(null, "Hakan");
		System.out.println(mp1); // {null=Hakan, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
		
		mp1.put(107, null); // Value degerleri coklu null olabilir.
		mp1.put(108, null); // Value degerleri coklu null olabilir.
		mp1.put(109, null); // Value degerleri coklu null olabilir.
		System.out.println(mp1); // {null=Hakan, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null}
		
		System.out.println(mp1.get(103)); // Hasan
		System.out.println(mp1.values()); // [Hakan, Harun, Said, Hasan, Canan, Ayse, Canan, null, null, null] ---> Map'deki tüm elemanlarin value'lerini return eder.
		System.out.println(mp1.keySet()); // [null, 101, 102, 103, 104, 105, 106, 107, 108, 109] 
		
		System.out.println(mp1.getOrDefault(106, "Böyle bir eleman yoktur.")); // Canan
		System.out.println(mp1.getOrDefault(111, "Böyle bir eleman yoktur.")); // Böyle bir eleman yoktur.
		
		mp1.putIfAbsent(110, "Ahmet"); // Belirtilen key creat edilmemisse creat edip value atamasi yapar. --> key 110 yoktu olusturup Ahmet atadi.
		System.out.println(mp1.putIfAbsent(110, "Ahmet")); // Belirtilen key yoksa NULL return eder.
		System.out.println(mp1); // {null=Hakan, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=Ahmet}
		
		mp1.putIfAbsent(105, "Salih"); // 105 key'de Ayse value oldugu icin Salih put edilmedi.
		System.out.println(mp1.putIfAbsent(105, "Salih")); // Ayse ---> 105 key'deki value degeri Ayse return edildi.
		System.out.println(mp1); // {null=Hakan, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=Ahmet}
		
		mp1.putIfAbsent(null, "Ipek"); // null key'de Hakan value oldugu icin Ipek put edilmedi.
		System.out.println(mp1); // {null=Hakan, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=Ahmet}
		
		
		mp1.putIfAbsent(107, "Oguz"); // 107 key'de value null oldugu icin Oguz put edildi.
		System.out.println(mp1); // {null=Hakan, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=Oguz, 108=null, 109=null, 110=Ahmet}


	}

}
