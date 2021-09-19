package day35_Encapsulation;

import java.util.Scanner;

public class C2_rentApartmentsMain_02 {
	
		/* 
    	Burada iki adet class vardir. Biri Main digeri ise rentApartments. rentApartments'in icinde; Bu variable'lari private olarak olusturun;
    	String name
    	int roomCount
    	boolean balconyOrNo
    	B�t�n variable'lar i�in getter ve setter olusturunuz.
   		4 farkli Apartment(apartman dairesi) vardir. 0, 1, 2, 3 rooms(odali)
    	-----------------------------------------------------------------
    	Bir method olusturun;
    	Eger room sayisi 0 ise,
    	rent(kira) 1400
    	Eger oda sayisi 1 ise,
    	rent  1700
    	Eger oda sayisi 2 ise,
    	rent 2200
    	Eger oda sayisi 3 ise,
    	rent 2700
    	rent'i return'leyin.
    	----------------------------------------------------------------
    	Bir method olusturun.
    	Eger balconyOrNo  true ise,
    	rent'e 200 dollar ekleyin.
    
    	Main class'in icinde;
    	userName rent is amountOfRent
		 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen isminizi giriniz : ");
		String name = scan.nextLine().toUpperCase();
		
		System.out.print("L�fen dairenizde talep ettiginiz oda sayinizi giriniz : ");
		int odaSayisi = scan.nextInt();
		
		System.out.print("L�tfen balkon tercinizi giriniz (True/False) : ");
		boolean balcony = scan.nextBoolean();
		
		C1_rentApartments_01 kiraci = new C1_rentApartments_01();
		
		kiraci.setName(name);
		kiraci.setBalconyOrNo(balcony);
		kiraci.setRoomCount(odaSayisi);
		
		int toplamKira = kiraci.balkonSor(balcony) + kiraci.kiraHesapla(odaSayisi);
		
		System.out.println(kiraci.getName() + " Bey kira �cretiniz : " + toplamKira);
		
		scan.close();
	}

}
