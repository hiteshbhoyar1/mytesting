package method_;

public class Non_static1 {

	public static void main(String[] args) {
		// calling non static method --> need to create object
		// to create object use syntax---> classname objectname= new classname();
		Non_static1 c4= new Non_static1();
		// to call non- static method from same class syntax---> objectname.methodname
		c4.case1();
		c4.case2();
		c4.case3();
		c4.case4();
		c4.case5();
		c4.case6();
		c4.case7();
		c4.case8();
		c4.case9();
		c4.case10();
		System.out.println("below is the statement of static method from same class");
		case11();
		System.out.println("below is the statement of static method from another class");
		Static1.test1();
	}
	public void case1() {
		int num;
		num= 152;
		System.out.println("the number is "+num);
	}
	public void case2() {
		System.out.println("this is non static method case2");
	}
	public void case3() {
		System.out.println("the statement of prime minister");
		System.out.println("about the hike in the price of diesel and petrol");
	}
	public void case4() {
		System.out.println("finally the new agricultural rule has been called off on 19 november");
	}
	public void case5() {
		byte num;
		num= 120;
		System.out.println("the total number of marks in maths written paper is "+num);
	}
	public void case6() {
		boolean pass;
		pass= true;
		System.out.println("all the students in the class has been passed in first attempt "+pass);
	}
	public void case7() {
		float num;
		num= 53.25896547f;
				System.out.println("the float value is "+num);
	}
	public void case8() {
		double value;
		value= 1254.25896547547125;
		System.out.println("the double value is "+value);
	}
	public void case9() {
		char level;
		level= 'A';
		System.out.println("the payment has been done by level "+level);
	}
	public void case10() {
		String bank;
		bank= "bank of india";
		System.out.println("my bank name is "+bank);
	}
	public static void case11() {
		System.out.println("this is regular static method");
	}
}
