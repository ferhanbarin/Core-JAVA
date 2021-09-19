package day34_Encapsulation;

public class C1_Encapsulation_01 {
	
	// Source  > Generate Getters and Setters secenegi otomatik methodlari olusturacaktir.
	
	String name;
	String surName;
	private int age; // Encapsulation icin veriyi private yaptik.

	public static void main(String[] args) {
	

	}
	
	public void yasAta(int age) { // Bu method isterse yasi set eder.
		
		if (age<0) {
			this.age = -age;
		} else this.age = age;

		
	}
	
	public int yasGoster() { //  Bu method obje isterse yas variable'ini gosterir.
		
		return this.age;
	
	}

}
