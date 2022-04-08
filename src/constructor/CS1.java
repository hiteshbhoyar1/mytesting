package constructor;

public class CS1 {
	int a; // variable declaration
	int b; // variable declaration
	int c; // variable declaration
	
	public CS1() {         // constructor with zero parameter
		a= 125;
		b=524;
		c=124;
		System.out.println("running zero parameter constructor");
		
	} 
	public CS1(int num1) {			// constructor with one parameter
		a=num1;
		System.out.println("running constructor with one parameter");
		System.out.println("the value of a is "+a);
	}
	public CS1(int num1, int num2) {	// constructor with two parameter
		a= num1;
		b= num2;
		System.out.println("running contructor with two parameter");
	}
	public CS1(int num1, int num2, int num3) {
		a= num1;
		b= num2;
		c= num3;
		System.out.println("running constructor with three parameter");
	}
	
	
	public static void main(String[] args) {
		CS1 c1= new CS1();   // object created
		c1.addition();
		CS1 c2= new CS1(800);
		c2.addition();
		CS1 c3= new CS1(450,120);
		c3.addition();
		CS1 c4= new CS1(450, 200, 100);
		c4.addition();
		CS1 c5= new CS1(300,210 );
		c5.subtraction();
		CS1 c6= new CS1(7, 5, 13);
		c6.multiplication();

	}
public void addition() {
	int sum= a+b+c;
	System.out.println("the addition is "+sum);
}
public void subtraction() {
	int sub= a-b-c;
	System.out.println("the subtraction is "+sub);
}
public void multiplication() {
	int multi=a*b*c;
	System.out.println("the answer is "+multi);
}
}
