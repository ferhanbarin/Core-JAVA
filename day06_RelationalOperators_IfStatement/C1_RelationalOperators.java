package day06_RelationalOperators_IfStatement;

public class C1_RelationalOperators {

	public static void main(String[] args) {
		
		
		System.out.println(15*3==40); // false döner.
		System.out.println(15-3==12); // true döner.
		
		
		boolean esitMi = 24/2==12;
		System.out.println(esitMi);
		
		
		// != Esit degidir isareti.
		
		boolean sonuc1 = 5+2!=7;
		System.out.println(sonuc1);
		
		System.out.println(5*2!=15);
		
		
		// >= Büyük veya esittir  ----  <= Kücük veya esittir
		
		boolean sonuc2 = 5+2 >= 7;
		System.out.println(sonuc2);
		
		
		// &&: tüm ifadeler dogruysa TRUE olur.  -----  ||: tüm ifadeler yanlissa false olur. diger tüm durumlarda true döner. en az bir tanesi dogru olmak zorunda.
		
		boolean sonuc3 = (5+2==7) && (4+3!=5);
		
		System.out.println((5*2 != 15 && (5>7)));
		
		
		boolean sonuc4 = (5+2 == 7) || (4+3 !=5);
		
		System.out.println((5*2 == 15) || (5>7));
		
		
		
		System.out.println(5+2>8 || 9<6); // False
		System.out.println(5+2<8 || 9<6); // True (en az bir tanesi dogru oldugu icin)
		
		System.out.println(5+2<8 && 9<6); // False
		System.out.println(5+2<8 || 9>=6); // True
		
		
		
		
		
		
		
		

	}

}
