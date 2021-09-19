package day22_23_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C8_List_08 {

	public static void main(String[] args) {
		
		// Array ArrayList'e Cevirmek
		
		String arr[] = {"3","5","7"};
		
		List <String> arrList = Arrays.asList(arr);
		
		System.out.println("List olarak " + arrList);
		
		arr[1] = "Ali"; // Array'in bir elemanini degistirdimde otomatik olarak list'i de degistiriyor.
		System.out.println("List2 olarak " + arrList);
		
		arrList.set(0, "Ayse");
		
		System.out.println("List : " + arrList);
		System.out.println("Array : " + Arrays.toString(arr));


	}

}
