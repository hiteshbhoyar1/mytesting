package variable_datatypes;

public class Test {
	int a= 90;  //global non-static variable
	static int b=70; // global static variable

	public static void main(String[] args) {
		Test t= new Test();  //object created
		int sum=100+t.a;
		System.out.println("the sum is "+sum);
		int sub= 100-b;
		System.out.println("the subtraction is "+sub);
		int multi=24*b;
		System.out.println("the multiplication is "+multi);
		int div=560/t.a;
		System.out.println("the division is "+div);
		int sum1=800+b;
		System.out.println("the addition is "+sum1);
		int sub1=500-t.a;
		System.out.println("the substraction is "+sub1);
		int multi1=74*t.a;
		System.out.println("the multiplication is "+multi1);
		float div1=4563.258f/b;
		System.out.println("the division is "+div1);
	}

}
