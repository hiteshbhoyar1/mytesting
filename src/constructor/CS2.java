package constructor;

public class CS2 {
	// variable declaration
	float a;
	float b; 
	float c;
	public CS2(){	//constructor with zero parameter
		a= 214.1235f;
		b= 147.32145f;
		c= 214.32589f;
		System.out.println("running sonstructor with zero parameter");
	}
	public CS2(float num1) {
		a= num1;
		System.out.println("running constructor with one parameter");
	}
	public CS2(float num1, float num2) {
		a=num1;
		b=num2;
		System.out.println("running constructor with two parameter");
	}
	public CS2(float num1, float num2, float num3) {
		a=num1;
		b=num2;
		c=num3;
		System.out.println("running constructor with three parameter");
	}
	
	public static void main(String[] args) {
		CS2 obj1= new CS2();
		obj1.subtration();
		CS2 obj2= new CS2(124.3214f);
		obj2.subtration();
		CS2 obj3= new CS2(65.214789f, 61.258963f);
		obj3.subtration();
		CS2 obj4= new CS2(12.3f, 20.2f, 10.21f);
		obj4.multiplication();
		CS2 obj5= new CS2(12.32f, 124.23f);
		obj5.multiplication();
	}
	public void subtration() {
		float sub= a-b-c;
		System.out.println("the subtraction is "+sub);
	}
	public void multiplication() {
		float multi= a*b*c;
		System.out.println("the multiplication is "+multi);
	}
	
}
