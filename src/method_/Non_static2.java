package method_;

public class Non_static2 {

	public static void main(String[] args) {
		Non_static2 d = new Non_static2(); // object created
		d.demo();
		// for calling non static method from another class we need to create object from the another class
		Non_static1 c1= new Non_static1(); // object created
		c1.case10();
		c1.case2();
		c1.case4();
		System.out.println("below is the static method from same class");
		demo1();
		Static1.test1(); //this is the static method from another class
		c1.case5();
		

	}
	public void demo() {
		System.out.println("Hi this is non-static regular method ");
	}
	public static void demo1() {
		System.out.println("hi this is static regular method");
	}
}
