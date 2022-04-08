package constructor;

public class Constructor_study {
	int a;
	int b;
	int c;
	public Constructor_study() {
		a=100;
		b=200;
		c=300;
		System.out.println("constructor with zero parameter");
	}
	public Constructor_study(int num1) {
		a=num1;
		System.out.println("constructor with one parameter");
	}
	public Constructor_study(int num1, int num2) {
		a=num1;
		b=num2;
		System.out.println("constructor with two parameter");
	}
	public Constructor_study(int num1,int num2,int num3) {
		a=num1;
		b=num2;
		c=num3;
		System.out.println("constructor with three parameter");
	}
	
public static void main(String[] args) {
	Constructor_study c= new Constructor_study();
	c.addition();
	Constructor_study c1= new Constructor_study(300);
	c1.addition();
	c1.substraction();
	Constructor_study c2=new Constructor_study(100,50);
	c2.addition();
	c2.substraction();
	Constructor_study c3=new Constructor_study(10,5,5);
	c3.multiplication();
	c3.addition();
	
		
}
public void addition() {
	int sum=a+b+c;
	System.out.println("the addition is "+sum);
}
public void substraction() {
	int sub=a-b-c;
	System.out.println("the substraction is "+sub);
}
public void multiplication() {
	int mul=a*b*c;
	System.out.println("the multiplication is "+mul);
}
}
