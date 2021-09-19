package day35_Encapsulation;

import java.util.Scanner;

public class C6_EmployeesMain_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen adinizi giriniz : ");
		String name = scan.nextLine();
		
		System.out.print("Lütfen dogum tarinizi giriniz (MM/dd/yyyy) : ");
		String dob = scan.nextLine();
		
		System.out.print("Lütfen talep ettiginiz maasi giriniz : ");
		int salary = scan.nextInt();
		
		C5_Employees_05 calisan = new C5_Employees_05();
		
		calisan.setDob(dob);
		calisan.setName(name);
		calisan.setSalary(salary);
		int calisanYas = calisan.yasHesapla(dob);
		
		if (calisanYas > 18) {
			System.out.println("Welcome to our company " + name + " your salary is 80000.");
		} else if (calisanYas < 18) {
			System.out.println("Come back when you are 18 years old.");
		} else if (calisanYas == 18) {
			System.out.println("We can have inter with you after that you can have a " + salary + " salary");
		}
		
		scan.close();
	}

}
