package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C3_Exceptions_03 {

	public static void main(String[] args) { // Inner Try-Catch * Parent child Try-Catch
		
		try { // Parent Try-Catch ---> File yerini kontrol ediyor. Ya evde yoksa hatasini handle ediyor.
			FileInputStream fis = new FileInputStream("C:\\Users\\ferha\\eclipse-workspace\\JAVA2021SummerTR\\src\\day41_Exceptions\\File");
			
		 int i=0;
		
		try { // Child Try-Catch ---> File icerigini okuma ve yazdirma islemini handle etti.
			while((i=fis.read()) != -1) { // INT degeri fis obj. read methodu ile atandiginda -1 esit degilse while body gir.
				System.out.print((char)(i));
				
			}
		
		} catch (IOException e) { // I: Input - O: Output
			e.printStackTrace(); // Daha cok kullanilir. Cünkü hatanin tüm verisini verir. Handle(fix) kolayligi saglar.
			System.out.println(e.getMessage());
		}
		
		
		}
	
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n");
		System.out.println("Bu yaziyi okuyorsan kod bu satira kadar sorunsuz RUN olmustur.");	
	}

}
