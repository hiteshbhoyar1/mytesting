package method_;

public class Math_operation {
	public void addition() {
		int a= 20; // both variable declaration and initialization are in one step
		int b= 40;
		int sum= a+b;
		System.out.println("the addition of both is "+sum);
	}

	public static void main(String[] args) {
		Math_operation m= new Math_operation(); // object created
		m.addition();
		subtraction(); // this is static method 
		m.multiplication();
		division(); // this is static method 
		addition1(); //this is static method
		m.subtraction1();

	}
	public static void subtraction() {
		int a= 40; // both variable declaration and initialization comes in one step
		int b= 20;
		int sub= a-b;
		System.out.println("the answer after subtraction is "+sub);
	}
	public void multiplication() {
		int a= 9; 
		int b= 8;
		int multi= a*b;
				System.out.println("the answer after multiplication is "+multi);
	}
	public static void division() {
		int a= 124;
		int b=4;
		int div= (a/b);
		System.out.println("the answer after division is "+div);
	}
	public static void addition1() {
		int a= 4587;
		int b= 5847;
		int sum=  (a+b);
		System.out.println("the answer after addition is "+sum);
	}
	public void subtraction1() {
		int a=4589;
		int b=1254;
		int sub= a-b;
		System.out.println("the answer is "+sub);
	}
}
