package mock;

public class Test1 {

	
		public static void main (String[]args){

			int a = 515;
			int temp=a;
			int rem=0;
			int rev=0;

			while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;

			temp=temp/10;
			}
			System.out.println(rev);
			if(a==rev)
			{System.out.println("the number is palindrome");
			}
			else{System.out.println("the number is not palindrome");
			}
			}
			}

	


