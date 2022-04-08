package inheritance;

public class Multilevelinheritance {

	public static void main(String[] args) {
		Daughter d= new Daughter();
		d.experience();//calling property from supermost class
		d.look(); // calling property from super class
		d.mobile();// calling property from own class
		d.nature();//calling property from super class
		Daughter.money();// calling static property from super class using subclass name
		Daughter.scooty();// calling static property from subclass using subclass name

	}

}
