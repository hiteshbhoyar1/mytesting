package exceptions;

public class Arithmatic {

	public static void main(String[] args) {
		int a=15;
		int b=3;
		try {
			int div=a/b;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("division is not possible by zero");
		}
		System.out.println("Success");
		

	}

}
