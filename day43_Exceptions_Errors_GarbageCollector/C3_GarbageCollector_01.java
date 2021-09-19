package day43_Exceptions_Errors_GarbageCollector;

public class C3_GarbageCollector_01 {
	
	public static void main(String[] args) {
		
		String str = "";
		
		for (int i=0 ; i<3 ; i--) {
			str += i; // Sonsuz döngü icinde str variable yeni atama ile her döngüde yeni bir str olusturulur.
		}
		
		/*
		 * Garbage collector finalize() method'unu calistirir.
		 * finalize() method'u silenecek obje'leri isaretler ve siler.
		 */
	
		
	}
}
