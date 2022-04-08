package demo_access;

public class Acc_demo extends access_specifier.AS1 {

	public static void main(String[] args) {
		Acc_demo s= new Acc_demo();
		s.test2();//calling public method from as1 of diff package
		s.test4();//calling protected method from as1 of diff package using inheritance
		
		System.out.println("public variable from as1 of diff package "+s.b);
		System.out.println("protected variable from as1 of diff package "+s.d);

	}

}
