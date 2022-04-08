package mock;

public class Demo {

	public static void main(String[] args) {
		int a= 321123;
		int temp=a;
		int rem;
		int mul=0;
		while(temp!=0) {
			rem=temp%10;
			//System.out.println(rem);
			mul=mul*10+rem;
			//System.out.println(mul);
			temp=temp/10;
		//	System.out.println(temp);
		}
		if(a==mul) {
			System.out.println("the number is palindrome");
		}
		else {
			System.out.println("the number is not palindrome");
		}
		
		String b="nitin";
		String rev="";
		
		for(int i=b.length()-1;i>=0;i--) {
			rev=rev+b.charAt(i);
		}
		System.out.println(rev);
		if(b.equals(rev)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("the string is not palindrome"); 
		}
		

	}

}
