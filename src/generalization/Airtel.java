package generalization;

public class Airtel implements Trai {

	@Override
	public void call() {
		System.out.println("the call rate of airtel is 1rs/min");
		
	}
	
	@Override
	public void sms() {
		System.out.println("airtel gives 100sms/day");
	}

	@Override
	public void data() {
		System.out.println("airtel data plan is 1gb/day");
		
	}
	
	public void money() {
		System.out.println("airtel provide airtel money app to customers");
	}
	

}
