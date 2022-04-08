package selenium_collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedliststudy {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList<>();
		ll.add("The");
		ll.add("Most");
		ll.add("Beatifull");
		ll.add("creation");
		ll.add("By God");
		ll.add("Is");
		ll.add("Mother");
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println("===using list iterator====");
		ListIterator li = ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("==using iterator");
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("====using for each loop");
		for(Object o:ll) {
			System.out.println(o);
			
		}
		System.out.println("====using for loop====");
		for(int i=0;i<=ll.size()-1;i++){
			System.out.println(ll.get(i));
		}
	}

}
