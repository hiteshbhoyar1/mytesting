package control_statements;

public class Else_if2 {

	public static void main(String[] args) {
		int marks=52;
		if(marks>=75) {
			System.out.println("the student will pass in distinction");
		}
		else if(marks<75 & marks>=60) {
			System.out.println("the student will pass in first class");
		}
		else if(marks<60 & marks>=52) {
			System.out.println("the student will pass in second class");
		}
		else if(marks<52 & marks>=40) {
			System.out.println("the student will pass in third class");
		}
		else
			System.out.println("the student will fail");
	
	}

}
