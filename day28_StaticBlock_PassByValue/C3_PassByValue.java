package day28_StaticBlock_PassByValue;

public class C3_PassByValue {

	public static void main(String[] args) {
		
		double fiyat = 100;
		
		// indirimYap(fiyat); Fiyatta %10 indirim yapacagim ve yeni fiyati döndürecegim.
		
		System.out.println("Method call ile yazdirilan indirimli fiyat : " + indirimYap(fiyat)); // 90
		
		System.out.println("Method calistiktan sonra fiyat : " + fiyat); // 100
		
		int zamYuzdesi = 15;
		zamYap(zamYuzdesi);

	}

	private static void zamYap(int zamYuzdesi) {
		// Javaya bir method olusturdugumuzda Java bizim main method'da kullandigimiz variable ismine clone/kopya bir variable olusturur. Bunun amaci kod takibini kolaylastirmaktir.
		// Bu degiskenin ismini degistirsekte kodumuz problemsiz calisir.
	
		
	}

	private static double indirimYap(double fiyat) {
		
		fiyat = fiyat*90/100;
		System.out.println("Method'daki indirimli fiyat : " + fiyat);
		
		return fiyat;
		
	}

}
