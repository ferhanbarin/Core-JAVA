package day04_Increment_MathematicalOperations;

public class C4_Modulos {

	public static void main(String[] args) {
		
		//5496 sayisinin rakamlar toplamini bulalim.
		
		int sayi = 5496;
		int rakamlarToplami = 0;
		
		// Bir sayinin rakamlar toplamini bulmak icin her basamak degerinde 3 islem yapariz.
		// Bu satirda sayi=5496, rakamlar toplami=0
		
		// 1- sayi%10 ile son basamagi elde ederiz.
		
		int rakam = sayi%10;
		
		// 2- Bu rakami rakamlarToplamina ekleriz.
		
		rakamlarToplami += rakam;
		
		// 3- Degerini aldigimiz son basamaktan kurtulmak icin sayiyi 10'a böleriz.
		
		sayi /=10;
		
		// Bu satira geldigimde sayi=5496, rakamlar toplami=6
		
		
		rakam = sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi/=10;
		
		// Bu satira geldigimde sayi=54, rakamlar toplami=15
		
		rakam = sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi/=10;
		
		// Bu satira geldigimde sayi=5, rakamlar toplami=19
		
		rakam = sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi/=10;
		
		// Kodumuzun sonunda rakamlar toplami=24, sayi 0 oldu.
		
		System.out.println("Rakamlar Toplami: " + rakamlarToplami);
		System.out.println("Sayinin son degeri: " + sayi);

	}

}
