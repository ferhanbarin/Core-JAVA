package day42_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C2_Exceptions_02 {

	public static void main(String[] args) {
		
		/*
		 	Eger handle edilecek exceptions'lar arasinda parent-child iliskisi varsa parent class exceptions'u creat edilip child class exceptions'u olmadan da code calisir. Ancak; 
			Olumlu Durum: Tek catch body ile tüm exceptions handle edilebilir.
			Olumsuz Durum: Bir hata durumunda hatanin türü, verileri vs. ulasilamayacagi icin handle edilme inkani olmaz.
		*/
		
		try { 
            FileInputStream fis = new FileInputStream("C:\\Users\\ferha\\eclipse-workspace\\JAVA2021SummerTR\\src\\day41_Exceptions\\File");
               
       fis.close(); 
       
       int i = 0;
       
       while ((i = fis.read()) != -1) { 
                                       
           System.out.print((char) (i)); 
                                            
       }
   }
		
      catch (IOException e)  { 
                            
       
        
       System.out.println(e.getMessage()); 
   }
   
   System.out.println("\n");
   System.out.println("Bu yaziyi okuyorsan kod bu satira kadar sorunsuz RUN olmustur.");

	}

}
