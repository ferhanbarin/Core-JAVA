package day04_Increment_MathematicalOperations;

public class C2_PreIncrement_PostIncrement {

	public static void main(String[] args) {
		
		int sayi1 = 20;
		
		int sayi2 =++ sayi1;
		
		System.out.println("Pre Increment Sayi1: " + sayi1); // 21
		System.out.println("Pre Increment Sayi2: " + sayi2); // 21
		
		
		sayi2 = sayi1++;
		
		System.out.println("Post Increment Sayi1: " + sayi1); // 22
		System.out.println("Post Increment Sayi2: " + sayi2); // 21
		
		
		int sayi3 = 10;
			
		
		System.out.println("Pre Increment: " + ++sayi3); // 11
		System.out.println("Post Increment: " + sayi3++); // 11
			
				
		System.out.println("Post Increment'tan sonra sayi3: " + sayi3); // 12

	}

}
