package day40_Overriding;

public class Otobüs extends Arac {
	
	int yolcuSayisi;
	

	public Otobüs(String renk, int motor, String model, int yolcuSayisi) { // Constructor
		
		super(renk, motor, model); // Parent'ten gelecek fields.
		this.yolcuSayisi = yolcuSayisi;
	}


	@Override
	public String toString() {
		
		return "Otobüs [yolcuSayisi=" + yolcuSayisi + ", model=" + model + ", getRenk()=" + getRenk() + ", getMotor()="
				+ getMotor() + ", getModel()=" + getModel() + ", toString()=" + super.toString() + "]";
	}

}
