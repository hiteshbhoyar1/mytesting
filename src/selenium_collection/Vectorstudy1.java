package selenium_collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vectorstudy1 {

	public static void main(String[] args) {
		Vector<Integer> in = new Vector<Integer>();
		in.add(12);
		in.add(0, null);
		in.add(52);
		in.add(1, 23);
		in.add(41);
		in.add(0, 78);
		in.add(96);
		in.add(52);
		in.add(0, 41);
		System.out.println(in);
		System.out.println(in.size());
		System.out.println(in.capacity());
		System.out.println("==using enumeration====");
		Enumeration<Integer> ele = in.elements();
		while(ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
		System.out.println("=======using for each loop===");
		for(Object o:in) {
			System.out.println(o);
		}
		System.out.println("====using iteration====");
		Iterator<Integer> it = in.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===using for loop====");
		for(int i=0;i<=in.size()-1;i++) {
			System.out.println(in.get(i));
		}

	}

}
