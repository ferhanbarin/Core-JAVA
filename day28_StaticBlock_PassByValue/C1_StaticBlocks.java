package day28_StaticBlock_PassByValue;

public class C1_StaticBlocks {
	
	static int sayi = 10;
	
	static {
		System.out.println("1. Static Block calisti.");
		sayi = 20;
	}
	
	static {
		System.out.println("1.5 Static Block calisti.");
		sayi = 15;
	}

	
	static {
		System.out.println("2 Static Block calisti.");
		sayi = 30;
	}
	
	static {
		System.out.println("3. Static Block calisti.");
		sayi = 45;
	}



	public static void main(String[] args) {
		
		System.out.println("Main method'un ilk satirinda sayi : " + sayi); // 
		// Static block herseyden önce calisir. Main method'dan bile önce calisir. - Önce static block sonra main method.

	}	
}
