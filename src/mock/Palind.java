package mock;

public class Palind {
	public static void main(String[] args) {
		int a=12521;
		int b=a;
		int rem;
		int rev=0;
		while(b!=0) {
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
			
		}System.out.println(rev);
		if(a==rev) {
			System.out.println("the number is palindrome");
		}else System.out.println("the number is not palindrome");
	}

}
