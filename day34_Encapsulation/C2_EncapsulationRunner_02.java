package day34_Encapsulation;

public class C2_EncapsulationRunner_02 {

	public static void main(String[] args) {
	
		C1_Encapsulation_01 obj = new C1_Encapsulation_01(); // C1_Encapsulation_01 - 1. classtan obje olusturduk.
		
		// obj.age = 47;
		obj.name = "ferhan";
		obj.surName = "barin";
		obj.yasAta(-47);
		
		System.out.println(obj.name); // ferhan
		System.out.println(obj.surName); // barin
		System.out.println(obj.yasGoster()); // 47
		
		
		
		

	}

}
