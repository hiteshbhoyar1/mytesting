package patterns;

public class Triangles {

	public static void main(String[] args) {
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=(star+2);
			
		}
	
		int space1=0;
		int star1=9;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++) {
				System.out.print("*");
			}
			System.out.println();
			space1++;
			star1=(star1-2);
		}
		

	}

}
