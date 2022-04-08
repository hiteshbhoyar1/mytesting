package selenium_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetstudy {

	public static void main(String[] args) {
		HashSet hs= new HashSet<>();
		hs.add("Hitesh");
		hs.add(125);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		hs.add(125);
		hs.add("Pune");
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println("===using for each loop==");
		for(Object o:hs) {
			System.out.println(o);
		}
		System.out.println("====using iterator==");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
