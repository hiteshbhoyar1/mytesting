package method_;

public class Static1 {

	public static void main(String[] args) {
		System.out.println("the main method is running");
		test1();
		test2();
		test1();
		test2();
		System.out.println("end of main method");
	}

	// public static void test1();---> incomplete method/ method declaration
	
	public static void test1() {
		System.out.println("this is static method test1");
	}
		public static void test2() {
			System.out.println("this is static test2 method");
			
		}
		}
		
	
	

