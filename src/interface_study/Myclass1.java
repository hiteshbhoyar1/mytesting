package interface_study;

public class Myclass1 implements Interface2 {

	public static void main(String[] args) {
		Myclass1 m= new Myclass1();
		m.test();
		m.m1();
		m.m2();
		m.m3();
		m.m4();
		

	}
	public void test() {
		System.out.println("test is own method of Myclass1");
	}

	@Override
	public void m1() {
		System.out.println("m1 from interface_ completed in implementation class");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 from interface_ completed in implementation class");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 from interface2 completed in implementation class");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 from interface2 completed in implementation class");
		
	}

}
