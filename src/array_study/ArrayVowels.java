package array_study;

public class ArrayVowels {

	public static void main(String[] args) {
		char[] s= {'a','a','e','t','y','u'};
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]=='a'||s[i]=='u'||s[i]=='e') {
				count=count+1;
				
			}
			

	}
		System.out.println(count);
	}
}
