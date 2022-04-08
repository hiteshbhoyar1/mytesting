package mock;

public class Pelindromestring1 {
	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for(int i=0;i<s.length();i++) {
		rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		
		if(s.equals(rev)) {
			System.out.println("the String is pelindrome");
		}
		else System.out.println("the string is not a pelindrome");
	}

}
