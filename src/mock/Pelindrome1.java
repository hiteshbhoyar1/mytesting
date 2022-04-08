package mock;

public class Pelindrome1 {

	public static void main(String[] args) {
		
		int a= 515;
		int temp= a;
		int rev=0;
		int rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(a==rev) {
			System.out.println(a+" is a pelindrome number");
		}
		else {
			System.out.println(a+" is not a pelindrome number");
		}


	}

}
