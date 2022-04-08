package interface_study;

public class Mycl2 implements Mycl,Mycl1{

	public static void main(String[] args) {
		Mycl2 cl= new Mycl2();
		cl.sub();
		Mycl.add();
	    Mycl1.add();

	}

	@Override
	public void sub() {
		System.out.println("substraction method of mycl1");
		
	}

}
