package day51_Enum;

public class C01_Ex01Main {

	public static void main(String[] args) {
		
		// Verilen ay nosuna göre ayin kac gün oldugunu yazdiriniz.
		
		// int ay = 5;
		
		C01_Aylar ay = C01_Aylar.SUBAT;
		
		System.out.println("Ay " + ay);
		System.out.println("Ay name = " + ay.name());
		System.out.println("Ay sirasi = " + ay.ordinal()); // Enum yapisindaki ay objesinin INDEX sirasi.
		
		switch (ay) {
		
		case OCAK: // Girilen ay yildaki sirasi.
			System.out.println("Ocak");
			break;
		case SUBAT:
			System.out.println("Subat");
			break;
		case MART:
			System.out.println("Mart");
			break;
		case NISAN:
			System.out.println("Nisan");
			break;
		case MAYIS:
			System.out.println("Mayis");
			break;
			
		}

	}

}
