package selenium_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_study1 {

	public static void main(String[] args) {
		ArrayList<Integer>in=new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(7);
		in.add(8);
		in.add(9);
		in.add(5);
		System.out.println(in);
		System.out.println(in.size());
		in.remove(0);
		System.out.println(in);
		in.add(0, 1);
        System.out.println(in);
        in.remove(0);
        System.out.println(in);
        in.add(0, 1);
        System.out.println(in);
        
        System.out.println("using for each loop");
        for(Object o:in) {
        	System.out.println(o);
        }
        System.out.println("using while loop");
        Iterator<Integer> it = in.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        System.out.println("for loop forward");
        for(int j=0;j<=in.size()-1;j++) {
        	System.out.println(in.get(j));
        }
        System.out.println("using for loop reverse");//reverse
        for(int i=in.size()-1;i>=0;i--) {
        	System.out.println(in.get(i));
        }

	}

}
