package day36_Inheritance;

public class C2_InheritanceMuhasebe_02 extends C3_InheritancePersonel_03 {
	
	public String statü;
	public int saatUcreti;
	public int maas;
	
	public int maasHesapla() {
		
		int maas = saatUcreti*8*30;
		
		return maas;
		
	}

}
