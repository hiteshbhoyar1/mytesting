package access_specifier;

public class AS2 {

	public static void main(String[] args) {
		AS1 s1= new AS1();
		s1.test1();//calling default variable from as1
		s1.test2();//calling public variable from as1
		s1.test4();//calling protected variable from as1
	//	s1.test3(); we can not call private variable into different class
		
		System.out.println("calling default variable of as1 class "+s1.a);
		System.out.println("calling public variable of as1 class "+s1.b);
		System.out.println("calling protected variable as1 class "+s1.d);
		//System.out.println("calling private variable as1 class "+s1.c);we can not call private variable into differnet class
	}

}
