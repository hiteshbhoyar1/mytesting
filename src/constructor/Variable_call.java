package constructor;

public class Variable_call {
	int a= 90;		// non static variable 
	int b= 70;	//non static variable 
	String name = "Hitesh";

	public static void main(String[] args) {
	Variable_call v= new Variable_call();
	System.out.println("value of variable a is "+v.a);	// calling non static variable 
	System.out.println("the value of variable b is "+v.b);
	System.out.println("the name of the string is "+v.name);
	

	}

}
