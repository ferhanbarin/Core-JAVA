package day48_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C2_Set_02 {
	
	// Icinde degeleri olan bir Array'i ArrayList'e cevirerek return type ArrayList olacak bir method yaziniz. {"Reha", "Hakan", "Haluk", "Ipek", "Ahsen"};
	// Main method altina method ile gelen listeyi kullanarak HashSet, TreeSet ve LinkedHashSet'leri doldurun.

	public static void main(String[] args) {
	
		String arr[] = {"Reha", "Hakan", "Haluk", "Ipek", "Ahsen"};
		ArrayList <String> list = new ArrayList<>();
		
		list = cevir(arr);
		System.out.println(list); // [Reha, Hakan, Haluk, Ipek, Ahsen]
		
		HashSet <String> hs = new HashSet<>(list);
		LinkedHashSet <String> lhs = new LinkedHashSet<>(list);
		TreeSet <String> ths = new TreeSet<>(list);
		
		System.out.println("Hurra : " + hs); // [Ahsen, Reha, Hakan, Haluk, Ipek]
		System.out.println("Giris sirasi : " + lhs); // [Reha, Hakan, Haluk, Ipek, Ahsen]
		System.out.println("Alfabetik sira : " + ths); // [Ahsen, Hakan, Haluk, Ipek, Reha]

	}
	
	public static ArrayList<String> cevir(String []arr) {
		
		ArrayList <String> ArrList = new ArrayList<>();
		for (String each : arr) {
			ArrList.add(each);
		}
	
		return ArrList;
	}

}
