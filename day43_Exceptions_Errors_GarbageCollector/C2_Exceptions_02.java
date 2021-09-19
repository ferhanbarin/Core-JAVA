package day43_Exceptions_Errors_GarbageCollector;

public class C2_Exceptions_02 {

	public static void main(String[] args) {
		
		int[] arr = {34, 35, 41, 63, 21};
		
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Hatali index girdiniz.");
		}
		
		finally {
			System.out.println("Bu yaziyi okuyorsan kod bu satira kadar sorunsuz RUN olmustur.");
		}
		
		/*
		 * "finally" blogu try-catch blogu ile veya sadece try blogu ile calisabilir.
		 * "finally" blogu catch ile öngörülen bir sorun oldugunda calistigi gibi öngörülemeyen bir exception olustugunda da calisir.
		 * Final Cümlesi ---> "finally" blogu her durumda kesinlikle calisir.
		 */
	}

}
