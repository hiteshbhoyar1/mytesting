package selenium_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_study {

	public static void main(String[] args) {
		LinkedHashSet lh= new LinkedHashSet();
		lh.add("Happy");
		lh.add(null);
		lh.add("Sad");
		lh.add("Happy");
		lh.add(125);
		lh.add(45);
		lh.add(125);
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());
		System.out.println(lh.contains("Sad"));
		System.out.println("===for each loop===");
		for(Object o:lh) {
			System.out.println(o);
		}
		System.out.println("===iterator==");
		Iterator it = lh.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
