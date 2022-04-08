package casting_study;

public class Implicit_explicitstudy {//converting information from one data type to another data type is known as casting
	

	public static void main(String[] args) {
		int a=21;
		System.out.println("the value of a is "+a);
		float b=a;
		System.out.println("the value of b is "+b);//this is the example of implicit of primitive casting 
		
		float c=21.124f;
		System.out.println("the value of c is "+c);
		int d=(int)c;
		System.out.println("the value of d is "+d);
		
		int e=45;
		System.out.println("the value of e is "+e);
		double f=e;
		System.out.println("the value of f is "+f);
		
		double g=210123654;
		System.out.println("the value of g is "+g);
		int h=(int)g;
		System.out.println("the value of h is "+h);
		
		byte a1=45;
		System.out.println("the vlaue of a1 is "+a1);
		float b1=a1;
		System.out.println("the value of b1 is "+b1);

	}

}
