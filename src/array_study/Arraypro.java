package array_study;

import java.util.Arrays;
import java.util.Scanner;

public class Arraypro {

	public static void main(String[] args) {
		int[] num= {-10,-9,8,7,1,4,3,5,-7,-11,-5,-3,-8,-12,-41};
		Arrays.sort(num);
//		Scanner sc= new Scanner(System.in);
//		int n = sc.nextInt();
		System.out.println("highest number in array is "+num[num.length-1]);
		System.out.println("======================");
		int sum=0;
		for(int i=0;i<num.length;i++) {    //for positive number
			if(num[i]>0) {
				sum=sum+num[i];
				
			}
		}
		System.out.println(sum);
		System.out.println("======================");
		
		int sum1=0;
		for(int i=0;i<num.length;i++) {    //for negative number
			if(num[i]<0) {
				sum1=sum1+num[i];
				
			}
		}
		System.out.println(sum1);
System.out.println("======================");
		int count=0;
		int sum2=0;
		for(int i=0;i<num.length;i++) {    //for positive even number
			if(num[i]%2==0&&num[i]>0) {
				sum2=sum2+num[i];
				count=count+1;
			}
		}
		System.out.println(sum2);
		System.out.println(count);
		System.out.println("======================");
		int count1=0;
		int sum3=0;
		for(int i=0;i<num.length;i++) {    //for positive odd number
			if(num[i]%2!=0&&num[i]>0) {
				sum3=sum3+num[i];
				count1=count1+1;
			}
		}
		System.out.println(sum3);
		System.out.println(count1);
		
		
		
	}

}
