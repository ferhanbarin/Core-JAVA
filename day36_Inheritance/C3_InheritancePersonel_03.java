package day36_Inheritance;

/*
	1) Personel class olusturunuz id(int), isim(String), soyisim(String),adres(String), tel(String), instance veriable bulundursun. Bu class 1000 den baslayarak id atayan bir method barindirsin.
	2) Muhasebe class olusturunuz saatUcreti (int), statü(String), maas(int) instance veriable bulundursun. Bu class saat ücretini 8 ve 30 ile carparak maaas hesaplayan bir  method barindirsin.
	3) Memur class olusturunuz iki memurun saat ucreti 20 tl ve 25  den maasinin  ve diger bilgilerini yazdiriniz.
	4) Isci class olusturunuz iki iscinim   saat ücreti 10 tl ve 15  den maasinin  ve diger bilgilerini yazdiriniz.
	Class'larin   parent --> child   iliskisi
	personel --> Muhasebe
            	 Muhasebe-->Memur
            	 Muhasebe-->Isci
*/

public class C3_InheritancePersonel_03 {
	
	public static int sayac = 1000;
	public int id;
	public String isim;
	public String soyIsim;
	public String adres;
	public String tel;
		
		
	public int idAta() {
		
		this.id = sayac++;
	
		return id;
					
	}
}
