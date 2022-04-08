package exceptions;

public class NullPointer {

	public static void main(String[] args) {
		String a= null;
	 try { char ch = a.charAt(2);
	 System.out.println(ch);
	 }
	 catch(NullPointerException e) {
		 System.out.println("can not perform action on null value");
	 }
	 System.out.println("handled");
		
		

	}

}
