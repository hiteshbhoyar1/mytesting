package selenium_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetstudy {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add("ek");
		ts.add("Wani");
		ts.add("Pune");
		ts.add("125");
		ts.add("wani");
		ts.add("main");
		ts.add("Nagpur");
		ts.add("Chandrapur");
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("125"));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println("===for each loop==");
		for(Object o:ts) {
			System.out.println(o);
		}
		System.out.println("===iterator==");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
