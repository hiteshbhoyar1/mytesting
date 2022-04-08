package exceptions;

public class IndexOutOf {

	public static void main(String[] args) {
		String a="Hitesh";
		try
		{
		char ch = a.charAt(6);
		System.out.println(ch);
		}
		catch (StringIndexOutOfBoundsException e) {
		System.out.println("check the index of the string");
		}
		System.out.println("string exception is handled");
	}

}
