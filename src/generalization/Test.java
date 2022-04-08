package generalization;

public class Test {

	public static void main(String[] args) {
		Airtel a= new Airtel();
		a.call();
		a.sms();
		a.data();
		a.money();
		System.out.println("Rate of airtel sim is "+Trai.cost);
		System.out.println("===========================");
		
		Jio j= new Jio();
		j.call();
		j.sms();
		j.data();
		j.jiotv();
		System.out.println("Rate of jio sim is "+Trai.cost);
		System.out.println("============================");
		
		VI v= new VI();
		v.call();
		v.sms();
		v.data();
		v.carry();
		System.out.println("Rate of vi sim is "+Trai.cost);

	}

}
