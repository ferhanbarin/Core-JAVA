package day49_Queue_Deque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C2_Deque_01 {

	public static void main(String[] args) {
		
		Deque <String> dq1 = new LinkedList<>(Arrays.asList("Suna", "Onur", "Süleyman", "Harun")); 
											// Deque bir interface’dir. Dolayisiyla constructor'i yoktur. LinkedList constructor'i kullanilarak Deque olusturulabilir.
		
		System.out.println(dq1); // [Suna, Onur, Süleyman, Harun]
		System.out.println(dq1.peekFirst()); // Suna --> Ilk elemani silmeden verir.
		
		System.out.println(dq1.pollFirst()); // Suna --> Ilk elemani silerek verir.
		System.out.println(dq1); // [Onur, Süleyman, Harun]
		
		System.out.println(dq1.peekLast()); // Harun --> Son elemani silmeden verir.
		System.out.println(dq1); // [Onur, Süleyman, Harun]
		
		System.out.println(dq1.pollLast()); // Harun --> Son elemani silerek verir.
		System.out.println(dq1); // [Onur, Süleyman]
		
		dq1.add("Yunus");
		dq1.add("Yusuf");
		System.out.println(dq1); // [Onur, Süleyman, Yunus, Yusuf]
		
		System.out.println(dq1.getFirst()); // Onur --> Istenen ilk elemani getirir ancak silmez.
		System.out.println(dq1.getLast()); // Yusuf --> Istenen son elemani getirir ancak silmez.
		System.out.println(dq1); // [Onur, Süleyman, Yunus, Yusuf]
		
		System.out.println(dq1.pop()); // Onur --> Ilk elemani silerek verir.
		System.out.println(dq1); // [Süleyman, Yunus, Yusuf]
		
		dq1.clear(); // Deque'i bosalttik.
		System.out.println(dq1.element()); // Bos Deque'den element() method'u ile ilk eleman cagirilirsa NoSuchElementException firlatir.
		System.out.println(dq1.pop()); // Onur --> Bos Deque'den pop() method'u ile ilk eleman cagirilirsa NoSuchElementException firlatir.
		System.out.println(dq1); // [Süleyman, Yunus, Yusuf]
		
		// System.out.println(dq1.peekFirst()); null --> Bos siradan ilk elemani cagirdik null verdi fakat code kirilmadi.
		// System.out.println(dq1.peekLast());  null --> Bos siradan son elemani cagirdik null verdi fakat code kirilmadi.
		
		// System.out.println(dq1.getFirst()); Bos siradan get() method'u ile ilk eleman cagirilirsa NoSuchElementException firlatir.
		// System.out.println(dq1.getLast());  Bos siradan get() method'u ile son eleman cagirilirsa NoSuchElementException firlatir.
	}

}
