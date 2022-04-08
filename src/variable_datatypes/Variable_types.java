package variable_datatypes;

public class Variable_types {
	int a= 30; // global non-static variable
	static int b= 20; // global static variable 

	public static void main(String[] args) {
	System.out.println("the value of b is "+b);
	
	Variable_types gv= new Variable_types(); // created object of class
	
	System.out.println("the value of a is "+gv.a); //calling global non-static variable 
	
	gv.test();
	test1();
	}
	public void test() {
		int c=10; //local variable 
		int sum= a+c; // using global variable adding in local 
		System.out.println("the addition is "+sum);
	}
	public static void test1() { 
	int d= 40; // local variable 
	int sub= d-b; // using global static variable 
	System.out.println("the substraction is "+sub);
}
}
