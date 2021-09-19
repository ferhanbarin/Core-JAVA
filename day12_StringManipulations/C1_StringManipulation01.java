package day12_StringManipulations;

public class C1_StringManipulation01 {

	public static void main(String[] args) {
		
		// substring(): Index kullanarak verilen String’in istenen parcasini almamizi saglar.
		// - Parametre olarak 1 sayi girilirse, girilen index’den String’in sonuna kadar bolumu
		// - Parametre olarak 2 sayi girilirse, girilen 1 sayidaki indexden (inclusive) baslayip, 2 sayiya kadar (exclusive) karakteri bize dondurur.
		
		String str = "Java candir";
		
		System.out.println(str.substring(5)); // candir
		System.out.println(str.substring(10)); // r
		System.out.println(str.substring(11)); // 11 = length hiclik 
		System.out.println("===");
		// System.out.println(str.substring(20)); // hata verir.
		
		System.out.println(str.substring(5,8)); // can // ==> 5 dahil, 8 dahil degil.
		System.out.println(str.substring(2,3)); // v
		System.out.println(str.substring(5,5)); // hiclik
		System.out.println("=============");
		System.out.println(str.substring(5,11)); // candir
		// System.out.println(str.substring(5,1)); // hata
		
		System.out.println(str.substring(3,4) + str.substring(8,9)); // ad

	}

}
