package day33_StringBuilder_AccessModifiers;

import java.util.Scanner;

public class C2_StringBuilder_02 {

	public static void main(String[] args) {
		
	//Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi ters �eviren ve c�mlenin palindrom olup olmadigini kontrol eden (b�y�k/k���k harf duyarliligi olmadan) bir Java programi yazin.
   // (without case sensitivity) - Eg : input : I love Java | Output: "Reversed sentence : avaJ evol I .  -  It is not a palindrome"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir ifade giriniz.");
		
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
