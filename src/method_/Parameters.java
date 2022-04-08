package method_;

public class Parameters {

	public static void main(String[] args) {
		Parameters p = new Parameters(); // object created
				p.addition();
				p.addition1(96, 32, 45);
				studentinfo();
				p.studentinfo1("Rahul", 47, 'A', 78.22f);
				p.studentinfo2("Bittu", 74, 'U', 77.85f);
	}
public void addition() {
	int a=20;
	int b=28;
	int c=47;
	int sum=a+b+c;
	System.out.println("the addition is "+sum);
}
public void addition1(int a, int b, int c) {
	int sum= a+b+c;
	System.out.println("the sum is "+sum);
}
public static void studentinfo() {  // non parameterised method 
	String name = "Hitesh";
	int rollnum = 45;
	char grade = 'B';
	float weight = 78.22f;
	System.out.println("==================================");
	System.out.println("the name student is "+name);
	System.out.println("the roll number is "+rollnum);
	System.out.println("the grade is "+grade);
	System.out.println("the weight of student is "+weight);
	
	
}
public void studentinfo1(String name, int rollnum, char grade, float weight) {  // method with parameters
	System.out.println("===========================================");
	System.out.println("the name of student is "+name);
	System.out.println("the roll number is "+rollnum);
	System.out.println("the grade is "+grade);
	System.out.println("the weight of student is "+weight);
}
public void studentinfo2(String name, int rollnum, char grade, float weight) {
	System.out.println("=============================================");
	System.out.println("student name is "+name);
	System.out.println("students roll number is "+rollnum);
	System.out.println("students grade is "+grade);
	System.out.println("students weight is "+weight);
}
}
