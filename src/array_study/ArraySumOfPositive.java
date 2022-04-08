package array_study;

public class ArraySumOfPositive {

	public static void main(String[] args) {
		int[]n= {10,15,-41,26,-87};
		int count=0;
		int sum=0;
		for(int i=0;i<=n.length-1;i++) {
			if(n[i]>0) {
				sum=sum+n[i];
				count=count+1;
				
			}
		}System.out.println(sum);
		System.out.println(count);
		System.out.println("===========");
		
		int[] a= {12,-51,21,-52,-89,12,41,-54,21,-96,74};
		int sub=0;
		for(int j=0;j<=a.length-1;j++) {
		if(a[j]<0) {
			sub=sub+a[j];
		}
		}
		System.out.println(sub);

	}
	
	
}
