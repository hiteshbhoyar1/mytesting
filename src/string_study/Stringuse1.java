package string_study;

public class Stringuse1 {
	
	    public static void main(String[] args)
	    {
	        int i1 = 127;
	 
	        int i2 = 127;
	 
	        System.out.println(i1 == i2);
	 
	        int i3 = 128;
	 
	        int i4 = 128;
	 
	        System.out.println(i3 == i4);// this result is false because the limit of the == is 127 only
	    }
	}

