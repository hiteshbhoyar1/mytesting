package inheritance;

public class SingleLevelStudy {

	public static void main(String[] args) {
		//Mother m= new Mother();
	//	m.look();
	//	m.money();
		
		Son s= new Son();
		s.bike();
		s.look();// calling super class property using child class object
		s.money();// calling super class property using child class object
		
		Mother.nature();// calling static method from mother class
		
		Son.laptop();// calling static method from son class
		Son.nature();// using subclass name to call static method from super class
		
		

	}

}
