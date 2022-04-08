package mock;

public class Fibonnicci_seriesstudy {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		for(int i=1; i<=10;i++) {
			c=a+b;
			System.out.print(+c+",");
			a=b;
			b=c;
		}
		System.out.println("=========================");
		int j=0;
		int k=1;
		int l;
		for(int p=1;p<=15;p++) {
			l=j+k;
			System.out.print(l+",");
			j=k;
			k=l;
		}
		

	}

}
