package day34_Encapsulation;

	/*
	1- filedlari model(String), renk(String), motor(int), yil (int) olan Araba  isimli bir class tanimlayiniz.
	2- bütün fieldlari parametre alan bir constructor tanimlayiniz.
	3- bütün fieldlari icin getter ve setter metodlari olusturunuz.
	4- ArabaMain isminde main için bir class olusturunuz.
	5- Iki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
	6- araclarin motor ve yilini hatali veri girisine karsi kapsulleyiniz.
	*/


	public class C3_Araba_03 {

	String model; // 1.Step
	String renk;
	private int motor; // 6.Step
	private int yil; // 6.Step
	
	public C3_Araba_03() { // 2.Step Parametresiz constructor olusturduk.
		
	}
	
	public C3_Araba_03(String model, String renk, int motor, int yil) { // 2.Step Parametreli constructor
		super();
		setModel(model);
		setMotor(motor);
		setRenk(renk);
		setYil(yil);
	}
	
		
	public String getModel() { // 3.Step
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getRenk() {
		return renk;
	}



	public void setRenk(String renk) {
		this.renk = renk;
	}



	public int getMotor() {
		return motor;
	}



	public void setMotor(int motor) {
		if (motor>0) {
		this.motor = motor;
		
		} else this.motor = -motor;
		
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		if (yil>0) {
		this.yil = yil;
		
		} else this.yil = -yil;
		
	}

}
