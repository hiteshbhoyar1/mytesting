package this_study;

public class This {
	int a=50;
	int b=30;
	 int c=10;

	public static void main(String[] args) {
		This t= new This();
		t.sample();

	}
	
	public void sample() {
		int a=100;
		int b=55;
		int sum=100+a;// using a=100-->local value
		System.out.println("addition using local value is "+sum);
		
		int sub=100-b;
		System.out.println("substraction using local b is "+sub);
		
		int sum1=this.a+b; // using global and local value b
		System.out.println("addition of global a and local b is "+sum1);
		
		int sum2=this.c+a; //static global c and local a
		System.out.println("addition of global c and local a is "+sum2);
		
		
	}
	//public static void test() {
	// a=40;
	//	int sum3=a+this.c; we can not use static method in this keyword 
}


