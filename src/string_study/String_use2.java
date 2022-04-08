package string_study;

public class String_use2 {

	public static void main(String[] args) {
		
		String  n = "chandrapur";
		int q = 0;
	
		for(int i=0; i<=n.length()-1;i++) {
			if(n.charAt(i)=='a') {
				q=q+1;
				
				
			}
		}
		System.out.println(q);
	}

}
