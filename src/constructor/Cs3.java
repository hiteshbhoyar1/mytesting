package constructor;

public class Cs3 {
	int a; //variable declaration
	int b; //variable declaration
	int c; //variable declaration
	public Cs3() {
	 a=25;
	 b=30;
	 c=15;
	System.out.println("running constructor with zero parameter");
	
	}
	public Cs3(int num1) {
		a= num1;
		System.out.println("running constructor with one parameter");
	
	}
	public Cs3(int num1, int num2) {
		a= num1;
		b= num2;
		System.out.println("running constructor with two parameter");
	}
	public Cs3(int num1, int num2, int num3) {
		a= num1;
		b= num2;
		c= num3;
		System.out.println("running constructor with three parameter");
	}
	public static void main(String[] args) {
		Cs3 c= new Cs3();//zero parameter
		c.add();
		c.mul();
		c.sub();
		
		Cs3 c1= new Cs3(200);// one parameter
		c1.add();
		
		Cs3 c2= new Cs3(100, 140);
		c2.add();
		c2.mul();
		c2.sub();
		
		Cs3 c3= new Cs3(23, 12, 45);
		c3.add();
		c3.mul();
		c3.sub();
		
		
	}
	public void add() {
		int sum= a+b+c;
		System.out.println("the addition is "+sum);
	}
	public void sub() {
		int sub= a-b-c;
		System.out.println("the substraction is "+sub);
	}
	public void mul() {
		int mul=a*b*c;
		System.out.println("the multiplication is "+mul);
	}

}
