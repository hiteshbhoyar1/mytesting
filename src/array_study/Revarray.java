package array_study;

public class Revarray {

	public static void main(String[] args) {
		int[] a={1,2,3,4};
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("==========================");
		int[][] ar= {{1,2,3,4,5,},{1,4,5,7,8},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		for(int j=ar.length-1; j>=0;j--) {
			for(int k=ar.length-1; k>=0;k--) {
				System.out.print(ar[j][k]+ " ");
			}
			System.out.println();
			
		}

	}

}
