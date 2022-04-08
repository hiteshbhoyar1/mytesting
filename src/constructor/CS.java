package constructor;

public class CS {	// default constructor 
	//compiler will create constructor for us ===> default constructor

	public static void main(String[] args) {
		CS c1= new CS();
		c1.test1();
		test2();

	}
	public void test1() {
		System.out.println("Hi this is non static method of test 1 ");
		System.out.println("winter is coming");
	}
	public static void test2() {
		System.out.println("this is static method of test 2");
		System.out.println("Tigerian john snow");
	}
	
}
