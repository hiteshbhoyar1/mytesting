package method_;

public class Static3 {

	public static void main(String[] args) {
		System.out.println("main method is running");
		// to call static method from another class 
		// use syntax: Classname.methodname
		Static2.test5();
		Static1.test1();
		Static2.case2();
		Static2.mark1();
		Static2.test3();
		case1();
	}
	public static void case1() {
		System.out.println("this is sample case1");
	}

}
