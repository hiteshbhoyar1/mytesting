package array_study;

import java.util.Arrays;


public class ArrayRepeatcount {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,7,5,4,1,6,3,9};
//		String n = Arrays.toString(num);
//		System.out.println(n);
		
		
		for(int i=0;i<num.length;i++) {
			int count=0;
			for(int j=i;j<num.length;j++) {
				
				if(num[i]==num[j]) {
					count=count+1;
				}
			}
			if(count>1) {
			System.out.println(num[i]+" repeating "+count+ " times");}
			
		}
		
	}

}
