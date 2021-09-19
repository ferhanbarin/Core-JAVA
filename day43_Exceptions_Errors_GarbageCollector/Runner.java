package day43_Exceptions_Errors_GarbageCollector;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("E-mail giriniz : ");
		String email = scan.nextLine();
		
		
		if (email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			System.out.println("Basarili.");
		} else {
			throw new InvalidEmailIdCheckedException("Neyin kafasi bu? Ne ictiysen banada söyle.");
		}

	}

}
