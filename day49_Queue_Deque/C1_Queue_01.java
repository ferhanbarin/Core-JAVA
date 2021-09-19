package day49_Queue_Deque;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue_01 {

	public static void main(String[] args) {
		
	/*
		 FIFO: First in First out ---> Elemanlar ilk eklenen ilk silinir. Örn: Eczane, yemekhane vs. sektörlerde zaman kaybi olan elemanlarin tutulmasinda kullanilir.
		 Queue: Interface'nin iki subClass constructor'u ile obj creat edilebilir.
		 LinkedList constructor ile obj creat edilirse elemanlar Queue icinde insertion order'e göre siralanir.
		 PriorityQueue constructor'u ile obj creat edilirse elemanlar Queue icinde JAVA'nin kendine özel algoritmasina göre siralanir.
	*/
		
		Queue <String> q1 = new LinkedList<>(); // Obj icin constructor.
												// Queue interface'dir dolayisiyla constructor'i yoktur. Queue olusturmak icin child class’i olan LinkedList veya PriorityQue kullanilabilir.
	
		q1.add("Basri");
		q1.add("Hakan");
		q1.add("Sedef");
		q1.add("Ahmet");
		System.out.println(q1); // [Basri, Hakan, Sedef, Ahmet] --> JAVA LinkedList geregi insertion order'e göre sira olusturdu.
		
		
		Queue <String> q2 = new PriorityQueue<>(); // Obj icin constructor.
		
		q2.add("Rabia");
		q2.add("Oguz");
		q2.add("Yagmur");
		q2.add("Mehmet");
		System.out.println(q2); // [Mehmet, Oguz, Yagmur, Rabia] --> JAVA kendi PriorityQueue(öncelik sirasi) algoritmasini calistirdi.
		
		System.out.println(q1.peek()); // Basri --> Ilk elemani silmeden return eder.
		System.out.println(q1); // [Basri, Hakan, Sedef, Ahmet]
		
		System.out.println(q1.poll()); // Basri --> Ilk elemani silerek return eder.
		System.out.println(q1); // [Hakan, Sedef, Ahmet]
		
		// q1.remove(); --> Ilk elemani siler.
		// System.out.println(q1); --> [Sedef, Ahmet]
		
		// q1.clear(); q1 artik bos.
		// System.out.println(q1.poll()); null ---> Bos bir obje'den ilk elemani silip return etme komutu girdik.
		// System.out.println(q1.remove()); NoSuchElementException ---> Bos bir obje'den ilk eleman silip return etme komutu girdik.
		
		System.out.println(q1.offer("Merve")); // true --> offer() method'u add() method'u gibi eleman ekler ancak eleman siniri konulduysa add() method'u IllegalStateException firlatir. 
											  //  Ancak offer() method'unda bu durumlarda kod calismaya devam eder.
		
		System.out.println(q1); // [Hakan, Sedef, Ahmet, Merve] 
		
		

	}

}
