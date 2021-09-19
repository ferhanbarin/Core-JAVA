package day31_Varargs_StringBuilder;

public class C2_Varargs_02 {

	public static void main(String[] args) {
		
		// Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method olusturunuz.
		
		concat("F", "E", "R", "H", "A", "N");

	}

	private static void concat(String... string) {
		
		String s = "";
		
		for (String w : string) {
			s=s.concat(w);
		}
		
		System.out.println(s);
	}

}
