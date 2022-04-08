package array_study;

public class Multidiamensional_arrayuse {

	public static void main(String[] args) {
		int ar[][]= {{10,21,36,21},{20,10,14,21},{14,23,45,22},{12,13,14,21}};
		
		for(int i=0; i<=3;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===============");
		int aa[][]= {{12,11},{10,11},{21,24}};
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print(aa[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
