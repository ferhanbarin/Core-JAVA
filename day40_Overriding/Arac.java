package day40_Overriding;

 /*
	 1) Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun.
	 2) Constructor ekleyiniz, get ve set methodlari ve toString Method'unu ekleyiniz.
	 3) Arac sinifindan Otobüs sinifini üretiniz, otobüsün ayrica yolcuSayisi field'inin ekleyiniz.
	 4) Bir AracPark isimli icinde main olan bir sinif olusturunuz ve Otobus'ten obj olusturarak, Otobüs'ün özelliklerinin tümünü ekrana yazdiriniz.
 */

public class Arac {
	
	private String renk;
	private int motor;
	protected String model;
	
	
	public Arac(String renk, int motor, String model) {
		
		setModel(model);
		setMotor(motor);
		setRenk(renk);
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
		this.motor = motor;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

}
