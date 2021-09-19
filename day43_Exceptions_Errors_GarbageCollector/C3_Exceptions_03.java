package day43_Exceptions_Errors_GarbageCollector;

public class C3_Exceptions_03 {
	
	/*
	'ortalama' isminde bir method olusturun ve int v  - int f  isminde 2 adet parametresi olsun.
	int v = vize
	int f = final
	Eger  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
	Sistem ArithmeticException hatasi versin ve "Notlar 0-100 arasinda olmali" mesajini döndürsün.
	Diger durumlarda ise,
	vizenin yüzde 40 ini, finalin yüzde 60 ini alsin ve toplasin.(ortalama =)
	vizeye 120, finale 80 girin.
	Programin çalismasini saglayin. (handle edin)
	 */

	public static void main(String[] args) {
		
		try {
			ortalama(120, 80);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void ortalama(int v, int f) {
		
		if (v>100 || v<0 || f>100 || f<0) {
			throw new ArithmeticException("Notlar 0-100 arasinda olmalidir.");
		} else {
			System.out.println("Ortalama" + ((v*4)/10) + ((f*6)/10));
		}
		
	}

}
