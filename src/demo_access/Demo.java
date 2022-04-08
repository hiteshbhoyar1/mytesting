package demo_access;

import access_specifier.AS1;

public class Demo   {

	public static void main(String[] args) {
		AS1 d= new AS1();
		d.test2();
		
		System.out.println("public variable from as1 of diff package "+d.b);
		
	}

}
