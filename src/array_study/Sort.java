package array_study;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		String[] a = {"Hitesh","Tanmay","Sanket","Parshu","Amey","Mangesh"};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("============================");
	String[] b= {"retro","old","new","medium","pop","rock"};
	Arrays.sort(b);
	for(int j=b.length-1;j>=0;j--) {
		System.out.println(b[j]);
	}
		
				
		
	}

}
