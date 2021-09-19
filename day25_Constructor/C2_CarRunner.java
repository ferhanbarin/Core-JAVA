package day25_Constructor;

public class C2_CarRunner {

	public static void main(String[] args) {
		
		C1 car1 = new C1();
		
		/* Bir esitlikte sol taraf declaration. Declaration'da data türü, variable ismi.
		 String str = "Mehmet";
		 Data türü class ismi olabilir.
		 Primitive daha türlerini java olusturmustur, biz primitive data türü olusturamayiz.
		 Non-primitive data türlerini java da olusturabilir, bizde olusturabiliriz.
		
		 C1 car1 yazdigimizda C1 hem class ismi, hemde non-primitive data türüdür.
		 new C1(); esitligin sagi deger olusturmadir.
		 new : keyword'dur ve yeni bir obje olusturacagimizi beyan eder.
		 C1() ise constructor'dir.
		 */
		
		car1.fiyat = 1000;
		car1.ilanNo = 1001;
		car1.marka = "Toyota";
		car1.model = "Corolla";
		car1.yil = 2020;
		// Variable'lar sadece deger atamis yapar.
		System.out.println(car1.fiyat + ", " + car1.ilanNo + ", " + car1.marka + ", " + car1.model + ", " + car1.yil);
		
		car1.hiz(200);
		car1.yakit("Dizel");
		// Method'larin ne yapacagini method belirler.
		
		C1 car2 = new C1();
		
		System.out.println(car2.fiyat + ", " + car2.ilanNo + ", " + car2.marka + ", " + car2.model + ", " + car2.yil);
		
		car2.fiyat = 15000;
		car2.ilanNo = 1002;
		car2.marka = "Opel";
		car2.model = "Astra";
		car2.yil = 2020;
		
		System.out.println(car2.fiyat + ", " + car2.ilanNo + ", " + car2.marka + ", " + car2.model + ", " + car2.yil);
		
		car2.yakit("Benzin");
		
		
	}

}
