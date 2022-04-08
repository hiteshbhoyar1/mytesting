package control_statements;

public class Else_if_study {

	public static void main(String[] args) {
		// if my marks are 
		// =>40---<60 then i am is 2nd class
		// =>60---<75 then i am in 1st class
		// >==75 them i am in distinction
		
		int marks= 80;
		if(marks >40 & marks<60) {
			System.out.println("i am in 2nd class");
		}
		
		else if(marks>=60 & marks<75) {
			System.out.println("i am in 1st class");
		}
		
		else if(marks>=75) {
			System.out.println("i am in distinction");
		}
		
		else {
			System.out.println("i am fail");
		}
	}

}
