package day29_PassByValue_MutableClass;

public class C3_ImmutableClasses_01 {

	public static void main(String[] args) {
		
		int sayi = 10;
		
		for (int i=0; i <10000 ; i++) {
			i++;
		}
		
		// Bu kodu calistirdigimizda 13. satira kadar JAVA kac obje üretir?
		// Bu soruyu cevaplamak icin degiskenin data türüne bakmaliyiz.
		// Sayi'nin veri türü: int  | int : mutable
		
		String str = "A";
		
		for (int i=0 ; i<10000 ; i++) {
			str+=" ";
		}
		
		// 17. satirla 19. satir arasinda kac obje olusur?
		// i int oldugu icin sadece 1 tane variable olusturur.
		// str String oldugundan 10001 obje olusturulur.
	}

}
