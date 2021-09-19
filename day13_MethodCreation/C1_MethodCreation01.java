package day13_MethodCreation;

public class C1_MethodCreation01 {

	public static void main(String[] args) {
	
	// Bir method'u olusturmak o method'u calistirmak icin yeterli degildir.
	// Eger bir method'u calistirmak isterseniz, Method Call (o method'u cagirmalisiniz.)
	
	// Method Call yapmak icin method'un adi ve varsa parametreleri yazilmalidir.
		
	toplama(20,40);
	
	// Sadece Method Call yaptigimizda calisir.
	// Eger method'un icinde bir sey yazdiriyorsak console'da o yaziyi görürüz.
	// Ancak method'umuz return type'a sahipse bize bir sonuc return edecektir.
	// Bu sonucu ya direkt yazdiririz;
	
	System.out.println(toplama(15,20));
	
	// Veya dönen sonucu bir variable'a atayabiliriz.
	
	
		int sonuc = toplama(10,15);
		System.out.println(sonuc);
	}
	
	public static int toplama(int sayi1, int sayi2) {
		
		System.out.println("Method calisti.");
		return sayi1 + sayi2;
	}
}
