package mock;

public class Palindrome_use {

	public static void main(String[] args) {
		int no= 131;
		int temp=no;
		int rev=0;
		int rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		if(no==rev) {
			System.out.println(no+" is a pelindrome number");
			
		}
		else {
			System.out.println(no+" is not a pelindrome number");
		}
	}

}
