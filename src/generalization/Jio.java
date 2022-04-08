package generalization;

public class Jio implements Trai {

	@Override
	public void call() {
		System.out.println("call rate of jio is 0.5rs/min");
		
	}

	@Override
	public void sms() {
		System.out.println("jio gives 150sms/day");
		
	}

	@Override
	public void data() {
		System.out.println("jio data plan is 1.5gb/day");
		
	}
	public void jiotv() {
		System.out.println("jio provides jio tv app");
	}

}
