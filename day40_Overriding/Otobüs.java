package day40_Overriding;

public class Otob�s extends Arac {
	
	int yolcuSayisi;
	

	public Otob�s(String renk, int motor, String model, int yolcuSayisi) { // Constructor
		
		super(renk, motor, model); // Parent'ten gelecek fields.
		this.yolcuSayisi = yolcuSayisi;
	}


	@Override
	public String toString() {
		
		return "Otob�s [yolcuSayisi=" + yolcuSayisi + ", model=" + model + ", getRenk()=" + getRenk() + ", getMotor()="
				+ getMotor() + ", getModel()=" + getModel() + ", toString()=" + super.toString() + "]";
	}

}
