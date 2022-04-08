package polymorphism_study;

public class Overloadingstudy {
	
	public static void main(String[] args) {
		Overloadingstudy os= new Overloadingstudy();
		os.add();
		os.add(25, 41);
		os.add(12.22f, 45.14f);
	}
	public void add() {  //method with zero parameter 
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("the addition is "+sum);
	}
	public void add(int a, int b) {  // method with two parameter
		int sum=a+b;
		System.out.println("the addition is "+sum);
	}
	public void add(float a, float b) {   //method with two parameter
		float sum=a+b;
		System.out.println("the addition is "+sum);
	}

}
