package selenium_collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queuestudy {
	public static void main(String[] args) {
		PriorityQueue<String> pq= new PriorityQueue<String>();
		pq.add("Hitesh");
		pq.add("Sanket");
		pq.add("Tanmay");
		pq.add("Ameya");
		pq.add("Parshuram");
		pq.add("Mangesh");
		pq.add("Shubham");
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.poll());
		System.out.println(pq.contains("Hitesh"));
		System.out.println(pq.remove());
		System.out.println(pq.isEmpty());
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println("=== using for each loop===");
		for(Object o:pq) {
			System.out.println(o);
		}
		System.out.println("===using iterator===");
		Iterator<String> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
