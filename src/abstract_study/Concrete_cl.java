package abstract_study;

public class Concrete_cl extends Abs{

	public static void main(String[] args) {
		Concrete_cl cl= new Concrete_cl();
		cl.test();
		cl.test1();

	}

	
	public void test1() {
		System.out.println("this method is completed by using concrete class.");
		
	}

}
