package method_;

public class Static2 {

	public static void main(String[] args) {
		System.out.println("the result");
		mark1();
		test1();
		case1();
		case2();
		test3();
		test4();
		test5();
		System.out.println("end");
	}
	public static void mark1() {
		System.out.println("this is my result");
		float a,b,c,d;
		a=78;
		b=74;
		c=81;
		d=77;
		float percentage= (a+b+c+d)/4;
		boolean result;
		result= true;
		System.out.println("the % is "+percentage);
		System.out.println("the result is "+result);
	}
	public static void test1() {
		System.out.println("my college name is acs college maregaon ");
		System.out.println("I completed my degree in B.Sc.");
	
}
	public static void case1() {
		System.out.println("the boy is shorter than the two girls ");
		
	}
	public static void case2() {
		System.out.println("but the boy is taller in boys");
	}
	public static void test3() {
		System.out.println("this is regular static method ");
		
	}
	public static void test4() {
		System.out.println("the method is now ending");
	}
	public static void test5() {
		System.out.println("honda is biggest bike manufacture in world");
	}
}


