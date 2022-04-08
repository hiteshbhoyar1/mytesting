package mock;

public class Pelindromestring_use {

	public static void main(String[] args) {
		String s="nitin";
		String rev="";
		int len=s.length();
		for(int i=0; i<=len-1; i++) {
			
			rev= s.charAt(i)+rev;
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println(s+" is a pelindrome string");
		}
		else {
			System.out.println(s+" is not a pelindrome string");
		}
	}

}
