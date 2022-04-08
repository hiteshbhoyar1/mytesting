package inheritance;

public class Son2 extends Father {

	public static void main(String[] args) {
		Son2 s= new Son2();
		s.property();
		s.laptop();
		bike();
		
		Son1 s1= new Son1();
		s1.property();
		s1.mobile();
		Son1.skin();

	}
	public void laptop() {
		System.out.println("son2's laptop");
	}
	public static void bike() {
		System.out.println("son2's bike");
	}

}
