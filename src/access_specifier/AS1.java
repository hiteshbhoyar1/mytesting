package access_specifier;

public class AS1 {
	int a=10;
	public int b=20;
	private int c=30;
	protected int d=40;

	public static void main(String[] args) {
		AS1 s= new AS1();
		s.test1();
		s.test2();
		s.test3();
		s.test4();
		
		System.out.println("default global variable a is "+s.a);
		System.out.println("public global variable b is "+s.b);
		System.out.println("private global variable is "+s.c);
		System.out.println("protected global variable is "+s.d);

	}
	 void test1() {
		System.out.println("default test1 method from AS1");
	}
	public void test2() {
		System.out.println("public test2 from method AS1");
	}
	private void test3() {
		System.out.println("private test3 from method AS1");
	}
	protected void test4() {
		System.out.println("protected test4 from AS1");
	}

}
