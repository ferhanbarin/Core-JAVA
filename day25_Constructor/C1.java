package day25_Constructor;

public class C1 {
	
	// Source > Generate Constructor using Fields... otomatik olarak contructor olusturabilir.
	
	public int ilanNo;
	public String marka;
	public String model;
	public int yil;
	public int fiyat;
	
	C1(int ilanNo, String marka, String model, int yil, int fiyat){
		
		this.ilanNo = ilanNo;
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.fiyat = fiyat;
		
	}
	
	C1() {
		
	}
	
	C1(int ilanNo, String marka, int fiyat){
		
		this.ilanNo = ilanNo;
		this.marka = marka;
		this.fiyat = fiyat;
	
	}
	
	// Eger parametreli bir contructor olusturursak JAVA default olani öldürür. Bu durumda projemizde aksama olmamasi icin default contructor yerine, parametresiz bir constructor'i biz olusturmaliyiz.
	
	public void hiz(int hiz) {
		
		System.out.println("Araba " + hiz + " km hiz yapabilir.");
	}

	public void yakit(String yakitTuru) {
		
		System.out.println("Araba yakit olarak " + yakitTuru + " kullanir.");
	}

}
