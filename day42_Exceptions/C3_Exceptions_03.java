package day42_Exceptions;

public class C3_Exceptions_03 {

	public static void main(String[] args) {
		
		String str1 = " "; // Space
		String str2 = ""; // Hiclik
		String str3 = null; // str3 variable'nin hicbir degere esit olmadigini belirten bir pointer(belirtec-isaretci)
							// null bir  deger degildir ama konsola yazdirilabilir.
		
		System.out.println(str1.length()); // 1
		System.out.println(str2.length()); // 0
	//	System.out.println(str3.length()); NullPointerException unchecked --> Kendimiz ettik kendimiz bulduk hatasi. :)
		System.out.println(str3 + "Erol TAS"); // nullErol TAS
	//	System.out.println(str3.concat("Erol TAS")); --> null olarak atanmis bir obj uygun olmayan bir islem yapilirsa JAVA NullPointerException unchecked verir.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
