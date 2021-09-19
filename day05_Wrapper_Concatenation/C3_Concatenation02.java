package day05_Wrapper_Concatenation;

public class C3_Concatenation02 {

	public static void main(String[] args) {
		
		int sayi = 7;
		char ilkharf = 'a';
		String str = "Java";
		
		System.out.println(sayi+str+ilkharf); // 7Javaa yazdirir.
		System.out.println(sayi+ilkharf+str); // 104Java yazdirir. ASCII tablosuna göre a=97 yani 7+97+Java = 104Java.
		
		// 7a yazdirin.
		
		System.out.println(sayi + "" + ilkharf);
		

	}

}
