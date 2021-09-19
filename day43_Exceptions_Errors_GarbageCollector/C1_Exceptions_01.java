package day43_Exceptions_Errors_GarbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C1_Exceptions_01 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ferha\\eclipse-workspace\\JAVA2021SummerTR\\src\\day41_Exceptions\\File");
		
		 int i=0;
				
		 while((i=fis.read()) != -1) { 
			System.out.print((char)(i));
				
			}

	/*
	 * "throws" keyword'u sadece declarations'dir. "thorows" kullanilan method'da exception olursursa CODE BLOCK olur.
	 * Exceptions arasinda parent-child iliskisi varsa parent class exception throws'dan sonra yazilmalidir.
	 */

	}

}