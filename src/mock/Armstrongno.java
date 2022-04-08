package mock;

public class Armstrongno {

	public static void main(String[] args) {
		int n= 370;
		int no=n;
		int rem;
		int mul=1;
		int arm=0;
		while(no!=0) {
			rem=no%10;
			System.out.println(rem);
			mul=rem*rem*rem;
			System.out.println(mul);
			arm=arm+mul;
			no=no/10;
				System.out.println(arm);
		}
		if(n==arm) {
			System.out.println("the given number is armstrong");
		}
		else {
			System.out.println("the given number is not an armstrong ");
		}
	}

}
