package array_study;

import java.util.Arrays;

public class ArrayHighestNumber {

	public static void main(String[] args) {
		int[]a= {10,25,45,74,98,85,456,1256,4587,6258,120,32,10,20,10,14,10};
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		

	}

}
