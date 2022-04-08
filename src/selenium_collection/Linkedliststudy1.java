package selenium_collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedliststudy1 {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList<>();
		ll.add("name");
		ll.add(1254);
		ll.add(null);
		ll.add(1254);
		ll.add(null);
		ll.add(4569);
		ll.add("joker");
		ll.add("soch");
		ll.add(1254);
		ll.add(null);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println("==================");
		for(Object o:ll) {
			System.out.println(o);
		}
		System.out.println("==================");
		for(int i=0;i<=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("==================");
		ListIterator lit = ll.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("==================");
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
		
	}

}
