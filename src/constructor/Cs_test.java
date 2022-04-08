package constructor;

public class Cs_test {

	public static void main(String[] args) {
		Variable_call vc= new Variable_call(); // new object created for another class
		System.out.println("value of a is "+vc.a);
		System.out.println("the value of b is "+vc.b);
		System.out.println("the name of the string is "+vc.name);
	}

}
