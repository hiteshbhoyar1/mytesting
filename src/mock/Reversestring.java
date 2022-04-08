package mock;

public class Reversestring {

	public static void main(String[] args) {
		String a="Hitesh";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			char ch=a.charAt(i);
			rev=rev+ch;
			
		}System.out.println(rev);
		System.out.println("==================");
		
		int a1=2564;
		int rem;
		int rev1=0;
		while(a1!=0) {
			rem=a1%10;
			rev1=rev1*10+rem;
			a1=a1/10;
		}
		System.out.println(rev1);
		System.out.println("================");
		int a2=987;
		int rem1;
		int rev2=0;
		while(a2!=0) {
			rem1=a2%10;
			rev2=rev2*10+rem1;
			a2=a2/10;
		}System.out.println(rev2);
		
		System.out.println("=====");
		int a3=121212;
		int rem2;
		int rev3=0;
		while(a3!=0) {
			rem2=a3%10;
			rev3=rev3*10+rem2;
			a3=a3/10;
		}System.out.println(rev3);
		
		//for reverse a number we need to use while loop 
		//the first step is to initialize any num, then declare the remainder
		//then initialize the reverse as 0
		//then use the while loop in the while loop first find out the remainder
		//using the formula num%10 is the formula for remainder 
		//then store that remainder in the reverse number by using the formula rev=rev*10+rem;
		//last use num=num/10 for the updation the while continues upto when the num is equal to zero
		//at last write the print statement outside the for loop 
		
		
		
		
		
		
		
	}

}
