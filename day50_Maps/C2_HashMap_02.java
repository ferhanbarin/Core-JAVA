package day50_Maps;

import java.util.HashMap;

public class C2_HashMap_02 {

	public static void main(String[] args) {
		
		HashMap <Integer, String> mp1 = new HashMap<>();
		
		mp1.put(101, "Levet");
		mp1.put(102, "Said");
		mp1.put(103, "Hasan");
		mp1.put(104, "Canan");
		mp1.put(105, "Ayse");
		System.out.println(mp1); // {101=Levet, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}
		
		mp1.remove(101); // Belirtilen key'deki Entry: key+value silinir.
		System.out.println(mp1); // {102=Said, 103=Hasan, 104=Canan, 105=Ayse}
		
		mp1.remove(102, "said"); // key value eslesmesi olursa entry silinir. Eslesme olmazsa (said != Said) herhangi bir islem yapilmaz.
		System.out.println(mp1); // {102=Said, 103=Hasan, 104=Canan, 105=Ayse}
		
		mp1.remove(102, "Said");
		System.out.println(mp1); // {103=Hasan, 104=Canan, 105=Ayse}
		
		mp1.remove(111, "Ferhan"); // Olmayan key'deki entry'i silme islemi yapilmaz.
		System.out.println(mp1.remove(111, "Ferhan")); // false
		System.out.println(mp1); // {103=Hasan, 104=Canan, 105=Ayse}
		
		System.out.println(mp1.size()); // 3
		
		
		HashMap <Integer, String> mp2 = new HashMap<>();
		
		mp2.put(1, "Güzel");
		mp2.put(2, "Insan");
		mp2.put(3, "Javacan");
		System.out.println(mp2); // {1=Güzel, 2=Insan, 3=Javacan}
		
		
		mp1.putAll(mp2); // mp1 map'e --> mp2 map put edildi. Dolayisiyla mp1 update oldu ancak mp2 ayni degerdedir.
		System.out.println(mp1); // {1=Güzel, 2=Insan, 3=Javacan, 103=Hasan, 104=Canan, 105=Ayse}
		
		
		mp1.compute(103, (key, value) -> "Haluk"); // 103 key'de value varsa update eder yoksa Entry put eder.
		System.out.println(mp1); // {1=Güzel, 2=Insan, 3=Javacan, 103=Haluk, 104=Canan, 105=Ayse}
		
		mp1.compute(109, (key, value) -> "Merve"); // 109 key'de olmadigi icin Entry put edildi.
		System.out.println(mp1); // {1=Güzel, 2=Insan, 3=Javacan, 103=Haluk, 104=Canan, 105=Ayse, 109=Merve} --> 109 key'deki 109=Merve creat edildi.
		
		
		mp1.computeIfAbsent(111, value -> "Said"); // Map'de 111 key varligini kontrol eder ve key yoksa girilen value(Said) atanir. 111 Key varsa islem yapilmaz.
		System.out.println(mp1); // {1=Güzel, 2=Insan, 3=Javacan, 103=Haluk, 104=Canan, 105=Ayse, 109=Merve, 111=Said}
		
		mp1.computeIfAbsent(109, value -> "Ipek"); // Map'de 109 key varligini kontrol eder. 109 key oldugu icin islem yapilmaz.
		System.out.println(mp1); // {1=Güzel, 2=Insan, 3=Javacan, 103=Haluk, 104=Canan, 105=Ayse, 109=Merve, 111=Said}
		
		
		mp1.computeIfPresent(109, (key, value) -> "Rabia"); // Map'de 109 key varligini kontrol eder. 109 key oldugu icin Rabia value ile update edildi.
		System.out.println(mp1); // {1=Güzel, 2=Insan, 3=Javacan, 103=Haluk, 104=Canan, 105=Ayse, 109=Rabia, 111=Said}
		
		mp1.computeIfPresent(115, (key, value) -> "Rabia"); // Map'de 115 key varligini kotrol eder. 115 key olmadigi icin herhangi bir islem yapilmaz.
		System.out.println(mp1); // {1=Güzel, 2=Insan, 3=Javacan, 103=Haluk, 104=Canan, 105=Ayse, 109=Rabia, 111=Said}

	}

}
