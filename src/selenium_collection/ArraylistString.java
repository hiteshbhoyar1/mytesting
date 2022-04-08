package selenium_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistString {

	public static void main(String[] args) {
	ArrayList<String> s= new ArrayList<>();
	s.add("Hitesh");
	s.add("Gopalrao");
	s.add("Bhoyar");
	s.add("Gulmohar");
	s.add("Park");
	s.add("Wadgaon");
	s.add("Road");
	s.add("Wani");
	System.out.println(s);
	System.out.println(s.size());
	s.add("dist.Yavatmal");
	System.out.println(s);
	
	System.out.println("using for each loop");
	for(Object o:s) {
		System.out.println(o);
	}
	System.out.println("using iterator");
	Iterator<String> it = s.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("using for loop forward");
	for(int i=0;i<=s.size()-1;i++) {
		System.out.println(s.get(i));
	}
	System.out.println("using for loop reverse");
	for(int j=s.size()-1;j>=0;j--) {
		System.out.println(s.get(j));
	}
	}

}
