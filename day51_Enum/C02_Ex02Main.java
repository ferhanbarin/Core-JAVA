package day51_Enum;

public class C02_Ex02Main {

	public static void main(String[] args) {
		
		C02_User kullanici = new C02_User();
		kullanici.name = "Ferhan";
		// kullanici.role = 1; // Customer
		// kullanici.status = 2; // Inactive
		kullanici.yetkisi = C02_Role.ADMIN;
		kullanici.durum = C02_Status.LOGIN;
		
		C02_User kullanici1 = new C02_User();
		kullanici.name = "Emirhan";
		kullanici1.yetkisi = C02_Role.CUSTOMER;
		kullanici1.durum = C02_Status.ACTIVE;
		
		if (kullanici.yetkisi == C02_Role.CUSTOMER) {
			System.out.println("Silme yetkisi yok.");
			
		}

	}

}
