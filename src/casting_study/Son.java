package casting_study;

public class Son extends Father {

	public static void main(String[] args) {
		Father f= new Son();
		f.home(); //calling sons method by reference of father class i.e. up-casting
		f.money(); //calling sons method by reference of father class i.e. up-casting
		f.car();  //fathers own property / uncommon property
		//f.bike(); we cant call the method which is uncommon between father and son

	}
	
	public void money() {
		System.out.println("son's worth is 10L");//in this we are overridding the fathers method by changing the definition in son
	}
	
	public void home() {
		System.out.println("son's home");
	}
	
	public void bike() {
		System.out.println("son's bike is unicorn");
	}

}