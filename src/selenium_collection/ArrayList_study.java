package selenium_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_study {

	public static void main(String[] args) {
		ArrayList al= new ArrayList<>();				
		al.add("Hitesh");
		al.add('A');
		al.add(25000.32);
		al.add(null);
		al.add(0);
		al.add('A');
		al.add("Hitesh");
		System.out.println(al);
		System.out.println(al.size());
		al.add("gulmohar");
		al.add(0, "Wani");;
		System.out.println(al);
		System.out.println(al.size());
		//al.remove(0);
		al.remove("Wani");
		System.out.println(al);
		boolean res = al.contains(null);
		System.out.println(res);
		System.out.println(al.contains(123));
		boolean res1 = al.isEmpty();
		System.out.println(res1);
		Object get = al.get(5);
		System.out.println(get);
		
		System.out.println("======using for loop======");
		for(int i=0; i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		System.out.println("======using iterator=========");
		Iterator it = al.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
			
		}
		System.out.println("======using for each loop======");
		for(Object o:al) {
			System.out.println(o);
		}
		

	}

}
