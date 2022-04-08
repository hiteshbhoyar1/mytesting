package polymorphism_study;

public class Son extends Father {

	public static void main(String[] args) {
		Father f= new Father();
		Son s= new Son();
		f.money();
		s.money();

	}
	public void money() {
		System.out.println("son has 10K");
	}

}
