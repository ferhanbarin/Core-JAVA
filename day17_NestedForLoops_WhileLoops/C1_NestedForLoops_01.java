package day17_NestedForLoops_WhileLoops;

import java.util.Scanner;

public class C1_NestedForLoops_01 {

	public static void main(String[] args) {
		
		/*
		Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
	 	*
	 	* *
	 	* * *
	 	* * * *
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir rakam giriniz.");
		int rakam = scan.nextInt();
		
		// Mesela kullanici 5 girmis olsun.
		
		for (int satirNo=1 ; satirNo<=rakam ; satirNo++) {
			
			for (int i=1 ; i<=satirNo ; i++) {
				System.out.print("* ");
				
			}
			
			System.out.println("");
		}
	}

}
