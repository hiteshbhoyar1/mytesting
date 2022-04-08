package selenium_collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector v= new Vector<>();
		v.add("Hitesh");
		v.add(10);
		v.add(0, 12);
		v.add('G');
		v.add(null);
		v.add(10);
		v.add(2, "Wani");
		v.add("Pune");
	
		System.out.println(v);
		System.out.println("the size of the vector class is "+v.size());
		System.out.println("the capacity of the vector class is "+v.capacity());
		Object get = v.get(0);
		System.out.println("the value at the 0th index is "+get);
		boolean res = v.isEmpty();
		System.out.println(res);
		System.out.println("==using for each loop===");
		for(Object o:v) {
			System.out.println(o);
		}
		System.out.println("====using for loop====");
		for(int i=0;i<=v.size()-1;i++) {
			System.out.println(v.get(i));
		}
		System.out.println("====using iterator =========");
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("====by using enumeration==");
		Enumeration ele = v.elements();
		while(ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
		
		
	}

}
