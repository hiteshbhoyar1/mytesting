package patterns;

public class Practice1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
		System.out.println("*");
		}
		System.out.println("===========");
		for(int i=1;i<=5;i++) {
			System.out.print("*");	
		}
		System.out.println();
		System.out.println("===========");
		
		int star=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star++;	
		}
		System.out.println("=========");
		
		int star1=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star1;j++) {
				System.out.print("*");
			}
			System.out.println();
			star1--;
		}
		System.out.println("=======");
		int star2=1;
		int space=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star2;k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star2++;
		}
		System.out.println("==========");
		
		int star3=5;
		int space1=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star3;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=space1;k++) {
				System.out.print(" ");
			}
			System.out.println();
			space1++;
			star3--;
		}
		System.out.println("========");
	}

}
