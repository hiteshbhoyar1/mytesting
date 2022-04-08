package selenium_collection;

import java.util.ArrayList;

public class Arraaylist1 {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<String>();
	     list.add(null);
	     list.add(0, "A");
	     list.add(null);
	     list.add(2, "B");
	     list.add("20");
	     list.add(1, "C");
	    System.out.println(list);

	    ArrayList<String> list1 = new ArrayList<String>();
	    list1.add("Orange");
	    list1.add(0, "Banana");
	  
	   ArrayList<String> arList = new ArrayList<>();
	    arList.add("Apple");
	    list1.add("Grapes");
	    list1.addAll(2, arList);
	    System.out.println(list1);
	}

}
