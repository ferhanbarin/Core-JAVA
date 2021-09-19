package day31_Varargs_StringBuilder;

public class C6_StringBuilder_02 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder(); // bos bir sb1 creat ettik.
		
		// sb eleman ekleme -> obj.appent(obj);
		
		sb1.append("ferhan");
		System.out.println("sb1 ilk hali : " + sb1); // ferhan
		
		sb1.append(" barin");
		System.out.println("sb1 barin eklenmis hali : " + sb1); // barin
		
		System.out.println("sb1 uzunluk : " + sb1.length()); // 12
		System.out.println("sb1 kapasitesi : " + sb1.capacity()); // 16
		System.out.println("sb1 son hali : " + sb1.append(" güzel insan")); // ferhan barin güzel insan
		System.out.println("sb1 son hali kapasitesi : " + sb1.capacity()); // 34
		
	}

}
