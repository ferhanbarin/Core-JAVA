package day36_Inheritance;

public class C1_InheritanceMemur_01 extends C2_InheritanceMuhasebe_02 {

	public static void main(String[] args) {
		
		C1_InheritanceMemur_01 memur1 = new C1_InheritanceMemur_01();
		
		memur1.isim = "Ferhan";
		memur1.soyIsim = "Barin";
		memur1.adres = "World";
		memur1.saatUcreti = 20;
		memur1.statü = "Chef";
		memur1.tel = "123456789";
		memur1.id = memur1.idAta();
		memur1.maas = memur1.maasHesapla();
		
		System.out.println(memur1.isim + "\n" + memur1.soyIsim +  "\n" +memur1.tel + "\n" + memur1.adres + "\n" + memur1.saatUcreti + "\n" +memur1.id + "\n" + memur1.maas);
		
		
		
		
		
	}

}
