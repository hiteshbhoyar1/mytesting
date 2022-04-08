package constructor;

public class CS01 {
	public CS01() {		// THIS IS USER DEFINED ZERO PARAMETER CONSTRUCTOR
		System.out.println("running zero parameter constructor ");
	}

	public static void main(String[] args) {
		CS01 c2= new CS01();
		c2.test1();

	}
	public void test1() {		// this is non static method
		System.out.println("Non static method test1 is running");
	}

}
