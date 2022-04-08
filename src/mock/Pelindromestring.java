package mock;

public class Pelindromestring {

	public static void main(String[] args) {
		String name="maam";
		String rev="";
	    int len= name.length();
	    for(int i=len-1; i>=0;i--) {
	    	rev=rev+name.charAt(i);
	    }
	    if(name.equals(rev)) {
    		System.out.println(name+" is a pelindrome string");
    	}
    	else {
    		System.out.println(name+" is not a pelindrome string");
    	}
	    

	}

}
