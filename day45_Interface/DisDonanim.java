package day45_Interface;

public interface DisDonanim {
	
	public void ayna();
	public void kapi();
	public void kaporta();
	
	String RENK = "Metalik";
	
	
	public default String sisLamp() { //Bu method body'li concrete'dir.
		
		return "Sisli hava dikkat";
	}
	
	public static String boya() {
		
		return "Koyu renk boya günes yanigi yapar.";
	}
	

}
