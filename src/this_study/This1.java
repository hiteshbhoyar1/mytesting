package this_study;

public class This1 extends Super {
	int a=100;
	int b=90;

	public static void main(String[] args) {
		This1 t= new This1();
		t.add();

	}
	public void add() {
		int a=20;
		int sum=10+a; //using local value
		int sum1=this.a+100; //using global value
		int sum2=this.a+a; //using global value a and local value a
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		int sum3=super.a+this.a;// global value of super n global value of subclass
		System.out.println(sum3);
		int sum4=super.b+this.b; //global value of super n global value of subclass
		System.out.println(sum4);
	}

}
