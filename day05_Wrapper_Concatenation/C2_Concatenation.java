package day05_Wrapper_Concatenation;

public class C2_Concatenation {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		int sayi1 = 3;
		int sayi2 = 4;
		
		
		// ***** kesinlikle sayi ve harf yazmadan, sadece variable isimlerini kullanarak *****
		
		// Hello1 yazdirin.
		
		System.out.println(str1 + (sayi2-sayi1));
		
		
		// Hello 5 World yazdirin.
		
		System.out.println(str1 + " " + ++sayi2 + " " + str2);
		
		
		// Hello 34 yazdirin.
		
		System.out.println(str1 + " " + sayi1 + --sayi2);
		
		// 7World yazdirin.
		
		System.out.println(sayi1+sayi2 + str2);
		
		// 34 yazdirin.
		
		System.out.println(sayi1+sayi2); // 7 >> data türü INT.
		System.out.println(sayi1 + "" + sayi2); // 34 >> data türü String.
		
		
		// int'i String'e cevirmek icin method'a ihtiyac yok, ama istersek kullanabiliriz.
		
		String intdanCevrilen = ""+sayi1; // Bu yöntem method kullanmadan int'i string'e cevirir.
		
		
		

	}

}
