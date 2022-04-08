package array_study;

public class Arrayuse {

	public static void main(String[] args) {
		int[] n= {10,-12,52,45,81,-10,-13,15,20,-30,-41,16};
		int sum=0;
		int count=0;
		//sum of positive number
		for(int i=0;i<n.length;i++) {
			 
			if(n[i]>0) {
				sum=sum+n[i];
				count=count+1;
			}
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println("=========================");
        int sum1=0;
        int count1=0;
        //for negative numbers
		for(int j=0;j<n.length;j++) {
			if(n[j]<0) {
				sum1=sum1+n[j];
				count1=count1+1;
				
			}
		}
		System.out.println(sum1);
		System.out.println(count1);
		
		System.out.println("=========================");
        int sum2=0;
        int count2=0;
        //for even positive numbers
		for(int j=0;j<n.length;j++) {
			if(n[j]%2==0&&n[j]>0) {
				sum2=sum2+n[j];
				count2=count2+1;
				
			}
		}
		System.out.println(sum2);
		System.out.println(count2);
		
		System.out.println("=========================");
        int sum3=0;
        int count3=0;
        //for odd positive numbers
		for(int j=0;j<n.length;j++) {
			if(n[j]%2!=0&&n[j]>0) {
				sum3=sum3+n[j];
				count3=count3+1;
				
			}
		}
		System.out.println(sum3);
		System.out.println(count3);
	}

}
