package day45_Interface;

public class Sahin extends Tofas implements IcDonanim, Lastik {

	
	@Override
	public void motor() {
		
		System.out.println("1.6 aile motoru.");
	}

	@Override
	public void yakit() {
		
		System.out.println("Tüp takmazsan cok yakar.");
	}
	
	@Override
	public void koltuk() {
		
		System.out.println("Deri koltuk yazin pisirir.");
		System.out.println("Icinde saman olmasin yeter.");
	}

	@Override
	public void ayna() {
		
		System.out.println("Elektrikli aynalar.");
	}

	@Override
	public void kapi() {

		System.out.println("4 kapili.");
	}

	@Override
	public void kaporta() {
		
		System.out.println("Kordon gibi kaportaya sahip.");
	}

	@Override
	public void ebat() {
		
		System.out.println("16 inc lastik ebati vardir.");
	}

	@Override
	public void jant() {
		
		System.out.println("Celik jant kullanilmistir.");
	}


}
