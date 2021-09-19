package day34_Encapsulation;

public class C4_ArabaMain_04 { // 4.Step

	public static void main(String[] args) {
		// 5.Step
		C3_Araba_03 Volvo = new C3_Araba_03("XC90", "Beyaz", -3000, -2020);
		C3_Araba_03 Audi = new C3_Araba_03("Q7", "Bej", -3000, -2021);
		C3_Araba_03 Honda = new C3_Araba_03(); // Default parametresiz constructor varken;
		
		
		Honda.model = "Civic";
		Honda.renk = "Gri";
		Honda.setYil(1999);
		Honda.setMotor(1400);
		
		System.out.println("Honda Yil : " + Honda.getYil());
		System.out.println("Honda Motor : " + Honda.getMotor());
		
		System.out.println("Volvo Motor : " + Volvo.getMotor());
		System.out.println("Audi Yil : " + Audi.getYil());
	}

}
