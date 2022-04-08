package patterns;

public class Kpattern {

	public static void main(String[] args) {
	int star=5;
	for(int i=1;i<=9;i++) {
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		if(i<5) {
		star--;	
		}
		else {
			star++;
		}
	}
	
	
	int star1=5;
	int space=0;
	for(int i=1;i<=9;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=star1;k++) {
			System.out.print("*");
		}
		System.out.println();
		if(i<5) {
		star1--;	
		space++;
		}
		else {
			star1++;
			space--;
		}
	}
	}

}
