package mock;

public class Armstrongnumber {

	public static void main(String[] args) {
		int a =371;
		int temp=a;
		int rem;
		int mul=1;
		int arm = 0;
		while(temp!=0) {
			rem=temp%10;
			mul=rem*rem*rem;
			arm=arm+mul;
			
			temp=temp/10;
		}
		if(a==arm) {
			System.out.println("the number is armstrong");
		}
		else {
			System.out.println("the number is not armstrong");
		}

	}

}
