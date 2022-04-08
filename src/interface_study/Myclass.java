package interface_study;

public class Myclass implements Interface1{

	public static void main(String[] args) {
		Myclass m= new Myclass();
		m.own();
		m.add();
		m.sub();
		m.mul();
		m.div();

	}
	
	public void own() {
		System.out.println("this is the own class ");
	}

	@Override
	public void add() {
		int sum=a+b+c;
		System.out.println("the addition of the implemented class is "+sum);
		
	}

	@Override
	public void sub() {
		int sub=a-b-c;
		System.out.println("the substraction of the implemented class is "+sub);
		
	}

	@Override
	public void mul() {
		int mul=a*b*c;
		System.out.println("the multiplication of the implimented class is "+mul);
		
	}

	@Override
	public void div() {
		int div=a/c;
		System.out.println("the division of the implemented class is "+div);
	}

}
