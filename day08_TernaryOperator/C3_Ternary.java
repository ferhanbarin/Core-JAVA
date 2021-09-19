package day08_TernaryOperator;

public class C3_Ternary {

	public static void main(String[] args) {
		
		int sayi = 75;
		String sonuc = sayi%2 == 0 ? "Sayi Cift" : "Sayi Tek";
		
		System.out.println(sonuc);
		
		System.out.println(sayi>100 ? "Sayi 100'den büyük " : 10);
		
		// Direkt yazdirdigimiz zaman sonuclarin ikiside ayni cinsten olmak zorunda degildir.
		
		// sayi>100 ? "Sayi 100'den büyük " : 10
		// Farkli data türündeki sonuclar icin atama yapilmaz.
		
		int y = 1;
		int z = 1;
		int a = y<10 ? y++ : z++;
		
		System.out.println(y + "," + z + "," + a);
		
		
	}

}
