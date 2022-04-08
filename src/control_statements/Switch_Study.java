package control_statements;

public class Switch_Study {

	public static void main(String[] args) {
		// if my year is
		//1: i am in 1st year of medical
		//2: i am in 2nd year of medical
		//3: i am in 2nd year of medical
		//4: i am in 4th year of medical 
		// please enter valid number between 1-4---> Default
		
		int year=4;
		
		switch (year) {
		case 1:System.out.println("i am in 1st year of medical");
		break;
		
		case 2: System.out.println("i am in 2nd year of medical");
		break;
		
		case 3: System.out.println("i am in 3rd year of medical");
		break;
		
		case 4: System.out.println("i am in 4th year of medical");
		break;

		default: System.out.println("please enter valid number between 1-4");
		break;
		}
		
	}

}
