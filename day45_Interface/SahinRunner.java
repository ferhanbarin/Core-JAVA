package day45_Interface;

public class SahinRunner {

	public static void main(String[] args) {
		
		Sahin s1 = new Sahin();
		
		s1.ayna();
		s1.ebat();
		s1.jant();
		s1.kapi();
		s1.kaporta();
		s1.koltuk();
		s1.motor();
		s1.yakit();
		System.out.println(IcDonanim.MUSIC);
		// s1.KUMAS = "Deri";  --> final variable assignment yapilamaz.
		
		System.out.println(IcDonanim.RENK); // Ahsap
		System.out.println(DisDonanim.RENK); // Metalik
		System.out.println(Lastik.RENK); // Siyah-Beyaz yanakli.
		
		System.out.println(s1.sisLamp()); // Obje ile parent Interface'den concrete method call edildi.
		System.out.println(DisDonanim.boya()); // Interface name ile parent Interface'den concrete method call edildi.
		
		
		

	}

}
