package day42_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C4_Exceptions_04 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4};
		
		System.out.println(arr[1]); // 2
		System.out.println(arr[3]); // 4
		
	//	System.out.println(arr[5]); ArrayIndexOutOfBoundsException unchecked hata verir.
		
		
		List <String> myList = new ArrayList<>(Arrays.asList("Merve", "Hakan", "Firat"));
		
		System.out.println(myList.get(2)); // Firat
		System.out.println(myList.get(0)); // Merve
		
	//	System.out.println(myList.get(5)); IndexOutOfBoundsException unchecked hata verir.
		
		
		// Array ve List'lerde olmayan bir index ile islem yapilirsa IndexOutOfBoundsException unchecked hatasi verir.

	}

}
