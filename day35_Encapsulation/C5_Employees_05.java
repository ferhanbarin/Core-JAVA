package day35_Encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* 
	Burada iki adet class vardir. Biri Main digeri ise Employees,
	Employees(Calisanlar) class'inda;
	Bu variable'lari olusturunuz;
	private String name,
	private int salary,
	private String dob (date of birth) (Dogum tarihi)
	getter ve setter olusturunuz.
	Main class'in icinde; kullanicidan name dob ve slary bilgilerini alip
	Eger employee 18 yasinda büyükse, Welcome to our company Fernando your salary is 80000. yazdiriniz.
	Eger Fernando 18 yasindan kücükse, come back when you are 18 years old. yazdiriniz.
	Eger Fernando 18 yasindaysa,  we can have inter with you after that you can have a 80000 salary yazdiriniz.
	Ornek:
	Name is Fernando
	dob is 11/23/2000
	Salary is 80000
	ageCalculator isminde bir method olusturunuz. Suanki tarih - dogum yili = employee age
	 */
	

public class C5_Employees_05 {

	private String name;
	private int salary;
	private String dob;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {

		this.dob = dob;
	}

	
	public int yasHesapla(String dob) {
		
	String strDate = dob; // "12/23/1999"

	LocalDate bugün = LocalDate.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

	LocalDate dTarihi = LocalDate.parse(strDate, format); // Kullanicinin String girdigi MM/dd/yyyy formata göre parcala.
																
	int age = bugün.getYear() - dTarihi.getYear(); // Bugün - kullanici dTarihi = yas.
		
		return age;
		
	}
	

}
