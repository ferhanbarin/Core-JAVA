package day33_StringBuilder_AccessModifiers;

import java.util.Scanner;

public class C2_StringBuilder_02 {

	public static void main(String[] args) {
		
	//Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom olup olmadigini kontrol eden (büyük/küçük harf duyarliligi olmadan) bir Java programi yazin.
   // (without case sensitivity) - Eg : input : I love Java | Output: "Reversed sentence : avaJ evol I .  -  It is not a palindrome"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir ifade giriniz.");
		
		String str = scan.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		String terString = sb.reverse().toString();
		
		if (str.equalsIgnoreCase(terString)) {
			System.out.println("Girdiginiz ifade polindrom'dir.");
		} else {
			System.out.println("Girdiginiz ifade polindrom degildir. " + terString);
		}
		
		scan.close();
	
	}

}
