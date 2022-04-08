package interface_study;

public class Son implements Father1,Mother1 {

	public static void main(String[] args) {
		Son s= new Son();
		s.add();
		s.sub();
		s.mul();
		s.division();
		
	}

	@Override
	public void division() {
		System.out.println("division method of mother1");
		
	}

	@Override
	public void add() {
		System.out.println("sons addition");
		Father1.super.add();
		Mother1.super.add();
		
	}

	@Override
	public void sub() {
		System.out.println("substraction method of father1");
		
		
	}

	@Override
	public void mul() {
		System.out.println("multiplication method of father1");
		
		
	}

}
