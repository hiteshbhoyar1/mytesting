package mock;

public class Palino {

	public static void main(String[] args) {
		int a=212;
		int temp=a;
		int rev=0;
		int rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			
			temp=temp/10;
		}
		System.out.println(rev);
		if(a==rev) {
			System.out.println("the number is palindrome");
		}
		else {
			System.out.println("the number is not palindrome");
		}

	}

}
