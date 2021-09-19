package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C1_Exceptions_01 {

	public static void main(String[] args) {
		
		try { // Parent Try-Catch ---> File yerini kontrol ediyor. Ya evde yoksa hatasini handle ediyor.
             FileInputStream fis = new FileInputStream("C:\\Users\\ferha\\eclipse-workspace\\JAVA2021SummerTR\\src\\day41_Exceptions\\File");
                
        fis.close(); //fis obj close edildi.
        
        int i = 0;
        
        while ((i = fis.read()) != -1) { // INT degeri fis obj. read methodu ile atandiginda -1 esit degilse while body gir.
                                        
            System.out.print((char) (i)); // (i) data casting ile i'nin ASCII degeri yerine char degerleri yazdirildi.
                                             
        }
    }
		
    catch (FileNotFoundException e) {
       
        System.out.println(e.getMessage());
    }
		
    catch (IOException e)  { // I: Input - O: Output dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder.
                             
        // e.printStackTrace(); Daha cok kullanilir cunku hatanin tum verisini verir. Handle kolayligi saglar.
         
        System.out.println(e.getMessage()); // Hata mesajini yazdirir.
    }
    
    System.out.println("\n");
    System.out.println("Bu yaziyi okuyorsan kod bu satira kadar sorunsuz RUN olmustur.");


	}

}
