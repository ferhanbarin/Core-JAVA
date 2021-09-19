package day04_Increment_MathematicalOperations;

public class C1_IncrementDecrement {

	public static void main(String[] args) {
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi1 -= 5;
		sayi2 += 10;
		
		System.out.println(sayi2/sayi1);  // 6 yazdirir. 
		
		sayi1 *= 2; // 10
		sayi2 ++; // 31
		
		System.out.println(sayi2/sayi1);  // 3 yazdirir.
		
		sayi1 /= 2;
		
		double sayi3 = sayi2/10;  // Atama olmadigi icin sayi2 degeri degismez. - sayi2 int oldugundan sayi2/10 isleminin sonucunu java 3 olarak bulur.
								  // Ama atama islemi yapilirken sayi3 double oldugu icin bölme isleminin sonucu olan 3'u casting ile 3.0'a cevirir.
		
		System.out.println(sayi3);
		
		System.out.println(sayi1*sayi2); // 155 yazdirir.
		System.out.println(sayi1*sayi3); // 15.0 yazdirir.
		
		sayi3 = (double) sayi2/10;
		System.out.println(sayi3);  // 3.1 yazdirir.
		
		System.out.println(sayi2); // 31 yazdirir.
		System.out.println((double)sayi2); // 31.0 yazdirir.
		System.out.println(sayi2); // 31 yazdirir.
		
		sayi2 += 0.2; // sayi2 int
		System.out.println(sayi2); // 31 yazdirir.
	}

}
