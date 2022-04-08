package loops;

public class Do_While_Loops {

	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println("Hi I am Hitesh");
			i++;
		}
		while(i<=5);
		
		int a=10;
		do {
			System.out.println(a);
			a--;
		}
		while(a>=1);
		loop();
		test();

	}
	public static void loop() {
		int a=1;
		do {
			System.out.println("the cube root of "+a+" is " +a*a);
			a=a+2;
		}
		while(a<=10);
		System.out.println("=============");
		do {
			System.out.println("circumference of circle of radius "+a+" is "+2*a*3.143);
			a++;
		}
		while(a<=20);
		System.out.println("==================================");
		do {
			System.out.println("the square of "+a+" is "+a*a);
			a=a+2;
		}
		while(a<=30);
		System.out.println("======================");
		do {
			System.out.println("area of triangle "+a+" is "+a*a/2);
			a++;
		}
		while(a<=40);
	}
	public static void test(){
		int a=30;
		do {
			System.out.println("the div. of numbers "+a+" is "+a/2);
			a--;
		}
		while(a>=20);
		do {
			System.out.println("the area of circle "+a+" is "+a*a*3.14);
			a=a-2;
		}
		while(a>=10);
		do {
			System.out.println("the square of "+a+" is "+a*a);
			a=a-2;
		}
		while(a>=0);
		
	}
	
		
	}
	
	


